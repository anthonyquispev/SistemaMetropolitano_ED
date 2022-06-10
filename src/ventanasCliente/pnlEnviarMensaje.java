package ventanasCliente;

import sistema.Sistema;
import entidades.*;

import javax.swing.JOptionPane;

public class pnlEnviarMensaje extends javax.swing.JPanel {

    public pnlEnviarMensaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboAsunto = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 0));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMensaje.setBackground(new java.awt.Color(92, 146, 224));
        txtMensaje.setColumns(20);
        txtMensaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(0, 0, 0));
        txtMensaje.setLineWrap(true);
        txtMensaje.setRows(5);
        txtMensaje.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtMensaje);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 340, 170));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENVIAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 110, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Asunto:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 70, 40));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ENVIAR MENSAJE");
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));

        cboAsunto.setBackground(new java.awt.Color(204, 255, 204));
        cboAsunto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboAsunto.setForeground(new java.awt.Color(0, 0, 0));
        cboAsunto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Queja", "Denuncia", "Consulta" }));
        add(cboAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 120, 40));
    }// </editor-fold>//GEN-END:initComponents
    private void limpiarCampos() {
        cboAsunto.setSelectedIndex(0);
        this.txtMensaje.setText("");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ((this.txtMensaje.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            String emisor = Sistema.clienteActual.getDni();
            String asunto = cboAsunto.getSelectedItem().toString();
            String textoEmisor = txtMensaje.getText();
            Mensaje msj = new Mensaje(emisor, asunto, textoEmisor);
            Sistema.clienteActual.apilarMensajeEnviado(msj);
            Sistema.mensajesClientes.encolar(msj);
            JOptionPane.showMessageDialog(null, "Mensaje enviado con éxito");
            this.limpiarCampos();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboAsunto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMensaje;
    // End of variables declaration//GEN-END:variables
}
