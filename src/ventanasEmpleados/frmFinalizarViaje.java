package ventanasEmpleados;

import sistema.Sistema;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmFinalizarViaje extends javax.swing.JInternalFrame {

    public frmFinalizarViaje() {
        initComponents();
        cargarTabla();
        cargarEstacionFinal();
        this.btnFinalizarViaje.setEnabled(false);
    }

    private void cargarEstacionFinal() {
        String[] estaciones = Sistema.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionFinal.addItem(estacion);
        }
    }

    private void cargarTabla() {
        String datos[][] = Sistema.movimientosViaje.getDatosFinalizarViaje();
        String titulos[] = {"DNI", "Nombres", "CódigoTarjeta", "TipoBus", "Estacion inicial", "Hora inicio"};
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tblViajes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViajes = new javax.swing.JTable();
        btnFinalizarViaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboEstacionFinal = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblViajes.setBackground(new java.awt.Color(204, 255, 204));
        tblViajes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblViajes.setForeground(new java.awt.Color(0, 0, 0));
        tblViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViajesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblViajes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 980, 400));

        btnFinalizarViaje.setBackground(new java.awt.Color(204, 0, 51));
        btnFinalizarViaje.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFinalizarViaje.setForeground(new java.awt.Color(0, 0, 0));
        btnFinalizarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/finish_flag_48px.png"))); // NOI18N
        btnFinalizarViaje.setText("FINALIZAR VIAJE");
        btnFinalizarViaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFinalizarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarViajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizarViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 390, 250, 120));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ESTACIÓN FINAL:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 170, 50));

        cboEstacionFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(cboEstacionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 240, 50));

        jLabel2.setBackground(new java.awt.Color(255, 0, 102));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traveler_100px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 120, 100));

        jLabel8.setBackground(new java.awt.Color(51, 0, 51));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FINALIZAR VIAJE");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblViajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViajesMouseClicked
        if (tblViajes.rowAtPoint(evt.getPoint()) == -1) {
            return;
        }
        int sel = tblViajes.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(tblViajes.getValueAt(sel, 0));
        Sistema.clienteActual = Sistema.clientes.obtenerClienteDni(dni);
        int idTarjeta = Integer.parseInt(String.valueOf(tblViajes.getValueAt(sel, 2)));
        String horaInicio = String.valueOf(tblViajes.getValueAt(sel, 5));
        Sistema.movimientoViajeActual = Sistema.movimientosViaje.obtenerMovimientoViajeHoraInicio(idTarjeta, horaInicio);
        this.btnFinalizarViaje.setEnabled(true);
    }//GEN-LAST:event_tblViajesMouseClicked

    private void btnFinalizarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarViajeActionPerformed
        String estacionFinal = this.cboEstacionFinal.getSelectedItem().toString();
        Sistema.movimientoViajeActual.finalizarViaje(Sistema.clienteActual, estacionFinal);
        this.btnFinalizarViaje.setEnabled(false);
        cargarTabla();
        JOptionPane.showMessageDialog(this, "Viaje finalizado");
    }//GEN-LAST:event_btnFinalizarViajeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarViaje;
    private javax.swing.JComboBox<String> cboEstacionFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblViajes;
    // End of variables declaration//GEN-END:variables
}
