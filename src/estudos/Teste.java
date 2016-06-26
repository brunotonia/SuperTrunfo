/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author bruno
 */
public class Teste {

    public static void main(String args[]) {
        /*Carta carta = new CartaDAO().seleciona(1L);
        System.out.println("ID: " + carta.getId());
        System.out.println("Carta: " + carta.getNumero() + carta.getLetra());
        System.out.println("Carro: " + carta.getCarro().getNome());*/
        
        List<Carta> lista = new CartaDAO().listarIlike("nome", "919");
        lista = new CartaDAO().listarBiggerThen("potencia", 600.0F);
        

    }
}
