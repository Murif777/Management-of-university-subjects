package Vista;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Animacion.Animacion;
import javax.swing.JOptionPane;

public final class Principal extends javax.swing.JFrame {

    private final Login login = new Login();
    private final JPanel jpnlogin = login.getPanelogin();

    public Principal() {
        initComponents();
        //cambiar icono de ventana
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/Imagenes/descarga.png"));
        setIconImage(iconoVentana.getImage());
        //desactivar los botones de la ventana 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //poner login al iniciar el programa
        Mostrarpanmenu(jpnlogin);
        //desactivar panel y botones de noti al salir
        btnSI.setVisible(false);
        btnNO.setVisible(false);
        panNoti.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        panMenu = new javax.swing.JPanel();
        panVentana = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        panNoti = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnSI = new javax.swing.JButton();
        btnNO = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(876, 600));
        setMinimumSize(new java.awt.Dimension(876, 600));
        setUndecorated(true);
        setResizable(false);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        panPrincipal.setPreferredSize(new java.awt.Dimension(876, 600));

        panMenu.setBackground(new java.awt.Color(51, 51, 51));
        panMenu.setLayout(new java.awt.BorderLayout());

        panVentana.setBackground(new java.awt.Color(51, 51, 51));
        panVentana.setPreferredSize(new java.awt.Dimension(600, 600));
        panVentana.setRequestFocusEnabled(false);
        panVentana.setVerifyInputWhenFocusTarget(false);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-upc (1).png"))); // NOI18N

        javax.swing.GroupLayout panVentanaLayout = new javax.swing.GroupLayout(panVentana);
        panVentana.setLayout(panVentanaLayout);
        panVentanaLayout.setHorizontalGroup(
            panVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVentanaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        panVentanaLayout.setVerticalGroup(
            panVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVentanaLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panNoti.setBackground(new java.awt.Color(102, 102, 102));
        panNoti.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panNoti.setVerifyInputWhenFocusTarget(false);
        panNoti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("¿Seguro que quiere salir?");
        panNoti.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        btnSI.setBackground(new java.awt.Color(255, 0, 0));
        btnSI.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnSI.setForeground(new java.awt.Color(255, 255, 255));
        btnSI.setText("SI");
        btnSI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSI.setFocusPainted(false);
        btnSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIActionPerformed(evt);
            }
        });
        panNoti.add(btnSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, -1));

        btnNO.setBackground(new java.awt.Color(0, 153, 153));
        btnNO.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnNO.setForeground(new java.awt.Color(255, 255, 255));
        btnNO.setText("NO");
        btnNO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNO.setFocusPainted(false);
        btnNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOActionPerformed(evt);
            }
        });
        panNoti.add(btnNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 60, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida25.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ayuda25.png"))); // NOI18N
        btnAyuda.setBorderPainted(false);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAyuda.setFocusPainted(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addComponent(panMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir))
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(920, 920, 920)
                .addComponent(btnAyuda))
            .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPrincipalLayout.createSequentialGroup()
                    .addGap(490, 490, 490)
                    .addComponent(panNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(261, Short.MAX_VALUE)))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(panVentana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panPrincipalLayout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addComponent(panNoti, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(256, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // metodos para las animaciones
    public void limpiar() {//activa el logo al salir de cualquier ventana
        panVentana.removeAll();
        panVentana.add(lblLogo);
        panVentana.revalidate();
        panVentana.repaint();
    }

    public void activarBotones() {//activa los botones para ser activados desde otra ventana
        panNoti.setVisible(true);
        btnSI.setVisible(true);
        btnNO.setVisible(true);

    }

    public JPanel getPanelmenu() {//envia el panelmenu
        return panMenu;
    }

    public JPanel getPanelnoti() {//envia el panel noti
        return panNoti;
    }

    public JPanel getPanelventana() {//envia el panel de ventana 
        return panVentana;
    }

    public void animacionX(JPanel menu, JPanel ventana) {//animaciones de derecha a izquiera para los paneles
        int VentanaX = panMenu.getX();
        if (VentanaX > -1) {
            Animacion.mover_izquierda(0, -220, 10, 5, menu);
            Animacion.mover_izquierda(290, 200, 10, 5, ventana);
        } else {
            Animacion.mover_derecha(-220, 0, 10, 5, menu);
            Animacion.mover_derecha(200, 290, 10, 5, ventana);
        }
    }

    public void Mostrarpanmenu(JPanel panel) {//
        panel.setSize(269, 600);
        panel.setLocation(0, 0);
        panMenu.removeAll();
        panMenu.add(panel, BorderLayout.CENTER);
        panMenu.revalidate();
        panMenu.repaint();
    }

    ///////////////////////////////////////////////////
    private void btnSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSIActionPerformed
        System.exit(0);//cerrar todo
    }//GEN-LAST:event_btnSIActionPerformed

    private void btnNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOActionPerformed
        Animacion.mover_derecha(698, 1000, 10, 5, panNoti);//animaciones al seleccionar el boton NO
        Animacion.mover_derecha(-280, 0, 10, 5, panMenu);
        Animacion.mover_derecha(90, 270, 10, 5, panVentana);
    }//GEN-LAST:event_btnNOActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Animacion.mover_izquierda(1000, 698, 10, 5, panNoti);//animaciones al seleccionar el boton salir
        activarBotones();
        Animacion.mover_izquierda(0, -280, 10, 5, panMenu);
        Animacion.mover_izquierda(300, 70, 10, 5, panVentana);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        //mensaje para el boton de ayuda
        String mensajeAyuda = "¡Gracias por usar nuestra aplicación de gestión de cursos!\n\n"
                + "Desarrollado en: Netbeans 18, JAVA jdk 20\n"
                + "Realizado por: Farid Muriel y Juan Navarro\n"
                + "Contacto: fmuriel@unicesar.edu.co";
        //mostrar mensaje
        JOptionPane.showMessageDialog(null, mensajeAyuda, "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAyudaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnNO;
    private javax.swing.JButton btnSI;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panMenu;
    private javax.swing.JPanel panNoti;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panVentana;
    // End of variables declaration//GEN-END:variables
}
