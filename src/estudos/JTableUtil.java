package estudos;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class JTableUtil {
    
    public DefaultTableModel geraTabelaCartas(List<Carta> lista) {
        DefaultTableModel resultado = new DefaultTableModel();
        if (lista.isEmpty()) {
            resultado.addColumn("Erro");
            resultado.addRow(new String[]{"Sem cartas a Exibir"});
        } else {
            resultado.addColumn("ID");
            resultado.addColumn("Carta");
            resultado.addColumn("Fabricante");
            resultado.addColumn("Nome");
         
            for (Carta c: lista) {
                String s[] = {c.getId().toString(), c.getNumero()+ c.getLetra(), c.getCarro().getFabricante(), c.getCarro().getNome()};
                resultado.addRow(new String[]{s[0], s[1], s[2], s[3]});
            }
        }
        return resultado;
    }
    
}
