package ventanasEmpleados;

import java.util.Date;
import sistema.Sistema;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import otros.ConvertirDate_a_String;

public class frmColaMensajes extends javax.swing.JInternalFrame {

    public frmColaMensajes() {
        initComponents();
        btnResponder.setEnabled(false);
        this.cargarTablaMensajes();
    }

    private void cargarTablaMensajes() {
        String[] titulos = {"Fecha", "Asunto", "Cliente DNI"};
        String[][] datos = Sistema.mensajesClientes.obtenerMensajesClientes();
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblMensajes.setModel(modelo);
    }

    private void limpiarCampos() {
        this.lblAsunto.setText("");
        this.lblDniCliente.setText("");
        this.lblFechaEnvio.setText("");
        this.lblMensajeCliente.setText("");
        this.txtMensajeEmpleado.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMensajes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensajeEmpleado = new javax.swing.JTextArea();
        btnResponder = new javax.swing.JButton();
        lblMensajeCliente = new javax.swing.JLabel();
        lblAsunto = new javax.swing.JLabel();
        lblFechaEnvio = new javax.swing.JLabel();
        btnDesencolar = new javax.swing.JButton();
        lblDniCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMensajes.setBackground(new java.awt.Color(204, 255, 204));
        tblMensajes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblMensajes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMensajes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 550, 290));

        txtMensajeEmpleado.setColumns(20);
        txtMensajeEmpleado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMensajeEmpleado.setLineWrap(true);
        txtMensajeEmpleado.setRows(5);
        txtMensajeEmpleado.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtMensajeEmpleado);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 330, 100));

        btnResponder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnResponder.setForeground(new java.awt.Color(0, 0, 0));
        btnResponder.setText("RESPONDER");
        btnResponder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        jPanel1.add(btnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 530, 160, 60));

        lblMensajeCliente.setBackground(new java.awt.Color(204, 255, 204));
        lblMensajeCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMensajeCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMensajeCliente.setOpaque(true);
        jPanel1.add(lblMensajeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 330, 70));

        lblAsunto.setBackground(new java.awt.Color(204, 255, 204));
        lblAsunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAsunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAsunto.setOpaque(true);
        jPanel1.add(lblAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 180, 30));

        lblFechaEnvio.setBackground(new java.awt.Color(204, 255, 204));
        lblFechaEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaEnvio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFechaEnvio.setOpaque(true);
        jPanel1.add(lblFechaEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 180, 30));

        btnDesencolar.setBackground(new java.awt.Color(102, 102, 102));
        btnDesencolar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnDesencolar.setForeground(new java.awt.Color(0, 0, 0));
        btnDesencolar.setText("LEER MENSAJE");
        btnDesencolar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDesencolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 150, 50));

        lblDniCliente.setBackground(new java.awt.Color(204, 255, 204));
        lblDniCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDniCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDniCliente.setOpaque(true);
        jPanel1.add(lblDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 180, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Respuesta:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 90, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Asunto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 80, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 80, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dni cliente:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 80, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Mensaje:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 80, 30));

        jLabel7.setBackground(new java.awt.Color(153, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 38)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("COLA MENSAJES");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 110));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        if (lblAsunto.getText().equals("") || txtMensajeEmpleado.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese una respuesta");
            return;
        }
        String respuestaEmpleado = this.txtMensajeEmpleado.getText();
        Sistema.mensajeActual.setReceptor("Dni Empleado");
        Sistema.mensajeActual.setTextoReceptor(respuestaEmpleado);
        Sistema.mensajeActual.setFechaRecibida(new Date());
        Sistema.mensajeActual.setbRespondido(true);
        Sistema.clienteActual = Sistema.clientes.obtenerClienteDni(this.lblDniCliente.getText());
        Sistema.clienteActual.apilarMensajeRecibido(Sistema.mensajeActual);
        JOptionPane.showMessageDialog(this, "Respuesta registrada con éxito");
        btnDesencolar.setEnabled(true);
        btnResponder.setEnabled(false);
        this.limpiarCampos();
        this.cargarTablaMensajes();
    }//GEN-LAST:event_btnResponderActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed
        Sistema.mensajeActual = Sistema.mensajesClientes.desencolar();
        if (Sistema.mensajeActual != null) {
            this.lblAsunto.setText(Sistema.mensajeActual.getAsunto());
            this.lblFechaEnvio.setText(ConvertirDate_a_String.convertirFecha(Sistema.mensajeActual.getFechaEnviada()));
            this.lblDniCliente.setText(Sistema.mensajeActual.getEmisor());
            this.lblMensajeCliente.setText(Sistema.mensajeActual.getTextoEmisor());
            btnResponder.setEnabled(true);
            btnDesencolar.setEnabled(false);
        }
    }//GEN-LAST:event_btnDesencolarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesencolar;
    private javax.swing.JButton btnResponder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAsunto;
    private javax.swing.JLabel lblDniCliente;
    private javax.swing.JLabel lblFechaEnvio;
    private javax.swing.JLabel lblMensajeCliente;
    private javax.swing.JTable tblMensajes;
    private javax.swing.JTextArea txtMensajeEmpleado;
    // End of variables declaration//GEN-END:variables
}
