
import java.net.UnknownHostException;

import play.GlobalSettings;
import play.Logger;

import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
<<<<<<< HEAD
import play.Application;
import play.Play;
=======
>>>>>>> b18da6a30a0f15856c217d8239d4fdafaebac676
import controllers.MorphiaObject;

public class Global extends GlobalSettings {

	@Override
	public void onStart(play.Application arg0) {
		super.beforeStart(arg0);
		Logger.debug("** onStart **"); 
		try {
<<<<<<< HEAD
		MorphiaObject.mongo = new Mongo(Play.application().configuration().getString("mongodb"));
=======
			MorphiaObject.mongo = new Mongo(Play.application().configuration().getString("application.mongodb");
>>>>>>> b18da6a30a0f15856c217d8239d4fdafaebac676
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
