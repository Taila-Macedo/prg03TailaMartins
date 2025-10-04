/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade04.view;

/**
 *
 * @author Taila
 */
public class genio extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(genio.class.getName());

    /**
     * Creates new form genio
     */
    public genio() {
        initComponents();
        confSpinner();
        
        lblInstrução.setText("<html>Estou pensando em um número de 1 a 5.<br> Tente adivinhar qual é<html>");
    }
    
    private void confSpinner(){
        
        // Cria um modelo de números de 0 a 5.
        javax.swing.SpinnerNumberModel model = new javax.swing.SpinnerNumberModel(0, 0, 5, 1);
        // Define o modelo para o componente spinner.
        spnVal.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        spnVal = new javax.swing.JSpinner();
        Palpite = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblInstrução = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Valor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 295, 55, 30));
        getContentPane().add(spnVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        Palpite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Palpite.setText("Palpite");
        Palpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(Palpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/atividade04/images/genio1-.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 228, -1));

        lblInstrução.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInstrução.setText("A frase aparecerá aqui");
        getContentPane().add(lblInstrução, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblFrase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/atividade04/images/fala__1.png"))); // NOI18N
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 321, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalpiteActionPerformed
        // Pega o número que o usuário escolheu.
        int pal = (Integer) spnVal.getValue();
        // Sorteia um número de 1 a 5.
        int num = (int) (Math.random() * 5) + 1;
        
        if(num == pal){
            lblInstrução.setText("ACERTOU!");

        }else{
            lblInstrução.setText("ERROU! Pensei no valor " + num);
        }
 
    }//GEN-LAST:event_PalpiteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(() -> new genio().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Palpite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JLabel lblInstrução;
    private javax.swing.JSpinner spnVal;
    // End of variables declaration//GEN-END:variables
}
