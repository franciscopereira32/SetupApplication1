/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utils.Cmd;
//import static com.sun.deploy.util.ReflectionUtil.getClass;
//import com.sun.javafx.scene.control.skin.Utils;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;

/**
 *
 * @author Francisco / Luiz
 */
public class Planeta extends javax.swing.JFrame {

   // public String up;
    
    
    private String senha = "123";

    /**
     * Creates new form Planeta
     */
    ButtonGroup bG;
    public static Integer up;
    
    public Planeta() {
        initComponents();
        painel_secundario.setVisible(false);
         
        //setActionListener();
        
    }
    
    public void imagemIcon(){
        ImageIcon img = new ImageIcon(getClass().getResource("M7SPlus.jpg"));
            
        label1.setIcon(img);
       }
    
    public void imagemIcon2(){
        
        ImageIcon gif = new ImageIcon(getClass().getResource("tenor_1.gif"));
        label_gif.setIcon(gif);
    }
    
    public void imagemIcon1(){
        ImageIcon img = new ImageIcon(getClass().getResource("m73gplus.jpg"));
                
        label1.setIcon(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_primario = new javax.swing.JPanel();
        btn_combo1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        label_titulo1 = new javax.swing.JLabel();
        btn_verificar = new javax.swing.JToggleButton();
        label1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_setup = new javax.swing.JToggleButton();
        txt_senha = new javax.swing.JPasswordField();
        painel_secundario = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rb_imei = new javax.swing.JRadioButton();
        rb_atualizacao = new javax.swing.JRadioButton();
        btn_download = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        rb_setup = new javax.swing.JRadioButton();
        label_gif = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_deleta = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel_primario.setBackground(new java.awt.Color(255, 255, 255));
        painel_primario.setToolTipText("test");

        btn_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma das opções", "M7S PLUS", "M7 3G PLUS", "Item 3", "Item 4" }));
        btn_combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_combo1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel1.setText("Modelo");

        label_titulo1.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 36)); // NOI18N
        label_titulo1.setText("Setup de Linha");

