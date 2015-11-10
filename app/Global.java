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
		try {
			Configuration config = Configuration.root().getConfig("jongo");
			String host = config.getString("mongodb.host");
			   int port = config.getInt("mongodb.port");
			   String uri =config.getString("mongodb.uri");
			   System.out.print(port);
			   System.out.print(uri);
			   System.out.print(host);
			MorphiaObject.mongo = new Mongo("bqy2ypsy7p7mn4l-mongodb.services.clever-cloud.com",port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		Configuration config = Configuration.root().getConfig("jongo");
	      
     
     
		MorphiaObject.morphia = new Morphia();
		MorphiaObject.datastore = MorphiaObject.morphia.createDatastore(MorphiaObject.mongo, "test");
		MorphiaObject.datastore.ensureIndexes();   
		MorphiaObject.datastore.ensureCaps();  

		Logger.debug("** Morphia datastore: " + MorphiaObject.datastore.getDB());
	}
}

