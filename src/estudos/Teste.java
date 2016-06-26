package estudos;

import java.util.List;

public class Teste {

    public static void main(String args[]) {
        
        /* Lista de CriteriasQuery
            Eq - OK
            Ne - OK
            Gt - OK
            Ge - OK
            Lt - OK
            Le - OK
            iLike  - OK
            Not Null       
        */
        
        List<Carta> lista = new CartaDAO().listarIlike("nome", "919");
        lista = new CartaDAO().listarGreaterThen("potencia", 600.0F);
        lista = new CartaDAO().listarLessThen("cilindros", 12);
        lista = new CartaDAO().listarEquals("cilindros", 12);
        lista = new CartaDAO().listarNotEquals("fabricante", "PORSCHE");
        
        

    }
}
