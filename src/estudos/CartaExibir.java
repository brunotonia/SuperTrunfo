package estudos;

import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class CartaExibir extends javax.swing.JFrame {
    
    private Enciclopédia enciclopedia = null;
    private Carta carta = null;
    
    private void carregaCarta() {
        lblCabecalho.setText(carta.getNumero() + carta.getLetra() + " - " + 
                carta.getCarro().getFabricante() + " " + carta.getCarro().getNome());
        lblFabricante.setText(carta.getCarro().getFabricante());
        lblNome.setText(carta.getCarro().getNome());
        lblPais.setText(carta.getCarro().getPais());
        lblPotencia.setText(carta.getCarro().getPotencia().toString());
        lblPeso.setText(carta.getCarro().getPeso().toString());
        lblVelocidade.setText(carta.getCarro().getVelMaxima().toString());
        lblCilindros.setText(carta.getCarro().getCilindros().toString());
        lblCilindradas.setText(carta.getCarro().getCilindradas().toString());
        lblAno.setText(carta.getCarro().getAnoFabricacao().toString());
        lblImg.setIcon(new ImageIcon(carta.getCarro().getEnderecoImagem()));
        lblST.setVisible(carta.getSupertrunfo());
    }

    /**
     * Creates new form ExibeCarta
     */
    public CartaExibir() {
        initComponents();
    }
    
    public CartaExibir(Enciclopédia enciclopédia, Carta carta) {
        this.enciclopedia = enciclopédia;
        this.carta = carta;
        this.enciclopedia.setEnabled(false);
        initComponents();
        carregaCarta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCabecalho = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        lblFabricante = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        lblCV = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblKg = new javax.swing.JLabel();
        lblVel = new javax.swing.JLabel();
        lblVelocidade = new javax.swing.JLabel();
        lblKmh = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCilindros = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCilindradas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblST = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Super Trunfo - Carta");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblCabecalho.setText("0X - Fabricante Modelo");

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/IMG1.PNG"))); // NOI18N

        label1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        label1.setText("Fabricante");

        label2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        label2.setText("Modelo");

        lblFabricante.setText("Fabricante");

        lblNome.setText("Modelo");

        label3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        label3.setText("País");

        lblPais.setText("País");

        label4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        label4.setText("Potência");

        lblPotencia.setText("Potência");

        lblCV.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCV.setText("CV");

        label5.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        label5.setText("Peso");

        lblPeso.setText("Peso");

        lblKg.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblKg.setText("kg");

        lblVel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblVel.setText("Velocidade Máxima");

        lblVelocidade.setText("Velocidade");

        lblKmh.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblKmh.setText("km/h");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setText("Cilindros");

        lblCilindros.setText("Cilindros");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setText("Cilindradas");

        lblCilindradas.setText("Cilindradas");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel4.setText("Ano de Fabricação");

        lblAno.setText("Ano");

        lblST.setForeground(new java.awt.Color(255, 0, 0));
        lblST.setText("Super Trunfo");
        lblST.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCabecalho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblST))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1)
                                    .addComponent(label2)
                                    .addComponent(label3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4)
                            .addComponent(label5)
                            .addComponent(lblVel)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAno)
                                    .addComponent(lblCilindradas)
                                    .addComponent(lblCilindros)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVelocidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblKmh))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPeso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblKg))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPotencia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCV))
                                    .addComponent(lblPais)
                                    .addComponent(lblNome)
                                    .addComponent(lblFabricante))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCabecalho)
                    .addComponent(lblST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPotencia)
                    .addComponent(lblCV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(lblKg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidade)
                    .addComponent(lblKmh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCilindros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCilindradas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        enciclopedia.setEnabled(true);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CartaExibir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartaExibir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartaExibir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartaExibir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartaExibir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCV;
    private javax.swing.JLabel lblCabecalho;
    private javax.swing.JLabel lblCilindradas;
    private javax.swing.JLabel lblCilindros;
    private javax.swing.JLabel lblFabricante;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblKg;
    private javax.swing.JLabel lblKmh;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblST;
    private javax.swing.JLabel lblVel;
    private javax.swing.JLabel lblVelocidade;
    // End of variables declaration//GEN-END:variables
}
