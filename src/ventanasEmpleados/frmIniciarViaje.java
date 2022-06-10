package ventanasEmpleados;

import sistema.Sistema;
import javax.swing.table.DefaultTableModel;
import entidades.*;
import javax.swing.JOptionPane;

public class frmIniciarViaje extends javax.swing.JInternalFrame {

    public frmIniciarViaje() {
        initComponents();
        this.btnIniciarViaje.setEnabled(false);
        this.cargarEstaciones();
        this.cargarTablaMostrarTodos();
        this.cargarTipoBuses();
    }

    private void cargarTarjeta() {
        String[] tarjetas = Sistema.clienteActual.getTarjetas();
        this.cboTarjetas.removeAllItems();
        for (String tarjeta : tarjetas) {
            this.cboTarjetas.addItem(tarjeta);
        }
    }

    private void cargarTipoBuses() {
        String[] buses = Sistema.buses.getTiposBus();
        for (String bus : buses) {
            this.cboBuses.addItem(bus);
        }
    }

    private void cargarEstaciones() {
        String[] estaciones = Sistema.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstacionInicial.addItem(estacion);
        }
    }

    private void cargarTablaMostrarTodos() {
        String datos[][] = Sistema.clientes.getDatosNoViaje();
        String titulos[] = {"Nombres", "Apellido paterno", "Apellido materno", "DNI"};
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblClientes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOpcion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jRadioButtonNombres = new javax.swing.JRadioButton();
        jRadioButtonIdTarjeta = new javax.swing.JRadioButton();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnIniciarViaje = new javax.swing.JButton();
        cboEstacionInicial = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cboTarjetas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboBuses = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnMostrarTodos = new javax.swing.JButton();
        jRadioButtonDni = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClientes.setBackground(new java.awt.Color(204, 255, 204));
        tblClientes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblClientes.setForeground(new java.awt.Color(0, 0, 0));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 710, 290));

        buttonGroupOpcion.add(jRadioButtonNombres);
        jRadioButtonNombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonNombres.setSelected(true);
        jRadioButtonNombres.setText("NOMBRE");
        jPanel1.add(jRadioButtonNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 110, 40));

        buttonGroupOpcion.add(jRadioButtonIdTarjeta);
        jRadioButtonIdTarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonIdTarjeta.setText("IDTARJETA");
        jPanel1.add(jRadioButtonIdTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, 40));

        txtBusqueda.setBackground(new java.awt.Color(204, 255, 204));
        txtBusqueda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 190, 40));

        btnBuscar.setBackground(new java.awt.Color(204, 153, 0));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(204, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search_64px.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 180, 70));

        btnIniciarViaje.setBackground(new java.awt.Color(204, 0, 51));
        btnIniciarViaje.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIniciarViaje.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tour_bus_80px1.png"))); // NOI18N
        btnIniciarViaje.setText("INICIAR VIAJE");
        btnIniciarViaje.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 0, 51), null));
        btnIniciarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarViajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 250, 100));

        jPanel1.add(cboEstacionInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 200, 170, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ESTACIÓN INICIAL:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 130, 50));

        cboTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTarjetasActionPerformed(evt);
            }
        });
        jPanel1.add(cboTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 420, 170, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("TARJETA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 100, 50));

        jPanel1.add(cboBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, 170, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("TIPO BUS:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 100, 50));

        btnMostrarTodos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMostrarTodos.setText("MOSTRAR TODOS");
        btnMostrarTodos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 130, 60));

        buttonGroupOpcion.add(jRadioButtonDni);
        jRadioButtonDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonDni.setText("DNI");
        jPanel1.add(jRadioButtonDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 110, 40));

        jLabel8.setBackground(new java.awt.Color(51, 0, 51));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INICIAR VIAJE");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 0)));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Busca a los clientes y los inserta en la tabla
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            if (this.txtBusqueda.getText().equals("")) {
                return;
            }
            String[] titulos = {"Nombres", "Apellido paterno", "Apellido materno", "DNI"};
            String busqueda = this.txtBusqueda.getText();
            String[][] datos = null;
            if (this.jRadioButtonNombres.isSelected()) {
                datos = Sistema.clientes.getDatosNombresNoViaje(busqueda.toUpperCase());
            } else {
                Cliente c;
                if (this.jRadioButtonDni.isSelected()) {
                    c = Sistema.clientes.obtenerClienteDni(busqueda);
                } else { //jRadioButtonIdTarjeta.isSelected()
                    c = Sistema.clientes.obtenerClienteIdTarjeta(Integer.parseInt(busqueda));
                }
                if (c != null) {
                    //Solo mostrará si el cliente no está en un viaje
                    if (c.isMovViaje() == false) {
                        datos = new String[1][4];
                        datos[0][0] = c.getNombres();
                        datos[0][1] = c.getApellidoPaterno();
                        datos[0][2] = c.getApellidoMaterno();
                        datos[0][3] = c.getDni();
                    }
                }
            }
            DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
            this.tblClientes.setModel(modelo);
            btnIniciarViaje.setEnabled(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Campo idTarjeta incorrecto");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnIniciarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarViajeActionPerformed
        Sistema.estacionActual = Sistema.estaciones.getEstacion(this.cboEstacionInicial.getSelectedItem().toString());
        String tipoBus = this.cboBuses.getSelectedItem().toString();
        MovimientoViaje mov = Sistema.tarjetaActual.viajar(Sistema.estacionActual, tipoBus);
        if (mov != null) {
            Sistema.movimientosViaje.agregar(mov);
            this.cargarTablaMostrarTodos();
            JOptionPane.showMessageDialog(this, "Movimiento registrado");
        } else {
            JOptionPane.showMessageDialog(this, "Saldo insuficiente");
        }
        btnIniciarViaje.setEnabled(false);
    }//GEN-LAST:event_btnIniciarViajeActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        this.btnIniciarViaje.setEnabled(true);
        int sel = this.tblClientes.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(this.tblClientes.getValueAt(sel, 3));
        Sistema.clienteActual = Sistema.clientes.obtenerClienteDni(dni);
        cargarTarjeta();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void cboTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTarjetasActionPerformed
        if (this.cboTarjetas.getSelectedItem() == null) {
            return;
        }
        String codigo = this.cboTarjetas.getSelectedItem().toString();
        Sistema.tarjetaActual = Sistema.clienteActual.getTarjeta(Integer.parseInt(codigo));
    }//GEN-LAST:event_cboTarjetasActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        this.txtBusqueda.setText("");
        btnIniciarViaje.setEnabled(false);
        cargarTablaMostrarTodos();
    }//GEN-LAST:event_btnMostrarTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIniciarViaje;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.ButtonGroup buttonGroupOpcion;
    private javax.swing.JComboBox<String> cboBuses;
    private javax.swing.JComboBox<String> cboEstacionInicial;
    private javax.swing.JComboBox<String> cboTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDni;
    private javax.swing.JRadioButton jRadioButtonIdTarjeta;
    private javax.swing.JRadioButton jRadioButtonNombres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
