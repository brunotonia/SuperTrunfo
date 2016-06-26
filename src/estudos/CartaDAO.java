package estudos;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class CartaDAO {

    public Carta seleciona(Long id) {
        Session session = HibernateUtil.getSession();
        Carta carta = null;
        carta = (Carta) session.load(Carta.class, id);
        session.close();
        return carta;
    }

    public List<Carta> listarIlike(String busca, String valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.ilike(busca, valor, MatchMode.ANYWHERE));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarBiggerThen(String busca, String valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.gt(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarBiggerThen(String busca, Float valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.gt(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarSmallerThen(String busca, String valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.lt(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarSmallerThen(String busca, Float valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.lt(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarSmallerThen(String busca, Integer valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.lt(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarEquals(String busca, String valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.eq(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarEquals(String busca, Float valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.eq(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarEquals(String busca, Integer valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.eq(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }
    
    public List<Carta> listarEquals(String busca, Boolean valor) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Criteria criteriaCarta = session.createCriteria(Carta.class);
        Criteria criteriaCarro = criteriaCarta.createCriteria("carro");
        criteriaCarro.add(Restrictions.eq(busca, valor));
        List<Carta> carroList = criteriaCarta.list();
        // Remover for
        for (Carta c : carroList) {
            System.out.println(c.toString());
        }
        session.close();
        return carroList;
    }

}
