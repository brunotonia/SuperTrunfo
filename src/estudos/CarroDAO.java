package estudos;

import org.hibernate.Session;

public class CarroDAO {
    
    public Boolean cadastrar(Carro carro)
    {
        try
        {
            Session session = HibernateUtil.getSession();
            session.beginTransaction();
            session.save(carro);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            return false;
        }
    }
    
}
