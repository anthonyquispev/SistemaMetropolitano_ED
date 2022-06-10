package ventanasCliente;

import sistema.Sistema;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

public class panelTablas extends javax.swing.JPanel {

    public panelTablas() {
        initComponents();
        this.cargarTarjetas();
        this.actualizarCampos();
        this.cargarDatos();

    }

    private void actualizarCampos() {
        cargarTablaRecargas();
        cargarTablaViajes();
        cargarSaldoActual();
    }

    private void cargarDatos() {
        String nombreCompleto;
        nombreCompleto = Sistema.clienteActual.getNombres();
        nombreCompleto += " ";
        nombreCompleto += Sistema.clienteActual.getApellidoPaterno();
        nombreCompleto += " ";
        nombreCompleto += Sistema.clienteActual.getApellidoMaterno();
        lblNombres.setText(nombreCompleto);
    }

    private void cargarTarjetas() {
        String[] tarjetas = Sistema.clienteActual.getTarjetas();
        for (String tarjeta : tarjetas) {
            this.cboTarjetas.addItem(tarjeta);
        }
    }

    private void cargarTablaRecargas() {
        String[] titulos = {"Estacion", "Fecha", "Monto"};
        String[][] datos = Sistema.movimientosTarjeta.getDatosRecargasTarjeta(Sistema.tarjetaActual.getIdTarjeta());
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblRecargas.setModel(modelo);
    }

    private void cargarTablaViajes() {
        String[] titulos = {"Fecha", "EstacionInicial", "EstacionFinal"};
        String[][] datos = Sistema.movimientosViaje.getDatosIdTarjeta(Sistema.tarjetaActual.getIdTarjeta());
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblViajes.setModel(modelo);
    }

    private void cargarSaldoActual() {
        double saldo = Sistema.tarjetaActual.getSaldo();
        this.lblSaldo.setText(String.valueOf(saldo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        cboTarjetas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jRadioButtonRecargas = new javax.swing.JRadioButton();
        jRadioButtonViajes = new javax.swing.JRadioButton();
        pnlMovimientos = new javax.swing.JPanel();
        pnlUltimasRecargas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecargas = new javax.swing.JTable();
        pnlUltimosViajes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViajes = new javax.swing.JTable();
        etiquetaNombres = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboTarjetas.setBackground(new java.awt.Color(204, 255, 204));
        cboTarjetas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboTarjetas.setForeground(new java.awt.Color(0, 0, 0));
        cboTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTarjetasActionPerformed(evt);
            }
        });
        add(cboTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("SALDO ACTUAL");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 110, 30));

        lblSaldo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("0.00");
        lblSaldo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 0, 51), null));
        add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 70, 40));

        jRadioButtonRecargas.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup.add(jRadioButtonRecargas);
        jRadioButtonRecargas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonRecargas.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonRecargas.setSelected(true);
        jRadioButtonRecargas.setText("Recargas");
        jRadioButtonRecargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRecargasActionPerformed(evt);
            }
        });
        add(jRadioButtonRecargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jRadioButtonViajes.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup.add(jRadioButtonViajes);
        jRadioButtonViajes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonViajes.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonViajes.setText("Viajes");
        jRadioButtonViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonViajesActionPerformed(evt);
            }
        });
        add(jRadioButtonViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        pnlMovimientos.setBackground(new java.awt.Color(0, 102, 102));
        pnlMovimientos.setPreferredSize(new java.awt.Dimension(422, 403));
        pnlMovimientos.setLayout(new java.awt.CardLayout());

        pnlUltimasRecargas.setForeground(new java.awt.Color(0, 0, 0));
        pnlUltimasRecargas.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 102));

        tblRecargas.setBackground(new java.awt.Color(204, 255, 204));
        tblRecargas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblRecargas.setForeground(new java.awt.Color(0, 0, 0));
        tblRecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estación", "Fecha", "Monto"
            }
        ));
        jScrollPane1.setViewportView(tblRecargas);

        pnlUltimasRecargas.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlMovimientos.add(pnlUltimasRecargas, "Recargas");

        pnlUltimosViajes.setForeground(new java.awt.Color(0, 0, 0));
        pnlUltimosViajes.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBackground(new java.awt.Color(0, 102, 102));

        tblViajes.setBackground(new java.awt.Color(204, 255, 204));
        tblViajes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblViajes.setForeground(new java.awt.Color(0, 0, 0));
        tblViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "EstaciónInicial", "EstaciónFinal"
            }
        ));
        jScrollPane2.setViewportView(tblViajes);

        pnlUltimosViajes.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pnlMovimientos.add(pnlUltimosViajes, "Viajes");

        add(pnlMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 420, 230));

        etiquetaNombres.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        etiquetaNombres.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNombres.setText("Cliente:");
        add(etiquetaNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 30));

        lblNombres.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 260, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 270, 20));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ÚLTIMOS MOVIMIENTOS");
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonRecargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRecargasActionPerformed
        ((CardLayout) pnlMovimientos.getLayout()).show(pnlMovimientos, "Recargas");
    }//GEN-LAST:event_jRadioButtonRecargasActionPerformed

    private void jRadioButtonViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonViajesActionPerformed
        ((CardLayout) pnlMovimientos.getLayout()).show(pnlMovimientos, "Viajes");
    }//GEN-LAST:event_jRadioButtonViajesActionPerformed

    private void cboTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTarjetasActionPerformed
        String codigo = this.cboTarjetas.getSelectedItem().toString();
        Sistema.tarjetaActual = Sistema.clienteActual.getTarjeta(Integer.parseInt(codigo));
        this.actualizarCampos();
    }//GEN-LAST:event_cboTarjetasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> cboTarjetas;
    private javax.swing.JLabel etiquetaNombres;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButtonRecargas;
    private javax.swing.JRadioButton jRadioButtonViajes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel pnlMovimientos;
    private javax.swing.JPanel pnlUltimasRecargas;
    private javax.swing.JPanel pnlUltimosViajes;
    private javax.swing.JTable tblRecargas;
    private javax.swing.JTable tblViajes;
    // End of variables declaration//GEN-END:variables
}
