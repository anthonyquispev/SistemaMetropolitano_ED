package ventanasEmpleados;

import sistema.Sistema;
import entidades.*;
import javax.swing.JOptionPane;

public class frmEmitirTarjeta extends javax.swing.JInternalFrame {

    public frmEmitirTarjeta() {
        initComponents();
        cargarComboEstaciones();
        btnEmitirTarjeta.setEnabled(false);
    }

    private void cargarComboEstaciones() {
        String[] estaciones = Sistema.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstaciones.addItem(estacion);
        }
    }

    private void limpiarCampos() {
        this.txtDni.setText("");
        this.lblNombres.setText("");
        this.lblApellidoPaterno.setText("");
        this.lblApellidoMaterno.setText("");
        this.btnEmitirTarjeta.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cboTipoTarjeta = new javax.swing.JComboBox<>();
        btnEmitirTarjeta = new javax.swing.JButton();
        cboEstaciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombres = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "UNIVERSITARIO", "ESCOLAR" }));
        cboTipoTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel1.add(cboTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 460, 170, 40));

        btnEmitirTarjeta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEmitirTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        btnEmitirTarjeta.setText("EMITIR");
        btnEmitirTarjeta.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 0)));
        btnEmitirTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmitirTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 190, 70));

        cboEstaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        cboEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionesActionPerformed(evt);
            }
        });
        jPanel1.add(cboEstaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 170, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("TIPO DE TARJETA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 130, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRES:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 150, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO PATERNO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 150, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("APELLIDO MATERNO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 150, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("DNI:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 80, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("ESTACIÓN:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subway_100px2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 90, 100, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/metropolitanoTaquilla.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 620, 470));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 340, 20));

        lblNombres.setBackground(new java.awt.Color(0, 204, 204));
        lblNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombres.setOpaque(true);
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 200, 110, 40));

        lblApellidoPaterno.setBackground(new java.awt.Color(0, 204, 204));
        lblApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoPaterno.setOpaque(true);
        jPanel1.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 110, 40));

        lblApellidoMaterno.setBackground(new java.awt.Color(0, 204, 204));
        lblApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoMaterno.setOpaque(true);
        jPanel1.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, 110, 40));

        txtDni.setBackground(new java.awt.Color(204, 255, 204));
        txtDni.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, 110, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 130, 70, 40));

        jLabel8.setBackground(new java.awt.Color(51, 0, 51));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EMITIR TARJETA");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmitirTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirTarjetaActionPerformed

        String tipoTarjeta = this.cboTipoTarjeta.getSelectedItem().toString();
        EnumTipoTarjeta tipo = null;
        switch (tipoTarjeta) {
            case "ESCOLAR":
                tipo = EnumTipoTarjeta.ESCOlAR;
                break;
            case "UNIVERSITARIO":
                tipo = EnumTipoTarjeta.UNIVERSITARIO;
                break;
            case "GENERAL":
                tipo = EnumTipoTarjeta.GENERAL;
                break;
        }
        int codigo = Sistema.clientes.validarCodigo();
        Tarjeta t = Sistema.estacionActual.getTaquilla().emitirTarjeta(tipo, codigo);
        if (Sistema.clienteActual.insertarTarjeta(t)) {
            JOptionPane.showMessageDialog(this, "Tarjeta agregada con éxito");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnEmitirTarjetaActionPerformed

    private void cboEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionesActionPerformed
        String nombreEstacion = this.cboEstaciones.getSelectedItem().toString();
        Sistema.estacionActual = Sistema.estaciones.getEstacion(nombreEstacion);
    }//GEN-LAST:event_cboEstacionesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.txtDni.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de DNI");
        } else {
            String dni = this.txtDni.getText();
            Sistema.clienteActual = Sistema.clientes.obtenerClienteDni(dni);
            if (Sistema.clienteActual != null) {
                this.lblNombres.setText(Sistema.clienteActual.getNombres());
                this.lblApellidoPaterno.setText(Sistema.clienteActual.getApellidoPaterno());
                this.lblApellidoMaterno.setText(Sistema.clienteActual.getApellidoMaterno());
                this.btnEmitirTarjeta.setEnabled(true);
            } else {
                this.limpiarCampos();
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmitirTarjeta;
    private javax.swing.JComboBox<String> cboEstaciones;
    private javax.swing.JComboBox<String> cboTipoTarjeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
