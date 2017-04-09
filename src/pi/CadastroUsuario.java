/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Crawlers
 */
public class CadastroUsuario extends javax.swing.JDialog {

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        initComponents();
        this.setModal(true);
        this.setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/Imagens/dolar.gif");  
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(imagemTitulo);
        this.setTitle("SoftMoney - Cadastro do Usuário");
    }

    private CadastroUsuario(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nometext = new javax.swing.JTextField();
        senhatext = new javax.swing.JPasswordField();
        repetirsenhatext = new javax.swing.JPasswordField();
        emailtext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        setIconImages(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Repetir senha:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("E-mail:");

        nometext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nometextActionPerformed(evt);
            }
        });

        emailtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 204, 0));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nometext))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(emailtext))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(senhatext, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(repetirsenhatext, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nometext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhatext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repetirsenhatext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nometextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nometextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nometextActionPerformed

    private void emailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        if(nometext.getText().isEmpty() && senhatext.getText().isEmpty() && repetirsenhatext.getText().isEmpty() && emailtext.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Preencha os Campos!","Aviso",JOptionPane.WARNING_MESSAGE);
            nometext.requestFocus();
        }else if(nometext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha seu nome!","Aviso",JOptionPane.WARNING_MESSAGE);
            nometext.requestFocus();
        }else if(senhatext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha sua senha!","Aviso",JOptionPane.WARNING_MESSAGE);
            senhatext.requestFocus();
        }else if(repetirsenhatext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Re-digite a senha!","Aviso",JOptionPane.WARNING_MESSAGE);
            repetirsenhatext.requestFocus();
        }else if(emailtext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha seu e-mail!","Aviso",JOptionPane.WARNING_MESSAGE);
            emailtext.requestFocus();
        }else if(senhatext.getText().equals(repetirsenhatext.getText())){
                Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
                Matcher m = p.matcher(emailtext.getText());
                if(!m.find()){
                    JOptionPane.showMessageDialog(null, "Digite um E-mail válido","E-mail inválido",JOptionPane.WARNING_MESSAGE);
                }else{
                        String nome = nometext.getText();
                        String repetirSenha = repetirsenhatext.getText();
                        String email = emailtext.getText();
                        
                        Conexao verificaUser = new Conexao();
                        verificaUser.abrirConexao();
                        verificaUser.rs = null;
                        
                        try {
                        verificaUser.st = verificaUser.con.createStatement();
                        PreparedStatement st = verificaUser.con.prepareStatement("SELECT * FROM users WHERE nome = ?");
                        st.setString(1, nome);
                        verificaUser.rs = st.executeQuery();
                        
                        if(verificaUser.rs.next()){
                            JOptionPane.showMessageDialog(null, "Usuário já cadastrado...Tente novamente!","Aviso",JOptionPane.WARNING_MESSAGE);
                            nometext.setText(null);
                            nometext.requestFocus();
                        }else{
                            Cadastros cadastroUsuario = new Cadastros();
                            cadastroUsuario.cadastroUsuario(nome, repetirSenha, email);
                            
                            int resposta = JOptionPane.showConfirmDialog(null,"Deseja cadastrar uma Renda Inicial agora?","Aviso",JOptionPane.YES_NO_OPTION);
                            if(resposta == JOptionPane.YES_OPTION){
                            CadastroRendaInicial renda = new CadastroRendaInicial();
                            renda.show();
                            this.dispose();
                            }else if(resposta == JOptionPane.NO_OPTION){
                            this.dispose();
                            }
                        }
                    } catch (SQLException | HeadlessException e) {
                    }
                    }
        }else{
            JOptionPane.showMessageDialog(null, "As senhas não conferem!","Aviso", JOptionPane.WARNING_MESSAGE);
            repetirsenhatext.requestFocus();
            }                         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    nometext.setText(null);
    senhatext.setText(null);
    repetirsenhatext.setText(null);
    emailtext.setText(null);
    nometext.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroUsuario dialog = new CadastroUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nometext;
    private javax.swing.JPasswordField repetirsenhatext;
    private javax.swing.JPasswordField senhatext;
    // End of variables declaration//GEN-END:variables
}
