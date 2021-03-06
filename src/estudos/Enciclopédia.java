package estudos;

import java.util.List;
import javax.swing.JOptionPane;

public class Enciclopédia extends javax.swing.JFrame {

    /* Variáveis de Sessão */
    private List<Carta> lista = null;
    private final CartaDAO cartaDAO = new CartaDAO();
    private Principal telaAnterior;
    private final String[] categorias = {"Todas", "Nome", "Fabricante", "Pais", "Potência",
        "Peso", "Velocidade Máxima", "Cilindros", "Cilindradas", "Ano de Fabricação",
        "Super Trunfo", "Not Null"};
    private final String[] criterios = {"Igual à", "Diferente de", "Maior e igual à", "Maior que",
        "Menor e igual à", "Menor que", "Parecido com"};
    private Principal principal = null;

    private void povoarCboxCategoria() {
        for (String aux : categorias) {
            cboxCategoria.addItem(aux);
        }
    }

    private void povoarCboxCriterios() {
        for (String aux : criterios) {
            cboxCriterios.addItem(aux);
        }
    }

    private void povoarTblCartas() {
        tblCartas.setModel(new JTableUtil().geraTabelaCartas(lista));
        if (lista != null) {
            tblCartas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblCartas.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblCartas.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblCartas.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblCartas.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblCartas.getColumnModel().getColumn(5).setPreferredWidth(55);
            tblCartas.getColumnModel().getColumn(6).setPreferredWidth(65);
            tblCartas.getColumnModel().getColumn(7).setPreferredWidth(50);
            tblCartas.getColumnModel().getColumn(8).setPreferredWidth(65);
            tblCartas.getColumnModel().getColumn(9).setPreferredWidth(65);
        } else {

        }
        tblCartas.setColumnSelectionAllowed(false);
    }

    /**
     * Creates new form Enciclopédia
     */
    public Enciclopédia() {
        initComponents();
        povoarCboxCategoria();
        povoarCboxCriterios();
    }

