package br.com.calculadora;

/**
 *
 * @author kali
 */
public class calculadorasimples extends javax.swing.JFrame {

    public calculadorasimples() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtNum1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtNum2 = new javax.swing.JTextField();
        jbSomar = new javax.swing.JButton();
        jbSubtrair = new javax.swing.JButton();
        jbDividir = new javax.swing.JButton();
        jbMultiplicar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jlResultado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(381, 435));
        setPreferredSize(new java.awt.Dimension(381, 435));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Calculadora Senac");

        jtNum1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Digite o primeiro número:");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite o segundo número:");

        jtNum2.setBackground(new java.awt.Color(204, 204, 204));

        jbSomar.setBackground(new java.awt.Color(102, 102, 102));
        jbSomar.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jbSomar.setForeground(new java.awt.Color(255, 255, 255));
        jbSomar.setText("+");
        jbSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSomarActionPerformed(evt);
            }
        });

        jbSubtrair.setBackground(new java.awt.Color(102, 102, 102));
        jbSubtrair.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jbSubtrair.setForeground(new java.awt.Color(255, 255, 255));
        jbSubtrair.setText("-");
        jbSubtrair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubtrairActionPerformed(evt);
            }
        });

        jbDividir.setBackground(new java.awt.Color(102, 102, 102));
        jbDividir.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jbDividir.setForeground(new java.awt.Color(255, 255, 255));
        jbDividir.setText("/");
        jbDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDividirActionPerformed(evt);
            }
        });

        jbMultiplicar.setBackground(new java.awt.Color(102, 102, 102));
        jbMultiplicar.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jbMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        jbMultiplicar.setText("X");
        jbMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiplicarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Escolha a operação desejada");

        jlResultado.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jlResultado.setForeground(new java.awt.Color(0, 0, 0));
        jlResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlResultado.setText("0");
        jlResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("O resultado é:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(12, 12, 12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbSomar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbSubtrair)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbDividir)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbMultiplicar))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel6)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSomar)
                    .addComponent(jbSubtrair)
                    .addComponent(jbDividir)
                    .addComponent(jbMultiplicar))
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jlResultado)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 385, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomarActionPerformed
        Float num1 = Float.parseFloat(jtNum1.getText());
        Float num2 = Float.parseFloat(jtNum2.getText());
        Float soma = num1+num2;
        jlResultado.setText(String.valueOf(soma));
    }//GEN-LAST:event_jbSomarActionPerformed

    private void jbSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtrairActionPerformed
        Float num1 = Float.parseFloat(jtNum1.getText());
        Float num2 = Float.parseFloat(jtNum2.getText());
        Float sub = num1-num2;
        jlResultado.setText(String.valueOf(sub));
    }//GEN-LAST:event_jbSubtrairActionPerformed

    private void jbDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDividirActionPerformed
        Float num1 = Float.parseFloat(jtNum1.getText());
        Float num2 = Float.parseFloat(jtNum2.getText());
        Float div = num1/num2;
        jlResultado.setText(String.valueOf(div));
    }//GEN-LAST:event_jbDividirActionPerformed

    private void jbMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicarActionPerformed
        Float num1 = Float.parseFloat(jtNum1.getText());
        Float num2 = Float.parseFloat(jtNum2.getText());
        Float mult = num1*num2;
        jlResultado.setText(String.valueOf(mult));
    }//GEN-LAST:event_jbMultiplicarActionPerformed

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
            java.util.logging.Logger.getLogger(calculadorasimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadorasimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadorasimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadorasimples.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadorasimples().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbDividir;
    private javax.swing.JButton jbMultiplicar;
    private javax.swing.JButton jbSomar;
    private javax.swing.JButton jbSubtrair;
    private javax.swing.JLabel jlResultado;
    private javax.swing.JTextField jtNum1;
    private javax.swing.JTextField jtNum2;
    // End of variables declaration//GEN-END:variables
}
