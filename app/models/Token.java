package models;

import models.utils.Mail;
import play.Configuration;
import play.Logger;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import play.i18n.Messages;


import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Reference;

import controllers.MorphiaObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Nullable;

/**
 * @author wsargent
 * @since 5/15/12
 */

public class Token  {
    // Reset tokens will expire after a day.
    private static final int EXPIRATION_DAYS = 1;

    public enum TypeToken {
        password("reset"), email("email");
        private String urlPath;

        TypeToken(String urlPath) {
            this.urlPath = urlPath;
        }

    }
    
    @Constraints.Required
    @Formats.NonEmpty
	public ObjectId id;
   
    public String token;
    
    @Reference
    public User Id;
	
     @Constraints.Required
    @Formats.NonEmpty
    public String userId;
    
    @Constraints.Required
    public TypeToken type;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date dateCreation;

    @Constraints.Required
    @Formats.NonEmpty
    public String email;

    // -- Queries
    //@SuppressWarnings("unchecked")
   // public static Model.Finder<String, Token> find = new Finder(String.class, Token.class);


	public static Token findbyid(String idTofind) {
		Token tofind = MorphiaObject.datastore.find(Token.class).field("_id").equal(new ObjectId(idTofind)).get();
		if (tofind != null) {
			Logger.info("foundid: " + tofind);
			MorphiaObject.datastore.delete(tofind);
		} else {
			Logger.debug("ID No Found: " + idTofind);
		}
		return tofind;
	}
    /**
     * Retrieve a token by id and type.
     *  public static Token findByTokenAndType(String token, TypeToken type) {
        return find.where().eq("token", token).eq("type", type).findUnique();
   
    }
     * @param token token Id
     * @param type  type of token
     * @return a resetToken
     */
   
    public static Token findByTokenAndType( String token,TypeToken type) {
		return MorphiaObject.datastore.createQuery(Token.class)
				.filter("token", token)
				.filter("type", type)
				.get();
	}
    

    /**
     * @return true if the reset token is too old to use, false otherwise.
     */
    public boolean isExpired() {
        return dateCreation != null && dateCreation.before(expirationTime());
    }

    /**
     * @return a date before which the password link has expired.
     */
    private Date expirationTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, -EXPIRATION_DAYS);
        return cal.getTime();
    }

    /**
     * Return a new Token.
     *
     * @param user  user
     * @param type  type of token
     * @param email email for a token change email
     * @return a reset token
     */
    private static Token getNewToken(User user, TypeToken type, String email) {
        Token token = new Token();
        token.token = UUID.randomUUID().toString();
        token.id = user.id;
        token.type = type;
        token.email = email;
        token.save();
        return token;
    }
    private void save() {
		// TODO Auto-generated method stub
    	MorphiaObject.datastore.save(token);
	}
    /**
     * Send the Email to confirm ask new password.
     *
     * @param user the current user
     * @throws java.net.MalformedURLException if token is wrong.
     */
    public static void sendMailResetPassword(User user) throws MalformedURLException {
        sendMail(user, TypeToken.password, null);
    }

    /**
     * Send the Email to confirm ask new password.
     *
     * @param user  the current user
     * @param email email for a change email token
     * @throws java.net.MalformedURLException if token is wrong.
     */
    public static void sendMailChangeMail(User user, @Nullable String email) throws MalformedURLException {
        sendMail(user, TypeToken.email, email);
    }

    /**
     * Send the Email to confirm ask new password.
     *
     * @param user  the current user
     * @param type  token type
     * @param email email for a change email token
     * @throws java.net.MalformedURLException if token is wrong.
     */
    private static void sendMail(User user, TypeToken type, String email) throws MalformedURLException {

        Token token = getNewToken(user, type, email);
        String externalServer = Configuration.root().getString("server.hostname");

        String subject = null;
        String message = null;
        String toMail = null;

        // Should use reverse routing here.
        String urlString = urlString = "http://" + externalServer + "/" + type.urlPath + "/" + token.token;
        URL url = new URL(urlString); // validate the URL

        switch (type) {
            case password:
                subject = Messages.get("mail.reset.ask.subject");
                message = Messages.get("mail.reset.ask.message", url.toString());
                toMail = user.email;
                break;
            case email:
                subject = Messages.get("mail.change.ask.subject");
                message = Messages.get("mail.change.ask.message", url.toString());
                toMail = token.email; // == email parameter
                break;
        }

        Logger.debug("sendMailResetLink: url = " + url);
        Mail.Envelop envelop = new Mail.Envelop(subject, message, toMail);
        Mail.sendMail(envelop);
    }
	
	public static void delete(String idToDelete) {
		Token toDelete = MorphiaObject.datastore.find(Token.class).field("_id").equal(new ObjectId(idToDelete)).get();
		if (toDelete != null) {
			Logger.info("toDelete: " + toDelete);
			MorphiaObject.datastore.delete(toDelete);
		} else {
			Logger.debug("ID No Found: " + idToDelete);
		}
	}
	

}