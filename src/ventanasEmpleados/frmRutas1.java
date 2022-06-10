package ventanasEmpleados;

import sistema.Sistema;
import entidades.*;

public class frmRutas1 extends javax.swing.JInternalFrame {

    public frmRutas1() {
        initComponents();
        this.lblEstacion1.setText("Naranjal");
        this.lblEstacion2.setText("Naranjal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnl1 = new javax.swing.JPanel();
        rb0 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        rb6 = new javax.swing.JRadioButton();
        rb7 = new javax.swing.JRadioButton();
        rb8 = new javax.swing.JRadioButton();
        rb9 = new javax.swing.JRadioButton();
        rb10 = new javax.swing.JRadioButton();
        rb11 = new javax.swing.JRadioButton();
        rb12 = new javax.swing.JRadioButton();
        rb13 = new javax.swing.JRadioButton();
        rb14 = new javax.swing.JRadioButton();
        rb15 = new javax.swing.JRadioButton();
        rb16 = new javax.swing.JRadioButton();
        rb17 = new javax.swing.JRadioButton();
        rb18 = new javax.swing.JRadioButton();
        rb19 = new javax.swing.JRadioButton();
        rb20 = new javax.swing.JRadioButton();
        rb21 = new javax.swing.JRadioButton();
        rb22 = new javax.swing.JRadioButton();
        rb23 = new javax.swing.JRadioButton();
        rb24 = new javax.swing.JRadioButton();
        rb25 = new javax.swing.JRadioButton();
        rb26 = new javax.swing.JRadioButton();
        rb27 = new javax.swing.JRadioButton();
        rb28 = new javax.swing.JRadioButton();
        rb29 = new javax.swing.JRadioButton();
        rb30 = new javax.swing.JRadioButton();
        rb31 = new javax.swing.JRadioButton();
        rb32 = new javax.swing.JRadioButton();
        rb33 = new javax.swing.JRadioButton();
        rb34 = new javax.swing.JRadioButton();
        rb35 = new javax.swing.JRadioButton();
        rb36 = new javax.swing.JRadioButton();
        rb37 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        lblEstacion1 = new javax.swing.JLabel();
        lblEstacion2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextArea();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDistancia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rb0.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup2.add(rb0);
        rb0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rb0.setForeground(new java.awt.Color(255, 255, 0));
        rb0.setSelected(true);
        rb0.setBorder(null);
        rb0.setContentAreaFilled(false);
        rb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb0ActionPerformed(evt);
            }
        });
        pnl1.add(rb0, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 96, 20, 20));

        rb1.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb1);
        rb1.setForeground(new java.awt.Color(255, 255, 0));
        rb1.setBorder(null);
        rb1.setContentAreaFilled(false);
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        pnl1.add(rb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 111, 20, 20));

        rb2.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb2);
        rb2.setForeground(new java.awt.Color(255, 255, 0));
        rb2.setBorder(null);
        rb2.setContentAreaFilled(false);
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        pnl1.add(rb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 124, 20, 20));

        rb3.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb3);
        rb3.setForeground(new java.awt.Color(255, 255, 0));
        rb3.setBorder(null);
        rb3.setBorderPainted(true);
        rb3.setContentAreaFilled(false);
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        pnl1.add(rb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 134, 20, 20));

        rb4.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb4);
        rb4.setForeground(new java.awt.Color(255, 255, 0));
        rb4.setBorder(null);
        rb4.setBorderPainted(true);
        rb4.setContentAreaFilled(false);
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        pnl1.add(rb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 145, 20, 20));

        rb5.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb5);
        rb5.setForeground(new java.awt.Color(255, 255, 0));
        rb5.setBorder(null);
        rb5.setBorderPainted(true);
        rb5.setContentAreaFilled(false);
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });
        pnl1.add(rb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 157, 20, 20));

        rb6.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb6);
        rb6.setForeground(new java.awt.Color(255, 255, 0));
        rb6.setBorder(null);
        rb6.setBorderPainted(true);
        rb6.setContentAreaFilled(false);
        rb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb6ActionPerformed(evt);
            }
        });
        pnl1.add(rb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 170, 20, 20));

        rb7.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb7);
        rb7.setForeground(new java.awt.Color(255, 255, 0));
        rb7.setBorder(null);
        rb7.setBorderPainted(true);
        rb7.setContentAreaFilled(false);
        rb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb7ActionPerformed(evt);
            }
        });
        pnl1.add(rb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 186, 20, 20));

        rb8.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb8);
        rb8.setForeground(new java.awt.Color(255, 255, 0));
        rb8.setBorder(null);
        rb8.setBorderPainted(true);
        rb8.setContentAreaFilled(false);
        rb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb8ActionPerformed(evt);
            }
        });
        pnl1.add(rb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 192, 20, 20));

        rb9.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb9);
        rb9.setForeground(new java.awt.Color(255, 255, 0));
        rb9.setBorder(null);
        rb9.setBorderPainted(true);
        rb9.setContentAreaFilled(false);
        rb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb9ActionPerformed(evt);
            }
        });
        pnl1.add(rb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 195, 20, 20));

        rb10.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb10);
        rb10.setForeground(new java.awt.Color(255, 255, 0));
        rb10.setBorder(null);
        rb10.setBorderPainted(true);
        rb10.setContentAreaFilled(false);
        rb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb10ActionPerformed(evt);
            }
        });
        pnl1.add(rb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 211, 20, 20));

        rb11.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb11);
        rb11.setForeground(new java.awt.Color(255, 255, 0));
        rb11.setBorder(null);
        rb11.setBorderPainted(true);
        rb11.setContentAreaFilled(false);
        rb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb11ActionPerformed(evt);
            }
        });
        pnl1.add(rb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 230, 20, 20));

        rb12.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb12);
        rb12.setForeground(new java.awt.Color(255, 255, 0));
        rb12.setBorder(null);
        rb12.setBorderPainted(true);
        rb12.setContentAreaFilled(false);
        rb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb12ActionPerformed(evt);
            }
        });
        pnl1.add(rb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 220, 20, 20));

        rb13.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb13);
        rb13.setForeground(new java.awt.Color(255, 255, 0));
        rb13.setBorder(null);
        rb13.setBorderPainted(true);
        rb13.setContentAreaFilled(false);
        rb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb13ActionPerformed(evt);
            }
        });
        pnl1.add(rb13, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 212, 20, 20));

        rb14.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb14);
        rb14.setForeground(new java.awt.Color(255, 255, 0));
        rb14.setBorder(null);
        rb14.setBorderPainted(true);
        rb14.setContentAreaFilled(false);
        rb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb14ActionPerformed(evt);
            }
        });
        pnl1.add(rb14, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 229, 20, 20));

        rb15.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb15);
        rb15.setForeground(new java.awt.Color(255, 255, 0));
        rb15.setBorder(null);
        rb15.setBorderPainted(true);
        rb15.setContentAreaFilled(false);
        rb15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb15ActionPerformed(evt);
            }
        });
        pnl1.add(rb15, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 250, 20, 20));

        rb16.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb16);
        rb16.setForeground(new java.awt.Color(255, 255, 0));
        rb16.setBorder(null);
        rb16.setBorderPainted(true);
        rb16.setContentAreaFilled(false);
        rb16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb16ActionPerformed(evt);
            }
        });
        pnl1.add(rb16, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 262, 20, 20));

        rb17.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb17);
        rb17.setForeground(new java.awt.Color(255, 255, 0));
        rb17.setBorder(null);
        rb17.setBorderPainted(true);
        rb17.setContentAreaFilled(false);
        rb17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb17ActionPerformed(evt);
            }
        });
        pnl1.add(rb17, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 274, 20, 20));

        rb18.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup2.add(rb18);
        rb18.setForeground(new java.awt.Color(255, 255, 0));
        rb18.setBorder(null);
        rb18.setBorderPainted(true);
        rb18.setContentAreaFilled(false);
        rb18.setMaximumSize(new java.awt.Dimension(28, 28));
        rb18.setMinimumSize(new java.awt.Dimension(24, 24));
        rb18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb18ActionPerformed(evt);
            }
        });
        pnl1.add(rb18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 26, 22));

        rb19.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb19);
        rb19.setForeground(new java.awt.Color(255, 255, 0));
        rb19.setBorder(null);
        rb19.setBorderPainted(true);
        rb19.setContentAreaFilled(false);
        rb19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb19ActionPerformed(evt);
            }
        });
        pnl1.add(rb19, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 268, 20, 20));

        rb20.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb20);
        rb20.setForeground(new java.awt.Color(255, 255, 0));
        rb20.setBorder(null);
        rb20.setBorderPainted(true);
        rb20.setContentAreaFilled(false);
        rb20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb20ActionPerformed(evt);
            }
        });
        pnl1.add(rb20, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 281, 20, 20));

        rb21.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb21);
        rb21.setForeground(new java.awt.Color(255, 255, 0));
        rb21.setBorder(null);
        rb21.setBorderPainted(true);
        rb21.setContentAreaFilled(false);
        rb21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb21ActionPerformed(evt);
            }
        });
        pnl1.add(rb21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 292, 20, 20));

        rb22.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb22);
        rb22.setForeground(new java.awt.Color(255, 255, 0));
        rb22.setBorder(null);
        rb22.setBorderPainted(true);
        rb22.setContentAreaFilled(false);
        rb22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb22ActionPerformed(evt);
            }
        });
        pnl1.add(rb22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 304, 20, 20));

        rb23.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb23);
        rb23.setForeground(new java.awt.Color(255, 255, 0));
        rb23.setBorder(null);
        rb23.setBorderPainted(true);
        rb23.setContentAreaFilled(false);
        rb23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb23ActionPerformed(evt);
            }
        });
        pnl1.add(rb23, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 327, 20, 20));

        rb24.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb24);
        rb24.setForeground(new java.awt.Color(255, 255, 0));
        rb24.setBorder(null);
        rb24.setBorderPainted(true);
        rb24.setContentAreaFilled(false);
        rb24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb24ActionPerformed(evt);
            }
        });
        pnl1.add(rb24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 348, 20, 20));

        rb25.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb25);
        rb25.setForeground(new java.awt.Color(255, 255, 0));
        rb25.setBorder(null);
        rb25.setBorderPainted(true);
        rb25.setContentAreaFilled(false);
        rb25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb25ActionPerformed(evt);
            }
        });
        pnl1.add(rb25, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 368, 20, 20));

        rb26.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb26);
        rb26.setForeground(new java.awt.Color(255, 255, 0));
        rb26.setBorder(null);
        rb26.setBorderPainted(true);
        rb26.setContentAreaFilled(false);
        rb26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb26ActionPerformed(evt);
            }
        });
        pnl1.add(rb26, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 387, 20, 20));

        rb27.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb27);
        rb27.setForeground(new java.awt.Color(255, 255, 0));
        rb27.setBorder(null);
        rb27.setBorderPainted(true);
        rb27.setContentAreaFilled(false);
        rb27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb27ActionPerformed(evt);
            }
        });
        pnl1.add(rb27, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 407, 20, 20));

        rb28.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb28);
        rb28.setForeground(new java.awt.Color(255, 255, 0));
        rb28.setBorder(null);
        rb28.setBorderPainted(true);
        rb28.setContentAreaFilled(false);
        rb28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb28ActionPerformed(evt);
            }
        });
        pnl1.add(rb28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 20, 20));

        rb29.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb29);
        rb29.setForeground(new java.awt.Color(255, 255, 0));
        rb29.setBorder(null);
        rb29.setBorderPainted(true);
        rb29.setContentAreaFilled(false);
        rb29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb29ActionPerformed(evt);
            }
        });
        pnl1.add(rb29, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 417, 20, 20));

        rb30.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb30);
        rb30.setForeground(new java.awt.Color(255, 255, 0));
        rb30.setBorder(null);
        rb30.setBorderPainted(true);
        rb30.setContentAreaFilled(false);
        rb30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb30ActionPerformed(evt);
            }
        });
        pnl1.add(rb30, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 435, 20, 20));

        rb31.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb31);
        rb31.setForeground(new java.awt.Color(255, 255, 0));
        rb31.setBorder(null);
        rb31.setBorderPainted(true);
        rb31.setContentAreaFilled(false);
        rb31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb31ActionPerformed(evt);
            }
        });
        pnl1.add(rb31, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 450, 20, 20));

        rb32.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb32);
        rb32.setForeground(new java.awt.Color(255, 255, 0));
        rb32.setBorder(null);
        rb32.setBorderPainted(true);
        rb32.setContentAreaFilled(false);
        rb32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb32ActionPerformed(evt);
            }
        });
        pnl1.add(rb32, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 469, 20, 20));

        rb33.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb33);
        rb33.setForeground(new java.awt.Color(255, 255, 0));
        rb33.setBorder(null);
        rb33.setBorderPainted(true);
        rb33.setContentAreaFilled(false);
        rb33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb33ActionPerformed(evt);
            }
        });
        pnl1.add(rb33, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 486, 20, 20));

        rb34.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb34);
        rb34.setForeground(new java.awt.Color(255, 255, 0));
        rb34.setBorder(null);
        rb34.setBorderPainted(true);
        rb34.setContentAreaFilled(false);
        rb34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb34ActionPerformed(evt);
            }
        });
        pnl1.add(rb34, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 495, 20, 20));

        rb35.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb35);
        rb35.setForeground(new java.awt.Color(255, 255, 0));
        rb35.setBorder(null);
        rb35.setBorderPainted(true);
        rb35.setContentAreaFilled(false);
        rb35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb35ActionPerformed(evt);
            }
        });
        pnl1.add(rb35, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 519, 20, 20));

        rb36.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup2.add(rb36);
        rb36.setForeground(new java.awt.Color(255, 255, 0));
        rb36.setBorder(null);
        rb36.setBorderPainted(true);
        rb36.setContentAreaFilled(false);
        rb36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb36ActionPerformed(evt);
            }
        });
        pnl1.add(rb36, new org.netbeans.lib.awtextra.AbsoluteConstraints(844, 529, 20, 20));

        rb37.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup2.add(rb37);
        rb37.setForeground(new java.awt.Color(255, 255, 0));
        rb37.setBorder(null);
        rb37.setBorderPainted(true);
        rb37.setContentAreaFilled(false);
        rb37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb37ActionPerformed(evt);
            }
        });
        pnl1.add(rb37, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 531, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagramaRutas4.jpg"))); // NOI18N
        pnl1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 570));

        getContentPane().add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        pnl2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEstacion1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEstacion1.setText("-------------------------");
        pnl2.add(lblEstacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, 40));

        lblEstacion2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblEstacion2.setText("-------------------------");
        pnl2.add(lblEstacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, 40));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Estación inicial:");
        pnl2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 40));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton2.setText("Estación final:");
        pnl2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, 40));

        txtReporte.setBackground(new java.awt.Color(204, 255, 204));
        txtReporte.setColumns(20);
        txtReporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtReporte.setForeground(new java.awt.Color(0, 0, 0));
        txtReporte.setRows(5);
        jScrollPane1.setViewportView(txtReporte);

        pnl2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 240, 280));

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnl2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 140, 70));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Distancia:");
        pnl2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 40));

        lblDistancia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDistancia.setText("-------------------------");
        pnl2.add(lblDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tiempo:");
        pnl2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 40));

        lblTiempo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTiempo.setText("-------------------------");
        pnl2.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 150, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subway_80px.png"))); // NOI18N
        pnl2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 90, 100));

        getContentPane().add(pnl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 290, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb19ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(19);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb19ActionPerformed

    private void rb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb0ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(0);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb0ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(3);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(4);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(5);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb5ActionPerformed

    private void rb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb6ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(6);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb6ActionPerformed

    private void rb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb7ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(7);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb7ActionPerformed

    private void rb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb8ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(8);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb8ActionPerformed

    private void rb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb9ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(9);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb9ActionPerformed

    private void rb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb10ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(10);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb10ActionPerformed

    private void rb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb11ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(11);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb11ActionPerformed

    private void rb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb12ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(12);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb12ActionPerformed

    private void rb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb13ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(13);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb13ActionPerformed

    private void rb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb14ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(14);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb14ActionPerformed

    private void rb18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb18ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(18);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb18ActionPerformed

    private void rb20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb20ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(20);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb20ActionPerformed

    private void rb21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb21ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(21);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb21ActionPerformed

    private void rb17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb17ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(17);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb17ActionPerformed

    private void rb16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb16ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(16);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb16ActionPerformed

    private void rb25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb25ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(25);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb25ActionPerformed

    private void rb15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb15ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(15);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb15ActionPerformed

    private void rb37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb37ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(37);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb37ActionPerformed

    private void rb24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb24ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(24);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb24ActionPerformed

    private void rb23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb23ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(23);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb23ActionPerformed

    private void rb22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb22ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(22);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb22ActionPerformed

    private void rb26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb26ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(26);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb26ActionPerformed

    private void rb29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb29ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(29);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb29ActionPerformed

    private void rb28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb28ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(28);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb28ActionPerformed

    private void rb27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb27ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(27);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb27ActionPerformed

    private void rb32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb32ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(32);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb32ActionPerformed

    private void rb31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb31ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(31);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb31ActionPerformed

    private void rb30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb30ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(30);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb30ActionPerformed

    private void rb35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb35ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(35);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb35ActionPerformed

    private void rb34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb34ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(34);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb34ActionPerformed

    private void rb33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb33ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(33);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb33ActionPerformed

    private void rb36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb36ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(36);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb36ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String est1 = this.lblEstacion1.getText();
        String est2 = this.lblEstacion2.getText();

        String distanciaProm = Rutas.distanciaPromedio(est1, est2);
        String tiempoProm = Rutas.tiempoPromedio(est1, est2);

        this.lblDistancia.setText(distanciaProm);
        this.lblTiempo.setText(tiempoProm);
        
        this.txtReporte.setText("");
        String datos[] = Rutas.busesDisponibles(est1, est2);
        String reporte = "";
        for (String dato : datos) {
            if (dato != null) {
                reporte += "   " + dato + "\n";
            }
        }
        this.txtReporte.setText(reporte);        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(2);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        Estacion tempEstacion = Sistema.estaciones.getEstacion(1);
        if (this.jRadioButton1.isSelected()) {
            this.lblEstacion1.setText(tempEstacion.getNombre());
        } else if (this.jRadioButton2.isSelected()) {
            this.lblEstacion2.setText(tempEstacion.getNombre());
        }
    }//GEN-LAST:event_rb1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblEstacion1;
    private javax.swing.JLabel lblEstacion2;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JRadioButton rb0;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb10;
    private javax.swing.JRadioButton rb11;
    private javax.swing.JRadioButton rb12;
    private javax.swing.JRadioButton rb13;
    private javax.swing.JRadioButton rb14;
    private javax.swing.JRadioButton rb15;
    private javax.swing.JRadioButton rb16;
    private javax.swing.JRadioButton rb17;
    private javax.swing.JRadioButton rb18;
    private javax.swing.JRadioButton rb19;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb20;
    private javax.swing.JRadioButton rb21;
    private javax.swing.JRadioButton rb22;
    private javax.swing.JRadioButton rb23;
    private javax.swing.JRadioButton rb24;
    private javax.swing.JRadioButton rb25;
    private javax.swing.JRadioButton rb26;
    private javax.swing.JRadioButton rb27;
    private javax.swing.JRadioButton rb28;
    private javax.swing.JRadioButton rb29;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb30;
    private javax.swing.JRadioButton rb31;
    private javax.swing.JRadioButton rb32;
    private javax.swing.JRadioButton rb33;
    private javax.swing.JRadioButton rb34;
    private javax.swing.JRadioButton rb35;
    private javax.swing.JRadioButton rb36;
    private javax.swing.JRadioButton rb37;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JRadioButton rb6;
    private javax.swing.JRadioButton rb7;
    private javax.swing.JRadioButton rb8;
    private javax.swing.JRadioButton rb9;
    private javax.swing.JTextArea txtReporte;
    // End of variables declaration//GEN-END:variables
}
