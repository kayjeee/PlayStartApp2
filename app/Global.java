
import java.net.UnknownHostException;

import play.GlobalSettings;
import play.Logger;

import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

import play.Application;
import play.Play;
import java.net.UnknownHostException;

import play.GlobalSettings;
import play.Logger;
import play.Configuration;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

import controllers.MorphiaObject;

public class Global extends GlobalSettings {

	@Override
	public void onStart(play.Application arg0) {
		super.beforeStart(arg0);
		Logger.debug("** onStart **"); 
		Configuration config = Configuration.root().getConfig("jongo");
 String test = config.getString("mongodb");
		try {
			MorphiaObject.mongo = new Mongo("test", 27017);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	      
        
     
		MorphiaObject.morphia = new Morphia();
		MorphiaObject.datastore = MorphiaObject.morphia.createDatastore(MorphiaObject.mongo, "test");
		MorphiaObject.datastore.ensureIndexes();   
		MorphiaObject.datastore.ensureCaps();  

		Logger.debug("** Morphia datastore: " + MorphiaObject.datastore.getDB());
	}
}
