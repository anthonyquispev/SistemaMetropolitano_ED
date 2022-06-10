package ventanasEmpleados;

import sistema.Sistema;
import entidades.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class frmMostrarEmpleados extends javax.swing.JInternalFrame {

    public frmMostrarEmpleados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnMostrarTodos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEmpleados = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1332, 682));
        setRequestFocusEnabled(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarTodos.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnMostrarTodos.setText("MOSTRAR");
        btnMostrarTodos.setBorder(new javax.swing.border.MatteBorder(null));
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 150, 50));

        txtEmpleados.setBackground(new java.awt.Color(92, 146, 224));
        txtEmpleados.setColumns(20);
        txtEmpleados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        txtEmpleados.setRows(5);
        jScrollPane3.setViewportView(txtEmpleados);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 890, 140));

        tblEmpleados.setBackground(new java.awt.Color(204, 255, 204));
        tblEmpleados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "Cargos", "DNI"
            }
        ));
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 560, 160));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Recorrido por niveles");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 170, 40));

        jLabel8.setBackground(new java.awt.Color(51, 0, 51));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ÁRBOL DE EMPLEADOS");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 0)));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 610));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        Vector<Empleado> v = new Vector();
        Sistema.empleados.getDatos(Sistema.empleados.raiz, v);
        String columnas[] = {"Nombres", "Apellidos", "Cargo", "DNI"};
        String datos[][] = new String[v.size()][4];
        int i = 0;
        for (Empleado e : v) {
            datos[i][0] = e.getNombres();
            datos[i][1] = e.getApellidoPaterno() + " " + e.getApellidoMaterno();
            datos[i][2] = e.getNombreCargo();
            datos[i][3] = e.getDni();
            i++;
        }
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        tblEmpleados.setModel(modelo);
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        int sel = tblEmpleados.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(tblEmpleados.getValueAt(sel, 3));
        String texto = Sistema.empleados.mostrarElementos(Sistema.empleados.raiz, dni);
        txtEmpleados.setText(texto);
    }//GEN-LAST:event_tblEmpleadosMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextArea txtEmpleados;
    // End of variables declaration//GEN-END:variables

}
