package estudos;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class JTableUtil {
    
    public DefaultTableModel geraTabelaCartas(List<Carta> lista) {
        DefaultTableModel resultado = new DefaultTableModel();
        if (lista == null) {
            resultado.addColumn("Erro");
            resultado.addRow(new String[]{"Sem cartas a Exibir"});
        } else {
            resultado.addColumn("Carta");
            resultado.addColumn("Fabricante");
            resultado.addColumn("Nome");
            resultado.addColumn("Pais");
            resultado.addColumn("Potência (CV)");
            resultado.addColumn("Peso (Kg)");
            resultado.addColumn("Vel. Máxima (Km/h)");
            resultado.addColumn("Cilindros");
            resultado.addColumn("Cilindradas");
            resultado.addColumn("Ano de Fabric.");
            for (Carta c: lista) {
                String s[] = {c.getNumero()+ c.getLetra(), c.getCarro().getFabricante(), c.getCarro().getNome(),
                c.getCarro().getPais(), c.getCarro().getPotencia().toString(), c.getCarro().getPeso().toString(),
                c.getCarro().getVelMaxima().toString(),  c.getCarro().getCilindros().toString(), 
                c.getCarro().getCilindradas().toString(), c.getCarro().getAnoFabricacao().toString()};
                resultado.addRow(new String[]{s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8], s[9]});
            }
        }
        return resultado;
    }
    
}
