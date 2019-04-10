package devo.simple.util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                ServiceRegistry serviceRegistry
                        = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                configuration.addAnnotatedClass(devo.simple.data.Student.class);

                configuration.addAnnotatedClass(devo.associative.manytoone.Company.class);
                configuration.addAnnotatedClass(devo.associative.manytoone.Developer.class);

                configuration.addAnnotatedClass(devo.associative.onetoone.Manager.class);
                configuration.addAnnotatedClass(devo.associative.onetoone.Contact.class);

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("There is issue in hibernate util");
            }
        }

        return sessionFactory;
    }

}