        btn_verificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_verificar.setText("Verificar");
        btn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarActionPerformed(evt);
            }
        });

        label1.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/multilaser.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setText("Senha:");

        btn_setup.setText("Setup");
        btn_setup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_primarioLayout = new javax.swing.GroupLayout(painel_primario);
        painel_primario.setLayout(painel_primarioLayout);
        painel_primarioLayout.setHorizontalGroup(
            painel_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_primarioLayout.createSequentialGroup()
                .addGroup(painel_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_primarioLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btn_combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_primarioLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btn_verificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(painel_primarioLayout.createSequentialGroup()
                .addGroup(painel_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_primarioLayout.createSequentialGroup()
                        .addGroup(painel_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painel_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painel_primarioLayout.createSequentialGroup()
                                    .addGap(155, 155, 155)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painel_primarioLayout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel1)))
                            .addGroup(painel_primarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_setup, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_primarioLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(label_titulo1)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        painel_primarioLayout.setVerticalGroup(
            painel_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_primarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo1)
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_primarioLayout.createSequentialGroup()
                        .addComponent(btn_combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                        .addComponent(btn_verificar))
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(painel_primarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btn_setup, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painel_secundario.setBackground(new java.awt.Color(255, 255, 255));
        painel_secundario.setForeground(new java.awt.Color(255, 255, 255));

        label_titulo.setFont(new java.awt.Font("Source Sans Pro Semibold", 1, 36)); // NOI18N
        label_titulo.setText("Setup de Linha");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/multilaser.png"))); // NOI18N

        rb_imei.setText("IMEI/SN");
        rb_imei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_imeiActionPerformed(evt);
            }
        });

        rb_atualizacao.setText("Atualização");

        btn_download.setText("Download");
        btn_download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_downloadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Posto ");

        rb_setup.setText("Setup completo");
        rb_setup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_setupActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Excluir setup anterior ");

        btn_deleta.setForeground(new java.awt.Color(255, 0, 0));
        btn_deleta.setText("Deletar");
        btn_deleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_secundarioLayout = new javax.swing.GroupLayout(painel_secundario);
        painel_secundario.setLayout(painel_secundarioLayout);
        painel_secundarioLayout.setHorizontalGroup(
            painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_secundarioLayout.createSequentialGroup()
                .addGroup(painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painel_secundarioLayout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(rb_imei)
                                    .addGap(45, 45, 45)
                                    .addGroup(painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painel_secundarioLayout.createSequentialGroup()
                                            .addComponent(rb_atualizacao)
                                            .addGap(34, 34, 34)
                                            .addComponent(rb_setup))
                                        .addComponent(btn_download, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painel_secundarioLayout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addGroup(painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btn_deleta)
                                                .addComponent(jLabel2)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_secundarioLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_titulo)
                                    .addGap(36, 36, 36)))
                            .addGroup(painel_secundarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painel_secundarioLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(label_gif, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_secundarioLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel7)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        painel_secundarioLayout.setVerticalGroup(
            painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_secundarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label_titulo)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_deleta)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(painel_secundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_atualizacao)
                    .addComponent(rb_imei)
                    .addComponent(rb_setup))
                .addGap(27, 27, 27)
                .addComponent(btn_download)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_gif, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_secundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painel_primario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_secundario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painel_primario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_combo1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_combo1ActionPerformed

    private void btn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarActionPerformed
        if(btn_combo1.getSelectedItem().equals("Selecione uma das opções")){
            JOptionPane.showMessageDialog(null, "Opção invalida!", null, WIDTH);
        }
        if(btn_combo1.getSelectedItem().equals("M7S PLUS")){
            imagemIcon();
            label_titulo1.setText("M7S PLUS");
            label_titulo.setText("M7S PLUS");
            up = 1;           
        }
        if(btn_combo1.getSelectedItem().equals("M7 3G PLUS")){
            imagemIcon1();
            label_titulo.setText("M7 3G PLUS");
            label_titulo1.setText("M7 3G PLUS");
            up = 2;
            String x = "teste";
        }
    }//GEN-LAST:event_btn_verificarActionPerformed

    private void btn_setupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setupActionPerformed
            if(new String(txt_senha.getPassword()).equals(senha)){
                if((btn_combo1.getSelectedItem().equals("M7S PLUS")) || (btn_combo1.getSelectedItem().equals("M7 3G PLUS"))){
                    painel_primario.setVisible(false);
                    painel_secundario.setVisible(true);
                    CardLayout card = (CardLayout)painel_secundario.getLayout();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Modelo não cadastrado!");
                }
            }
            else{
                    JOptionPane.showMessageDialog(null, "Senha incorreta!");
                }
    }//GEN-LAST:event_btn_setupActionPerformed
    
    /*private void stringMultithread() throws IOException {
        //String devices = Cmd.getValue("adb devices");

        ArrayList<String> myList;
        myList = new ArrayList<String>(Arrays.asList(devices.split("\n")));
        deviceList = new ArrayList<String>();
        myList.remove(0);
        numberDevices = myList.size();
        for(String T: myList){
            deviceList.add(T.replace("device", ""));
            }
    }*/
    
    private void rb_setupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_setupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_setupActionPerformed

    private void btn_downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_downloadActionPerformed
        imagemIcon2();
        try {
            Cmd.CriarDiretorio(btn_download.getActionCommand());
        } catch (IOException ex) {
            Logger.getLogger(Planeta.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }//GEN-LAST:event_btn_downloadActionPerformed

    private void rb_imeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_imeiActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_rb_imeiActionPerformed

    private void btn_deletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletaActionPerformed
        try {
            // TODO add your handling code here:
            Cmd.DeletarDiretorio(btn_deleta.getActionCommand());
        } catch (IOException ex) {
            Logger.getLogger(Planeta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deletaActionPerformed
    
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
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planeta().setVisible(true);
            }
        });
    }
    
    private void createRadioGroup() {
        bG = new ButtonGroup();
        
        bG.add(rb_imei);
        bG.add(rb_atualizacao);
        bG.add(rb_setup);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btn_combo1;
    private javax.swing.JToggleButton btn_deleta;
    private javax.swing.JToggleButton btn_download;
    private javax.swing.JToggleButton btn_setup;
    private javax.swing.JToggleButton btn_verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label_gif;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo1;
    private javax.swing.JPanel painel_primario;
    private javax.swing.JPanel painel_secundario;
    private javax.swing.JRadioButton rb_atualizacao;
    private javax.swing.JRadioButton rb_imei;
    private javax.swing.JRadioButton rb_setup;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}

