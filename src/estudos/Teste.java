/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos;

import java.util.List;

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
        lista = new CartaDAO().listarSmallerThen("cilindros", 12);
        lista = new CartaDAO().listarEquals("cilindros", 12);
        

    }
}
