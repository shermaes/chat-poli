/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poli.clientechat.view;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta clase controla toda la interfaz de usuario del cliente.
 * 
 */
public class JFrameChatClient extends javax.swing.JFrame {
    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    public static final String CLOSING_ORDER = "Chao";    
    /**
     * Creates new form JFrameChatClient
     */
    public JFrameChatClient() {
        initComponents();
        setTitle("Cliente Chat");
        jTextAreaInbox.setEditable(false);
        setLocationRelativeTo(null);
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
        jTextFieldMessage = new javax.swing.JTextField();
        jButtonSend = new javax.swing.JButton();
        jTextFieldIp = new javax.swing.JTextField();
        jTextFieldPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonConnect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInbox = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSend.setText("Enviar");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });

        jTextFieldIp.setText("localhost");

        jTextFieldPort.setText("9000");

        jLabel1.setText("Dirección IP del servidor:");

        jLabel2.setText("Puerto del servidor:");

        jButtonConnect.setText("Conectar");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jTextAreaInbox.setColumns(20);
        jTextAreaInbox.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInbox);

        jLabel3.setText("Nombre de usuario:");

        jTextFieldUsername.setText("poli00x");

        jLabel4.setText("Para:");

        jTextFieldTo.setText("poli00y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldMessage)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSend)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonConnect)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTo)))))
                        .addGap(118, 118, 118))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConnect)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSend))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Este método controla la lógica necesaria para el envío de mensajes hacia el servidor de chat una vez se haga click en el botón "Enviar".
     * @param evt el evento disparado al hacer click en el botón.
     */
    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
        try {
            int messageType = 0;
            String username = this.jTextFieldUsername.getText();
            String message = this.jTextFieldMessage.getText();
            String to = this.jTextFieldTo.getText();
            if(message.equalsIgnoreCase(CLOSING_ORDER))
                messageType = 3;
            else
                messageType = 2;
            String content = String.format("%d|%s|%s|%s", messageType, username, message, to);            
            dataOutputStream.writeUTF(content);
            if(messageType == 3){
                closeEverything(socket, dataInputStream, dataOutputStream);
                enableConfigInterface();
                disableMessageInterface();
                JOptionPane.showMessageDialog(this, "Has abandonado el servidor de chat.", "Información", JOptionPane.INFORMATION_MESSAGE);           
            }
            this.jTextAreaInbox.append(String.format("Tú: %s", message) + "\n");
            this.jTextFieldMessage.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Imposible conectar con el servidor.", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(JFrameChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSendActionPerformed
    /**
     * Este método controla la lógica para establecer la conexión del cliente con el servidor de chat desde el botón "Conectar".
     * Una vez disparado el evento de click se genera el hilo principal para conectarse al servidor y recibi los mensajes.
     * @param evt el evento disparado al hacer click en el botón.
     */
    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        try {
            this.socket = new Socket(this.jTextFieldIp.getText(), Integer.parseInt(this.jTextFieldPort.getText()));
            this.dataOutputStream = new DataOutputStream(this.socket.getOutputStream());
            this.dataInputStream = new DataInputStream(this.socket.getInputStream());
            this.dataOutputStream.writeUTF(String.format("1|%s|%s|%s", this.jTextFieldUsername.getText(), this.jTextFieldUsername.getText(), "Servidor"));
            Thread listeningThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    String incomingMessage = "";
                    enableMessageInterface();
                    disableConfigInterface();
                    try {
                        while (socket.isConnected()) {
                            incomingMessage = dataInputStream.readUTF();                           
                            jTextAreaInbox.append(incomingMessage + "\n");
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            });
            listeningThread.start();            
            JOptionPane.showMessageDialog(null, "Conexión establecida.", "Información", JOptionPane.INFORMATION_MESSAGE);           
        } catch (IOException ex) {
            Logger.getLogger(JFrameChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConnectActionPerformed
    /**
     * Este método activa los controles de interfaz de usuario necesarios para configurar una conexión con el servidor (dirección IP, puerto, nombre de usuario y botón para conectar).
     */
    private void enableConfigInterface(){
        if(!this.jTextFieldIp.isEnabled())
            this.jTextFieldIp.setEnabled(true);
        if(!this.jTextFieldPort.isEnabled())
            this.jTextFieldPort.setEnabled(true);
        if(!this.jTextFieldUsername.isEnabled())
            this.jTextFieldUsername.setEnabled(true);
        if(!this.jButtonConnect.isEnabled())
            this.jButtonConnect.setEnabled(true);
    }
    /**
     * Este método desactiva los controles de interfaz de usuario necesarios para configurar una conexión con el servidor (dirección IP, puerto, nombre de usuario y botón para conectar).
     */
    private void disableConfigInterface(){
        if(this.jTextFieldIp.isEnabled())
            this.jTextFieldIp.setEnabled(false);
        if(this.jTextFieldPort.isEnabled())
            this.jTextFieldPort.setEnabled(false);
        if(this.jTextFieldUsername.isEnabled())
            this.jTextFieldUsername.setEnabled(false);
        if(this.jButtonConnect.isEnabled())
            this.jButtonConnect.setEnabled(false);
    }
    /**
     * Este método activa los controles de interfaz de usuario necesarios para enviar y recibir mensajes (campo de texto de mensaje, campo de texto para destinatario y botón para enviar).
     */
    private void enableMessageInterface(){
        if(!this.jTextFieldMessage.isEnabled())
            this.jTextFieldMessage.setEnabled(true);
        if(!this.jButtonSend.isEnabled())
            this.jButtonSend.setEnabled(true);
        if(!this.jTextFieldTo.isEnabled())
            this.jTextFieldTo.setEnabled(true);
    }
    /**
     * Este método desactiva los controles de interfaz de usuario necesarios para enviar y recibir mensajes (campo de texto de mensaje, campo de texto para destinatario y botón para enviar).
     */
    private void disableMessageInterface(){
        if(this.jTextFieldMessage.isEnabled())
            this.jTextFieldMessage.setEnabled(false);
        if(this.jButtonSend.isEnabled())
            this.jButtonSend.setEnabled(false);
        if(this.jTextFieldTo.isEnabled())
            this.jTextFieldTo.setEnabled(false);
    }
    /**
     * Cierra de forma adecuada los flujos de entrada/salida de datos y el socket de conexión con el servidor.
     * @param socket el socket TCP de conexión.
     * @param dataInputStream el flujo de entrada de datos.
     * @param dataOutputStream el flujo de salida de datos.
     */
    public void closeEverything(Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
        try {
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            Logger.getLogger(JFrameChatClient.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(JFrameChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameChatClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInbox;
    private javax.swing.JTextField jTextFieldIp;
    private javax.swing.JTextField jTextFieldMessage;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldTo;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}