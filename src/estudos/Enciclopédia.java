package estudos;

import java.util.List;

public class Enciclopédia extends javax.swing.JFrame {

    /* Variáveis de Sessão */
    private List<Carta> listaCartas = null;
    private CartaDAO cartaDAO = new CartaDAO();
    private Principal telaAnterior;
    private String[] categorias = {"Todas", "Nome", "Fabricante", "Pais", "Potência",
        "Peso", "Velocidade Máxima", "Cilindros", "Cilindradas", "Ano de Fabricação",
        "Super Trunfo", "Not Null"};
    private String[] criterios = {"Igual à", "Diferente de", "Maior e igual à", "Maior que",
        "Menor e igual à", "Menor que"};

    private void povoarCboxCategoria() {
        for (String aux : categorias) {
            cboxCategoria.addItem(aux);
            cboxCriterios.setEnabled(false);
        }
    }

    private void povoarCboxCriterios() {
        for (String aux : criterios) {
            cboxCriterios.addItem(aux);
        }
    }

    private void povoarTblCartas() {
        tblCartas.setModel(new JTableUtil().geraTabelaCartas(listaCartas));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super Trunfo - Enciclopédia");

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCartas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTBusca)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboxCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnciclopedia)
                            .addComponent(lblResultados))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusca)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboxCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCategoriaActionPerformed
        // TODO add your handling code here:
        String s = (String) cboxCategoria.getSelectedItem();
        if (s.equals("Todas") || s.equals("Not Null")) {
            cboxCriterios.setEnabled(false);
            txtBusca.setEnabled(false);
        } else {
            cboxCriterios.setEnabled(true);
            txtBusca.setEnabled(true);
        }
    }//GEN-LAST:event_cboxCategoriaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String s = (String) cboxCategoria.getSelectedItem();
        String s2 = "";
        /*{ "Todas", "Nome", "Fabricante", "Pais", "Potência",
        "Peso", "Velocidade Máxima", "Cilindros", "Cilindradas", "Ano de Fabricação",
        "Super Trunfo", "Not Null"};*/
        switch (s) {
            case "Todas":
                listaCartas = cartaDAO.listar();
                povoarTblCartas();
                break;
            case "Nome":
                s2 = (String) cboxCriterios.getSelectedItem();
                switch (s2) {
                    /*{ "Igual à", "Diferente de", "Maior e igual à", "Maior que",
        "Menor e igual à", "Menor que"};*/
                    case "Igual à":
                        listaCartas = cartaDAO.listarEquals("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Diferente de":
                        listaCartas = cartaDAO.listarNotEquals("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Maior e igual à":
                        listaCartas = cartaDAO.listarGreaterEquals("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Maior que":
                        listaCartas = cartaDAO.listarGreaterThen("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Menor e igual à":
                        listaCartas = cartaDAO.listarLessEquals("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                    case "Menor que":
                        listaCartas = cartaDAO.listarLessThen("nome", txtBusca.getText().toUpperCase().toString());
                        break;
                }
                povoarTblCartas();
                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