    public Enciclopédia(Principal principal) {
        initComponents();
        povoarCboxCategoria();
        povoarCboxCriterios();
        this.principal = principal;
        principal.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnciclopedia = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        cboxCategoria = new javax.swing.JComboBox<>();
        cboxCriterios = new javax.swing.JComboBox<>();
        lblTBusca = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblResultados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCartas = new javax.swing.JTable();
        btnVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Super Trunfo - Enciclopédia");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblEnciclopedia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEnciclopedia.setText("Enciclopédia");

        lblCategoria.setText("Categoria");

        cboxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCategoriaActionPerformed(evt);
            }
        });

        lblTBusca.setText("Tipo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblResultados.setText("Resultados");

        tblCartas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tblCartas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCartasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCartas);

        btnVisualizar.setText("Visualizar Carta");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoria)
                            .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTBusca)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboxCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnciclopedia)
                            .addComponent(lblResultados))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVisualizar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEnciclopedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(lblTBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboxCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar))
                    .addComponent(txtBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCategoriaActionPerformed
        // TODO add your handling code here:
        String s = (String) cboxCategoria.getSelectedItem();
        //if (s.equals("Todas") || s.equals("Not Null") || s.equals("Super Trunfo")) {
       
        
        if (s.equals("Todas") || s.equals("Not Null") || s.equals("Super Trunfo")) {
             txtBusca.setEnabled(false);
             cboxCriterios.setEnabled(false);
            if (s.equals("Not Null")) {
                JOptionPane.showMessageDialog(null, "Critérios de busca aceitos: \n\'nome\', \'fabricante\', \'potencia\', ", "Aviso", 1);
                txtBusca.setEnabled(true);
            }
        } else {
            cboxCriterios.setEnabled(true);
            txtBusca.setEnabled(true);
        }

    }//GEN-LAST:event_cboxCategoriaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String s = (String) cboxCategoria.getSelectedItem();
        String s2 = "";
        /*{"Potência", "Peso", "Velocidade Máxima", "Cilindros", "Cilindradas", "Ano de Fabricação",
        "Super Trunfo", "Not Null"};*/
        switch (s) {
            case "Todas":
                lista = cartaDAO.listar();
                break;
            case "Not Null":
                s2 = txtBusca.getText();
                lista = cartaDAO.listarNotNull(s2);
                break;
            case "Super Trunfo":
                lista = cartaDAO.listarEqualsCarta("supertrunfo", true);
                break;
            case "Nome":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Parecido com":
                        lista = cartaDAO.listarIlike("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                }
                break;
            case "Fabricante":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("fabricante", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("fabricante", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("fabricante", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("fabricante", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("fabricante", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("fabricante", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Parecido com":
                        lista = cartaDAO.listarIlike("fabricante", txtBusca.getText().toUpperCase().toString());
                        break;
                }
                break;
            case "Pais":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("pais", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("pais", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("pais", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("pais", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("pais", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("pais", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Parecido com":
                        lista = cartaDAO.listarIlike("pais", txtBusca.getText().toUpperCase().toString());
                        break;
                }
                break;
            case "Potência":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("potencia", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("potencia", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("potencia", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("potencia", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("potencia", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("potencia", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Parecido com":
                        lista = null;
                        JOptionPane.showMessageDialog(null, "Critério \"" + s2 + "\" não pode ser utilizado para\ncomparar a categoria \"" + s + "\"", "Aviso", 1);
                        break;
                }
                break;
            case "Peso":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("peso", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("peso", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("peso", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("peso", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("peso", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("peso", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Parecido com":
                        lista = null;
                        JOptionPane.showMessageDialog(null, "Critério \"" + s2 + "\" não pode ser utilizado para\ncomparar a categoria \"" + s + "\"", "Aviso", 1);
                        break;
                }
                break;
            case "Velocidade Máxima":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("velMaxima", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("velMaxima", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("velMaxima", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("velMaxima", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("velMaxima", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("velMaxima", new Float(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Parecido com":
                        lista = null;
                        JOptionPane.showMessageDialog(null, "Critério \"" + s2 + "\" não pode ser utilizado para\ncomparar a categoria \"" + s + "\"", "Aviso", 1);
                        break;
                }
                break;
            case "Cilindros":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("cilindros", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("cilindros", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("cilindros", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("cilindros", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("cilindros", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("cilindros", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Parecido com":
                        lista = null;
                        JOptionPane.showMessageDialog(null, "Critério \"" + s2 + "\" não pode ser utilizado para\ncomparar a categoria \"" + s + "\"", "Aviso", 1);
                        break;
                }
                break;
            case "Cilindradas":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("cilindradas", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("cilindradas", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("cilindradas", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("cilindradas", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("cilindradas", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("cilindradas", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Parecido com":
                        lista = null;
                        JOptionPane.showMessageDialog(null, "Critério \"" + s2 + "\" não pode ser utilizado para\ncomparar a categoria \"" + s + "\"", "Aviso", 1);
                        break;
                }
                break;
            case "Ano de Fabricação":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    case "Igual à":
                        lista = cartaDAO.listarEquals("anoFabricacao", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Diferente de":
                        lista = cartaDAO.listarNotEquals("anoFabricacao", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior e igual à":
                        lista = cartaDAO.listarGreaterEquals("anoFabricacao", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Maior que":
                        lista = cartaDAO.listarGreaterThen("anoFabricacao", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor e igual à":
                        lista = cartaDAO.listarLessEquals("anoFabricacao", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Menor que":
                        lista = cartaDAO.listarLessThen("anoFabricacao", new Integer(txtBusca.getText().toUpperCase().toString()));
                        break;
                    case "Parecido com":
                        lista = null;
                        JOptionPane.showMessageDialog(null, "Critério \"" + s2 + "\" não pode ser utilizado para\ncomparar a categoria \"" + s + "\"", "Aviso", 1);
                        break;
                }
                break;
        }
        povoarTblCartas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblCartasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCartasMouseClicked

    }//GEN-LAST:event_tblCartasMouseClicked

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        // TODO add your handling code here:
        Integer i = tblCartas.getSelectedRow();
        if (i != -1) {
            Carta c = lista.get(i);
            System.out.println(c.toString());
            new CartaExibir(this, c).setVisible(true);
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        principal.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enciclopédia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enciclopédia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> cboxCategoria;
    private javax.swing.JComboBox<String> cboxCriterios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEnciclopedia;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JLabel lblTBusca;
    private javax.swing.JTable tblCartas;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
}
