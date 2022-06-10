package ventanasCliente;

import javax.swing.table.DefaultTableModel;
import sistema.Sistema;

public class pnlMensajesEnviados extends javax.swing.JPanel {

    public pnlMensajesEnviados() {
        initComponents();
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMensajesEnviados = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setPreferredSize(new java.awt.Dimension(422, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMensajesEnviados.setBackground(new java.awt.Color(204, 255, 204));
        tblMensajesEnviados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tblMensajesEnviados.setForeground(new java.awt.Color(0, 0, 0));
        tblMensajesEnviados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Asunto", "Mensaje", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tblMensajesEnviados);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 210));

        btnActualizar.setBackground(new java.awt.Color(102, 102, 102));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 120, 50));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove_16px.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 60, 30));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MENSAJES ENVIADOS");
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarTabla() {
        String[] titulos = {"Asunto", "Mensaje", "Fecha"};
        String[][] datos = Sistema.clienteActual.getMensajesEnviados();
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblMensajesEnviados.setModel(modelo);
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Desapilar mensaje
        Sistema.clienteActual.desapilarMensajeEnviado();
        actualizarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMensajesEnviados;
    // End of variables declaration//GEN-END:variables
}
