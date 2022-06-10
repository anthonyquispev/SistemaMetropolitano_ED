package ventanasEmpleados;

import sistema.Sistema;
import entidades.*;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

public class frmMostrarMovimientos extends javax.swing.JInternalFrame {

    private String estInicial = "Naranjal";
    private String estFinal = "Naranjal";

    public frmMostrarMovimientos() {
        initComponents();
        cargarComboEstacionTaquilla();
        cargarComboEstacionInicial();
        cargarComboEstacionFinal();
    }

    private void cargarComboEstacionTaquilla() {
        String[] estaciones = Sistema.estaciones.getNombresConEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionTaquilla.addItem(estacion);
        }
    }

    private void cargarComboEstacionInicial() {
        String[] estaciones = Sistema.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionInicial.addItem(estacion);
        }
    }

    private void cargarComboEstacionFinal() {
        String[] estaciones = Sistema.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionFinal.addItem(estacion);
        }
    }

    private void cargarTablaRecargas() {
        String[] titulos = {"Nombres", "CódigoTarjeta", "Fecha", "Monto"};
        String[][] datos = Sistema.movimientosTarjeta.getDatosRecargasEstacion(Sistema.estacionActual.getNombre());
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblRecargas.setModel(modelo);
    }

    private void cargarTablaViajes() {
        String[] titulos = {"Nombres", "CódigoTarjeta", "Hora inicio", "Hora fin", "TipoBus"};
        String[][] datos = Sistema.movimientosViaje.getDatosViajesEstaciones(estInicial, estFinal);
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblViajes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboEstacionTaquilla = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        lblMontoTotal = new javax.swing.JLabel();
        lblNumeroTarjetasEmitidas = new javax.swing.JLabel();
        lblMontoRecaudadoTarjetas = new javax.swing.JLabel();
        lblNumeroDeViajes = new javax.swing.JLabel();
        lblMontoRecaudadoViajes = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNumeroDeRecargas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlMovimientos = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecargas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblViajes = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cboEstacionFinal = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboEstacionInicial = new javax.swing.JComboBox<>();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setText("Número de tarjetas emitidas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("Monto recaudado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setText("Número de viajes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 120, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setText("Monto recaudado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 120, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setText("Monto total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 108, 50));

        cboEstacionTaquilla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboEstacionTaquilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionTaquillaActionPerformed(evt);
            }
        });
        jPanel1.add(cboEstacionTaquilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 160, 40));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, 50));

        lblMontoTotal.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblMontoTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMontoTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        jPanel1.add(lblMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 50, 50));

        lblNumeroTarjetasEmitidas.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblNumeroTarjetasEmitidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroTarjetasEmitidas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        jPanel1.add(lblNumeroTarjetasEmitidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 50, 50));

        lblMontoRecaudadoTarjetas.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblMontoRecaudadoTarjetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMontoRecaudadoTarjetas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        jPanel1.add(lblMontoRecaudadoTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 50, 50));

        lblNumeroDeViajes.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblNumeroDeViajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroDeViajes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        jPanel1.add(lblNumeroDeViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 50, 50));

        lblMontoRecaudadoViajes.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblMontoRecaudadoViajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMontoRecaudadoViajes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        jPanel1.add(lblMontoRecaudadoViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 50, 50));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setText("Número de recargas:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 50));

        lblNumeroDeRecargas.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        lblNumeroDeRecargas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumeroDeRecargas.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(51, 0, 51)));
        jPanel1.add(lblNumeroDeRecargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, 50));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setText("ESTACIÓN DE RECARGAS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 600));

        pnlMovimientos.setLayout(new java.awt.CardLayout());

        jPanel3.setLayout(new java.awt.BorderLayout());

        tblRecargas.setBackground(new java.awt.Color(204, 255, 204));
        tblRecargas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblRecargas.setForeground(new java.awt.Color(0, 0, 0));
        tblRecargas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRecargas);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlMovimientos.add(jPanel3, "Recargas");

        jPanel4.setLayout(new java.awt.BorderLayout());

        tblViajes.setBackground(new java.awt.Color(204, 255, 204));
        tblViajes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblViajes.setForeground(new java.awt.Color(0, 0, 0));
        tblViajes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblViajes);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pnlMovimientos.add(jPanel4, "Viajes");

        getContentPane().add(pnlMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 129, 890, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Recargas");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 130, 60));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jRadioButton2.setText("Viajes");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 120, 60));

        cboEstacionFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboEstacionFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionFinalActionPerformed(evt);
            }
        });
        getContentPane().add(cboEstacionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 150, 50));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ESTACIÓN FINAL:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 130, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ESTACIÓN INICIAL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 130, 50));

        cboEstacionInicial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboEstacionInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionInicialActionPerformed(evt);
            }
        });
        getContentPane().add(cboEstacionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 150, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboEstacionTaquillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionTaquillaActionPerformed
        String nombreEstacion = this.cboEstacionTaquilla.getSelectedItem().toString();
        Sistema.estacionActual = Sistema.estaciones.getEstacion(nombreEstacion);
        this.cargarDatos();
        this.cargarTablaRecargas();
    }//GEN-LAST:event_cboEstacionTaquillaActionPerformed
    private void cargarDatos() {
        Taquilla taq = Sistema.estacionActual.getTaquilla();
        this.lblNumeroDeRecargas.setText(String.valueOf(taq.getnRecargas()));
        this.lblNumeroTarjetasEmitidas.setText(String.valueOf(taq.getnTarjetasEmitidas()));
        this.lblMontoRecaudadoTarjetas.setText(String.valueOf(taq.getMontoRecaudadoRecargas()));
        this.lblNumeroDeViajes.setText(String.valueOf(taq.getnViajes()));
        this.lblMontoRecaudadoViajes.setText(String.valueOf(taq.getMontoRecaudadoViajes()));
        this.lblMontoTotal.setText(String.valueOf(taq.getMontoRecaudadoRecargas() + taq.getMontoRecaudadoViajes()));
    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        ((CardLayout) pnlMovimientos.getLayout()).show(pnlMovimientos, "Recargas");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ((CardLayout) pnlMovimientos.getLayout()).show(pnlMovimientos, "Viajes");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void cboEstacionFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionFinalActionPerformed
        this.estFinal = this.cboEstacionFinal.getSelectedItem().toString();
        this.cargarTablaViajes();
    }//GEN-LAST:event_cboEstacionFinalActionPerformed

    private void cboEstacionInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionInicialActionPerformed
        this.estInicial = this.cboEstacionInicial.getSelectedItem().toString();
        this.cargarTablaViajes();
    }//GEN-LAST:event_cboEstacionInicialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboEstacionFinal;
    private javax.swing.JComboBox<String> cboEstacionInicial;
    private javax.swing.JComboBox<String> cboEstacionTaquilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMontoRecaudadoTarjetas;
    private javax.swing.JLabel lblMontoRecaudadoViajes;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblNumeroDeRecargas;
    private javax.swing.JLabel lblNumeroDeViajes;
    private javax.swing.JLabel lblNumeroTarjetasEmitidas;
    private javax.swing.JPanel pnlMovimientos;
    private javax.swing.JTable tblRecargas;
    private javax.swing.JTable tblViajes;
    // End of variables declaration//GEN-END:variables
}
