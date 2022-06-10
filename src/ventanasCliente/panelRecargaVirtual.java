package ventanasCliente;

import sistema.Sistema;
import entidades.*;
import javax.swing.JOptionPane;

public class panelRecargaVirtual extends javax.swing.JPanel {

    public panelRecargaVirtual() {
        initComponents();
        this.cargarTarjetas();
        this.cargarSaldoActual();
    }

    private void cargarSaldoActual() {
        double saldo = Sistema.tarjetaActual.getSaldo();
        this.lblSaldoActual.setText(String.valueOf(saldo));
    }

    private void cargarTarjetas() {
        String[] tarjetas = Sistema.clienteActual.getTarjetas();
        for (String tarjeta : tarjetas) {
            this.cboTarjetas.addItem(tarjeta);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRecargar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboMonto = new javax.swing.JComboBox<>();
        cboTarjetas = new javax.swing.JComboBox<>();
        lblSaldoActual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRecargar.setBackground(new java.awt.Color(102, 102, 102));
        btnRecargar.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        btnRecargar.setForeground(new java.awt.Color(255, 255, 255));
        btnRecargar.setText("RECARGAR");
        btnRecargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 150, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Saldo actual:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 110, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Monto:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Tarjeta:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 100, 40));

        cboMonto.setBackground(new java.awt.Color(204, 255, 204));
        cboMonto.setForeground(new java.awt.Color(0, 0, 0));
        cboMonto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S/. 5.00", "S/. 10.00", "S/. 20.00", "S/. 50.00" }));
        add(cboMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 150, 40));

        cboTarjetas.setBackground(new java.awt.Color(204, 255, 204));
        cboTarjetas.setForeground(new java.awt.Color(0, 0, 0));
        cboTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTarjetasActionPerformed(evt);
            }
        });
        add(cboTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 150, 40));

        lblSaldoActual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSaldoActual.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoActual.setText("0.00");
        add(lblSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cell_phone_100px.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 80, 100));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RECARGA VIRTUAL");
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed

        double monto = 0.0;
        switch (cboMonto.getSelectedIndex()) {
            case 0:
                monto = 5.0; break;               
            case 1:
                monto = 10.0; break;               
            case 2:
                monto = 20.0; break;               
            case 3:
                monto = 50.0; break;               
        }

        MovimientoTarjeta mov
                = Sistema.tarjetaActual.recargarTarjeta(monto, Sistema.estacionActual);

        if (Sistema.movimientosTarjeta.agregar(mov)) {
            cargarSaldoActual();
            JOptionPane.showMessageDialog(this, "Recarga exitosa");
        }
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void cboTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTarjetasActionPerformed
        String codigo = this.cboTarjetas.getSelectedItem().toString();
        Sistema.tarjetaActual = Sistema.clienteActual.getTarjeta(Integer.parseInt(codigo));
        cargarSaldoActual();
    }//GEN-LAST:event_cboTarjetasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecargar;
    private javax.swing.JComboBox<String> cboMonto;
    private javax.swing.JComboBox<String> cboTarjetas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblSaldoActual;
    // End of variables declaration//GEN-END:variables
}
