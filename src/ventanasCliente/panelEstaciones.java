package ventanasCliente;

import sistema.Sistema;

public class panelEstaciones extends javax.swing.JPanel {

    public panelEstaciones() {
        initComponents();
        this.cargarEstacionInicial();
        this.cargarEstacionFinal();
    }

    private void cargarEstacionInicial() {
        String[] estaciones = Sistema.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionInicial.addItem(estacion);
        }
    }

    private void cargarEstacionFinal() {
        String[] estaciones = Sistema.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionFinal.addItem(estacion);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboEstacionInicial = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboEstacionFinal = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBuses = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Origen:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 40));

        cboEstacionInicial.setBackground(new java.awt.Color(204, 255, 204));
        cboEstacionInicial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboEstacionInicial.setForeground(new java.awt.Color(0, 0, 0));
        add(cboEstacionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 190, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Destino:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 40));

        cboEstacionFinal.setBackground(new java.awt.Color(204, 255, 204));
        cboEstacionFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboEstacionFinal.setForeground(new java.awt.Color(0, 0, 0));
        add(cboEstacionFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 190, 40));

        btnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, 40));

        txtBuses.setBackground(new java.awt.Color(92, 146, 224));
        txtBuses.setColumns(20);
        txtBuses.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBuses.setForeground(new java.awt.Color(0, 0, 0));
        txtBuses.setRows(5);
        txtBuses.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtBuses);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 250, 180));

        jLabel3.setBackground(new java.awt.Color(153, 0, 51));
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/route_64px.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 80, 90));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BUSES DISPONIBLES");
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.txtBuses.setText("");
        String estInicial = this.cboEstacionInicial.getSelectedItem().toString();
        String estFinal = this.cboEstacionFinal.getSelectedItem().toString();
        String datos[] = Sistema.rutas.busesDisponibles(estInicial, estFinal);
        String reporte = "";
        if (datos != null) {
            for (String dato : datos) {
                reporte += "  " + dato + "\n";
            }
        }
        this.txtBuses.setText(reporte);
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cboEstacionFinal;
    private javax.swing.JComboBox<String> cboEstacionInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBuses;
    // End of variables declaration//GEN-END:variables
}
