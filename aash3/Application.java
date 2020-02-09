package aashvik.aash3;

import com.agapsys.agreste.AgresteApplication;
import com.agapsys.web.toolkit.modules.PersistenceModule;
import javax.persistence.EntityManager;
import javax.servlet.annotation.WebListener;

@WebListener
public class Application extends AgresteApplication {

	public static Application getRunningInstance() {
		return (Application) AgresteApplication.getRunningInstance();
	}

	@Override
	public String getName() {
		return Defs.APP_NAME;
	}

	@Override
	public String getVersion() {
		return Defs.APP_VERSION;
	}


	@Override
	protected void afterApplicationStart() {
		super.afterApplicationStart();

		EntityManager em = getModule(PersistenceModule.class).getEntityManager();
		em.getTransaction().begin();

		// Perform database initialization here...

		em.getTransaction().commit();
		em.close();
	}

}
