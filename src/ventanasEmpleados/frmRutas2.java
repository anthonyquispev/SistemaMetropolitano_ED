package ventanasEmpleados;

import sistema.Sistema;
import otros.GrafoRutas;

public class frmRutas2 extends javax.swing.JInternalFrame {

    public frmRutas2() {
        initComponents();
        cargarComboEstacionInicial();
        cargarComboEstacionFinal();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboEstacionInicial = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboEstacionFinal = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextArea();
        btnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ESTACIÓN INICIAL:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 130, 40));

        cboEstacionInicial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(cboEstacionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, 150, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ESTACIÓN FINAL:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 130, 40));

        cboEstacionFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(cboEstacionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, 150, 40));

        txtReporte.setBackground(new java.awt.Color(204, 255, 204));
        txtReporte.setColumns(20);
        txtReporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtReporte.setForeground(new java.awt.Color(0, 0, 0));
        txtReporte.setRows(5);
        jScrollPane3.setViewportView(txtReporte);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 230, 270, 130));

        btnMostrar.setBackground(new java.awt.Color(204, 0, 51));
        btnMostrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 51), null));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, 150, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grafoB.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 1240, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        String a = cboEstacionInicial.getSelectedItem().toString();
        String b = cboEstacionFinal.getSelectedItem().toString();
        String reporte = GrafoRutas.rutas(a, b);
        txtReporte.setText(reporte);
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboEstacionFinal;
    private javax.swing.JComboBox<String> cboEstacionInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtReporte;
    // End of variables declaration//GEN-END:variables
}
