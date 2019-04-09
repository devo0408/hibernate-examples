package devo.simple.util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
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
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("There is issue in hibernate util");
            }
        }

        return sessionFactory;
    }

    // https://dzone.com/articles/hibernate-5-xml-configuration-example
    // https://proselyte.net/tutorials/hibernate-tutorial/configure/
    // https://dzone.com/articles/simplified-spring-swagger
    // https://stackoverflow.com/questions/23908606/how-to-use-hibernate-properties-file-instead-of-hibernate-cfg-xml

}
