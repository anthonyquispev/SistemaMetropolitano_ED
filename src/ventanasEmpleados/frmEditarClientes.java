package ventanasEmpleados;

import sistema.Sistema;
import entidades.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmEditarClientes extends javax.swing.JInternalFrame {

    public frmEditarClientes() {
        initComponents();
        this.deshabilitarComponentes();
        this.cargarTablaMostrarTodos();
        btnOpcionesDeBusqueda.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        pnlContenedor1 = new javax.swing.JPanel();
        pnlBotonOpciones = new javax.swing.JPanel();
        btnOpcionesDeBusqueda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNumeroDeResultados = new javax.swing.JLabel();
        pnlCheckBox = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jRadioButtonDni = new javax.swing.JRadioButton();
        jRadioButtonIdTarjeta = new javax.swing.JRadioButton();
        jRadioButtonApellidoMaterno = new javax.swing.JRadioButton();
        jRadioButtonTodos1 = new javax.swing.JRadioButton();
        jRadioButtonNombres = new javax.swing.JRadioButton();
        pnlContenedor2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        btnMostrarTodos = new javax.swing.JButton();
        rbNombres = new javax.swing.JRadioButton();
        rbDni = new javax.swing.JRadioButton();
        rbIdTarjeta = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1332, 682));
        setRequestFocusEnabled(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusqueda.setBackground(new java.awt.Color(204, 255, 204));
        txtBusqueda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 220, 40));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenedor1.setLayout(new java.awt.CardLayout());

        btnOpcionesDeBusqueda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOpcionesDeBusqueda.setText("OPCIONES DE BÚSQUEDA");
        btnOpcionesDeBusqueda.setBorder(null);
        buttonGroup1.add(btnOpcionesDeBusqueda);
        btnOpcionesDeBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesDeBusquedaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Resultados encontrados:");

        lblNumeroDeResultados.setForeground(new java.awt.Color(255, 0, 0));
        lblNumeroDeResultados.setOpaque(true);

        javax.swing.GroupLayout pnlBotonOpcionesLayout = new javax.swing.GroupLayout(pnlBotonOpciones);
        pnlBotonOpciones.setLayout(pnlBotonOpcionesLayout);
        pnlBotonOpcionesLayout.setHorizontalGroup(
            pnlBotonOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonOpcionesLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumeroDeResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpcionesDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pnlBotonOpcionesLayout.setVerticalGroup(
            pnlBotonOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonOpcionesLayout.createSequentialGroup()
                .addGroup(pnlBotonOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonOpcionesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnOpcionesDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonOpcionesLayout.createSequentialGroup()
                        .addContainerGap(51, Short.MAX_VALUE)
                        .addGroup(pnlBotonOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumeroDeResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pnlContenedor1.add(pnlBotonOpciones, "card1");

        pnlCheckBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("CERRAR");
        jButton2.setBorder(null);
        buttonGroup1.add(jButton2);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnlCheckBox.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 40));

        buttonGroup2.add(jRadioButtonDni);
        jRadioButtonDni.setText("DNI");
        pnlCheckBox.add(jRadioButtonDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        buttonGroup2.add(jRadioButtonIdTarjeta);
        jRadioButtonIdTarjeta.setText("IdTarjeta");
        pnlCheckBox.add(jRadioButtonIdTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        buttonGroup2.add(jRadioButtonApellidoMaterno);
        jRadioButtonApellidoMaterno.setText("Apellidos Maternos");
        pnlCheckBox.add(jRadioButtonApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        buttonGroup2.add(jRadioButtonTodos1);
        jRadioButtonTodos1.setSelected(true);
        jRadioButtonTodos1.setText("Todos");
        pnlCheckBox.add(jRadioButtonTodos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        buttonGroup2.add(jRadioButtonNombres);
        jRadioButtonNombres.setText("Nombres");
        pnlCheckBox.add(jRadioButtonNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlContenedor1.add(pnlCheckBox, "card2");

        jPanel4.add(pnlContenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 130));

        pnlContenedor2.setLayout(new java.awt.BorderLayout());

        tblClientes.setBackground(new java.awt.Color(204, 255, 204));
        tblClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblClientes.setForeground(new java.awt.Color(0, 0, 0));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        pnlContenedor2.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel4.add(pnlContenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 650, 260));

        jScrollPane1.setViewportView(jPanel4);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 660, 450));

        jButton3.setBackground(new java.awt.Color(204, 0, 51));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search_64px.png"))); // NOI18N
        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 160, 60));

        btnMostrarTodos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMostrarTodos.setText("MOSTRAR TODOS");
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 180, 60));

        buttonGroup3.add(rbNombres);
        rbNombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbNombres.setSelected(true);
        rbNombres.setText("NOMBRE");
        jPanel2.add(rbNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 110, 30));

        buttonGroup3.add(rbDni);
        rbDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbDni.setText("DNI");
        jPanel2.add(rbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 30));

        buttonGroup3.add(rbIdTarjeta);
        rbIdTarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbIdTarjeta.setText("IDTARJETA");
        jPanel2.add(rbIdTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 110, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 850, 610));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setBackground(new java.awt.Color(153, 0, 51));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_file_80px.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 210, 80));

        btnEliminar.setBackground(new java.awt.Color(153, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove_80px.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 80));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRES:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO PATERNO:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 160, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("APELLIDO MATERNO:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 160, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("DNI:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 160, 40));

        txtNombres.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombres.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 200, 40));

        txtApellidoPaterno.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtApellidoPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel3.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 200, 40));

        txtApellidoMaterno.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtApellidoMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel3.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 200, 40));

        lblDni.setBackground(new java.awt.Color(0, 204, 204));
        lblDni.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 0, 0));
        lblDni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDni.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDni.setOpaque(true);
        jPanel3.add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 450, 580));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarTablaMostrarTodos() {
        String datos[][] = Sistema.clientes.getDatos();
        String titulos[] = {"Nombres", "Paterno", "Materno", "DNI"};
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblClientes.setModel(modelo);
    }

    private void btnOpcionesDeBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesDeBusquedaActionPerformed
        ((CardLayout) pnlContenedor1.getLayout()).show(pnlContenedor1, "card2");
    }//GEN-LAST:event_btnOpcionesDeBusquedaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ((CardLayout) pnlContenedor1.getLayout()).show(pnlContenedor1, "card1");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (this.txtBusqueda.getText().equals("")) {
                return;
            }
            String[] titulos = {"Nombre", "Apellido paterno", "Apellido materno", "DNI"};
            String busqueda = this.txtBusqueda.getText();
            String[][] datos = null;
            if (this.rbNombres.isSelected()) {
                datos = Sistema.clientes.getDatosNombres(busqueda.toUpperCase());
            } else {
                Cliente c;
                if (this.rbDni.isSelected()) {
                    c = Sistema.clientes.obtenerClienteDni(busqueda);
                } else { //jRadioButtonIdTarjeta.isSelected()
                    c = Sistema.clientes.obtenerClienteIdTarjeta(Integer.parseInt(busqueda));
                }
                if (c != null) {
                    datos = new String[1][4];
                    datos[0][0] = c.getNombres();
                    datos[0][1] = c.getApellidoPaterno();
                    datos[0][2] = c.getApellidoMaterno();
                    datos[0][3] = c.getDni();
                }
            }
            DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
            this.tblClientes.setModel(modelo);
            this.actualizarResultados();
            this.deshabilitarComponentes();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Campo idTarjeta incorrecto");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deshabilitarComponentes() {
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.lblDni.setText("");
        this.txtNombres.setText("");
        this.txtNombres.setEnabled(false);
        this.txtApellidoPaterno.setText("");
        this.txtApellidoPaterno.setEnabled(false);
        this.txtApellidoMaterno.setText("");
        this.txtApellidoMaterno.setEnabled(false);
    }

    private void habilitarComponentes() {
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.txtNombres.setEnabled(true);
        this.txtApellidoPaterno.setEnabled(true);
        this.txtApellidoMaterno.setEnabled(true);
    }

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int sel = this.tblClientes.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(this.tblClientes.getValueAt(sel, 3));
        Sistema.clienteActual = Sistema.clientes.obtenerClienteDni(dni);
        this.habilitarComponentes();
        this.cargarDatos();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String nombres = this.txtNombres.getText();
        String aPaternos = this.txtApellidoPaterno.getText();
        String aMaternos = this.txtApellidoMaterno.getText();
        if ((nombres.equals("")) || aPaternos.equals("") || (aMaternos.equals(""))) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            Sistema.clienteActual.setNombres(nombres);
            Sistema.clienteActual.setApellidoPaterno(aPaternos);
            Sistema.clienteActual.setApellidoMaterno(aMaternos);
            this.btnMostrarTodosActionPerformed(evt);
            this.deshabilitarComponentes();
            JOptionPane.showMessageDialog(this, "Cliente modificado correctamente");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        this.txtBusqueda.setText("");
        this.cargarTablaMostrarTodos();
        this.actualizarResultados();
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cargarDatos() {
        this.lblDni.setText(Sistema.clienteActual.getDni());
        this.txtNombres.setText(Sistema.clienteActual.getNombres());
        this.txtApellidoPaterno.setText(Sistema.clienteActual.getApellidoPaterno());
        this.txtApellidoMaterno.setText(Sistema.clienteActual.getApellidoMaterno());
    }

    private void actualizarResultados() {
        int nFilas = this.tblClientes.getRowCount();
        if (nFilas > 0) {
            if (nFilas <= 15) {
                this.lblNumeroDeResultados.setForeground(Color.BLACK);
                this.lblNumeroDeResultados.setText("" + nFilas);
            } else {
                this.lblNumeroDeResultados.setForeground(Color.GREEN);
                this.lblNumeroDeResultados.setText("" + nFilas);
            }
        } else {
            this.lblNumeroDeResultados.setForeground(Color.RED);
            this.lblNumeroDeResultados.setText("No se encontró ningún resultado");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnOpcionesDeBusqueda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonApellidoMaterno;
    private javax.swing.JRadioButton jRadioButtonDni;
    private javax.swing.JRadioButton jRadioButtonIdTarjeta;
    private javax.swing.JRadioButton jRadioButtonNombres;
    private javax.swing.JRadioButton jRadioButtonTodos1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNumeroDeResultados;
    private javax.swing.JPanel pnlBotonOpciones;
    private javax.swing.JPanel pnlCheckBox;
    private javax.swing.JPanel pnlContenedor1;
    private javax.swing.JPanel pnlContenedor2;
    private javax.swing.JRadioButton rbDni;
    private javax.swing.JRadioButton rbIdTarjeta;
    private javax.swing.JRadioButton rbNombres;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

}
