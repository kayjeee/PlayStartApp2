package models;

import java.util.Date;

import javax.persistence.Column;

import org.bson.types.ObjectId;

import models.utils.AppException;
import models.utils.Hash;
import play.Logger;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

import com.google.code.morphia.annotations.Embedded;

import com.google.code.morphia.annotations.Reference;

import controllers.MorphiaObject;
/**
 * User: yesnault
 * Date: 20/01/12
 */
@Entity
public class User{

	@Id
	public ObjectId id;
	
    @Constraints.Required
    @Formats.NonEmpty
    public String email;

    @Constraints.Required
    @Formats.NonEmpty
    public String fullname;

    public String confirmationToken;

    @Constraints.Required
    @Formats.NonEmpty
    public String passwordHash;

    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date dateCreation;

    @Formats.NonEmpty
    public Boolean validated = false;

    /**
     * my MorohiaObject kagso sebogodi find by id
     *
     * @param email email to search
     * @return a user
     * 
     * 
    // -- Queries (long id, user.class)
    public static Model.Finder<Long, User> find = new Model.Finder<Long, User>(Long.class, User.class);

     */
	public static User findbyid(String idTofind) {
		User tofind = MorphiaObject.datastore.find(User.class).field("_id").equal(new ObjectId(idTofind)).get();
		if (tofind != null) {
			Logger.info("foundid: " + tofind);
			MorphiaObject.datastore.delete(tofind);
		} else {
			Logger.debug("ID No Found: " + idTofind);
		}
		return tofind;
	}
	
	   /**
     * Retrieve a user from an email.
     *
     * @param email email to search
     * @return a user
     */
    

	public static User findByEmail( String email) {
		return MorphiaObject.datastore.createQuery(User.class)
				.filter("email", email)
				.get();
	}
    

 
    /**
     * Retrieve a user from a fullname.
     *
     * @param fullname Full name
     * @return a user
     */
    public static User findByFullname(String fullname) {
    	return MorphiaObject.datastore.createQuery(User.class)
				.filter("fullname", fullname)
				.get();}
    /**
     * Retrieves a user from a confirmation token.
     *
     * @param token the confirmation token to use.
     * @return a user if the confirmation token is found, null otherwise.
     */
    public static User findByConfirmationToken(String token) {
    	return MorphiaObject.datastore.find(User.class)
				.filter("confirmationoken", token)
				.get();}

    /**
     * Authenticate a User, from a email and clear password.
     *
     * @param email         email
     * @param clearPassword clear password
     * @return User if authenticated, null otherwise
     * @throws AppException App Exception
     */
    public static User authenticate(String email, String clearPassword) throws AppException {

        // get the user with email only to keep the salt password
    	

        User user =  MorphiaObject.datastore.find(User.class)
				.filter("email", email)
				.get();
        if (user != null) {
            // get the hash password from the salt + clear password
            if (Hash.checkPassword(clearPassword, user.passwordHash)) {
              return user;
            }
        }
        return null;
    }

    public void changePassword(String password) throws AppException {
        this.passwordHash = Hash.createPassword(password);
       
        this.save(null);
    }

    public void save(User user) {
		// TODO Auto-generated method stub
    	MorphiaObject.datastore.save(user);
	}

	/**
     * Confirms an account.
     *
     * @return true if confirmed, false otherwise.
     * @throws AppException App Exception
     */
    public static boolean confirm(User user) throws AppException {
        if (user == null) {
          return false;
        }

        user.confirmationToken = null;
        user.validated = true;
        user.save(user);
        return true;
    }

}
