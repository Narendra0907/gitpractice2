package SessionObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionObject {

	public static Session sessionObject() {
		AnnotationConfiguration con = new AnnotationConfiguration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		return s;
	}

}
