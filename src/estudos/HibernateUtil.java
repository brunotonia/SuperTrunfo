package estudos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sf;

    public static Session getSession() {
        if (sf == null) {
            Configuration cfg = new Configuration();
            cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            cfg.setProperty("hibernate.connection.username", "bruno");
            cfg.setProperty("hibernate.connection.password", "angra1");
            cfg.setProperty("hibernate.connection.url", "jdbc:postgresql:supertrunfo");
            cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            cfg.setProperty("hibernate.current_session_context_class", "thread");
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.addClass(Carro.class);
            cfg.addClass(Carta.class);
            sf = cfg.buildSessionFactory();
        }
        return sf.getCurrentSession();
    }

    public static void begin() {
        getSession().beginTransaction();
    }

    public static void commit() {
        getSession().getTransaction().commit();
    }

    public static void rollback() {
        getSession().getTransaction().rollback();
    }

}
