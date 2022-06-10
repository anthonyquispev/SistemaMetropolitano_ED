package ventanasEmpleados;

import sistema.Sistema;
import entidades.*;
import javax.swing.JOptionPane;

public class frmRecargarEnTaquilla extends javax.swing.JInternalFrame {

    public frmRecargarEnTaquilla() {
        initComponents();
        cargarComboEstaciones();
        btnAgregarSaldo.setEnabled(false);
    }

    private void cargarComboEstaciones() {
        String[] estaciones = Sistema.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstaciones.addItem(estacion);
        }
    }

    private void actualizarCampos() {
        this.lblNombres.setText(Sistema.clienteActual.getNombres());
        this.lblApellidoPaterno.setText(Sistema.clienteActual.getApellidoPaterno());
        this.lblApellidoMaterno.setText(Sistema.clienteActual.getApellidoMaterno());
        this.cargarTarjetas();
        this.lblSaldo.setText(String.valueOf(Sistema.tarjetaActual.getSaldo()));
        this.btnAgregarSaldo.setEnabled(true);
    }

    private void cargarTarjetas() {
        String[] tarjetas = Sistema.clienteActual.getTarjetas();
        this.cboTarjetas.removeAllItems();
        for (String tarjeta : tarjetas) {
            this.cboTarjetas.addItem(tarjeta);
        }
    }

    private void limpiarCampos() {
        lblNombres.setText("");
        lblApellidoPaterno.setText("");
        lblApellidoMaterno.setText("");
        lblTipoTarjeta.setText("");
        lblSaldo.setText("");
        cboTarjetas.setSelectedIndex(-1);
        this.btnAgregarSaldo.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cboEstaciones = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarSaldo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboTarjetas = new javax.swing.JComboBox<>();
        jRadioButtonIdTarjeta = new javax.swing.JRadioButton();
        jRadioButtonDni = new javax.swing.JRadioButton();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblSaldo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblTipoTarjeta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboMonto = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboEstaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));
        cboEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionesActionPerformed(evt);
            }
        });
        jPanel1.add(cboEstaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 190, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ESTACIÓN:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, 100, 43));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("NOMBRES:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("APELLIDO PATERNO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 150, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("APELLIDO MATERNO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 150, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TIPO DE TARJETA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 160, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("SALDO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 120, 40));

        btnAgregarSaldo.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarSaldo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAgregarSaldo.setForeground(new java.awt.Color(204, 0, 0));
        btnAgregarSaldo.setText("AGREGAR SALDO");
        btnAgregarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 420, 220, 90));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TARJETA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 100, 50));

        cboTarjetas.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));
        cboTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTarjetasActionPerformed(evt);
            }
        });
        jPanel1.add(cboTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 190, 50));

        buttonGroup1.add(jRadioButtonIdTarjeta);
        jRadioButtonIdTarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonIdTarjeta.setSelected(true);
        jRadioButtonIdTarjeta.setText("IDTARJETA");
        jPanel1.add(jRadioButtonIdTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 40));

        buttonGroup1.add(jRadioButtonDni);
        jRadioButtonDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonDni.setText("DNI");
        jPanel1.add(jRadioButtonDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, 40));

        txtBusqueda.setBackground(new java.awt.Color(204, 255, 204));
        txtBusqueda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 130, 40));

        btnBuscar.setBackground(new java.awt.Color(204, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(204, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search_64px.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 220, 60));

        lblSaldo.setBackground(new java.awt.Color(204, 255, 204));
        lblSaldo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblSaldo.setOpaque(true);
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 190, 40));

        lblNombres.setBackground(new java.awt.Color(204, 255, 204));
        lblNombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblNombres.setOpaque(true);
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 190, 40));

        lblApellidoPaterno.setBackground(new java.awt.Color(204, 255, 204));
        lblApellidoPaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoPaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblApellidoPaterno.setOpaque(true);
        jPanel1.add(lblApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 190, 40));

        lblApellidoMaterno.setBackground(new java.awt.Color(204, 255, 204));
        lblApellidoMaterno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidoMaterno.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblApellidoMaterno.setOpaque(true);
        jPanel1.add(lblApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 190, 40));

        lblTipoTarjeta.setBackground(new java.awt.Color(204, 255, 204));
        lblTipoTarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTipoTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoTarjeta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lblTipoTarjeta.setOpaque(true);
        jPanel1.add(lblTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 190, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("MONTO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 80, 40));

        cboMonto.setBackground(new java.awt.Color(102, 102, 0));
        cboMonto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cboMonto.setForeground(new java.awt.Color(0, 0, 0));
        cboMonto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S/. 5.00", "S/. 10.00", "S/. 20.00", "S/. 50.00" }));
        cboMonto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 0)));
        jPanel1.add(cboMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 190, 50));

        jLabel12.setBackground(new java.awt.Color(51, 0, 51));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("RECARGA DE TARJETA");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 0)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSaldoActionPerformed
        if (Sistema.clienteActual != null) {
            double monto = 0.0;
            switch (cboMonto.getSelectedIndex()) {
                case 0:
                    monto = 5.0;
                    break;
                case 1:
                    monto = 10.0;
                    break;
                case 2:
                    monto = 20.0;
                    break;
                case 3:
                    monto = 50.0;
                    break;
            }
            MovimientoTarjeta mov = Sistema.tarjetaActual.recargarTarjeta(monto, Sistema.estacionActual);
            if (Sistema.movimientosTarjeta.agregar(mov)) {
                //Actualizar saldo
                lblSaldo.setText(String.valueOf(Sistema.tarjetaActual.getSaldo()));
                JOptionPane.showMessageDialog(this, "Recarga exitosa");
            }
        }
    }//GEN-LAST:event_btnAgregarSaldoActionPerformed

    private void cboEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionesActionPerformed
        String nombreEstacion = this.cboEstaciones.getSelectedItem().toString();
        Sistema.estacionActual = Sistema.estaciones.getEstacion(nombreEstacion);
    }//GEN-LAST:event_cboEstacionesActionPerformed

    private void cboTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTarjetasActionPerformed
        if (this.cboTarjetas.getSelectedItem() == null) {
            return;
        }
        int idTarjeta = Integer.parseInt(this.cboTarjetas.getSelectedItem().toString());
        Sistema.tarjetaActual = Sistema.clienteActual.getTarjeta(idTarjeta);
        this.lblTipoTarjeta.setText(Sistema.tarjetaActual.getTipo().getNombre());
        this.lblSaldo.setText(String.valueOf(Sistema.tarjetaActual.getSaldo()));
    }//GEN-LAST:event_cboTarjetasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            if (this.txtBusqueda.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Complete el campo búsqueda");
                return;
            }
            String busqueda = this.txtBusqueda.getText();
            if (this.jRadioButtonIdTarjeta.isSelected()) {
                Sistema.clienteActual = Sistema.clientes.obtenerClienteIdTarjeta(Integer.parseInt(busqueda));
            } else if (this.jRadioButtonDni.isSelected()) {
                Sistema.clienteActual = Sistema.clientes.obtenerClienteDni(busqueda);
            }
            if (Sistema.clienteActual != null) {
                actualizarCampos();               
            } else {
                limpiarCampos();                              
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Campo idTarjeta incorrecto");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarSaldo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboEstaciones;
    private javax.swing.JComboBox<String> cboMonto;
    private javax.swing.JComboBox<String> cboTarjetas;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDni;
    private javax.swing.JRadioButton jRadioButtonIdTarjeta;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTipoTarjeta;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
