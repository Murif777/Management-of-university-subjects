package Vista;

import Modelo.Archivo;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Animacion.Animacion;
import java.awt.Frame;
import javax.swing.JFrame;

public final class Menu extends javax.swing.JFrame {
    private Registrar registrar;
    private Modificar modificar;
    private Buscar buscar;
    // Obtener una referencia al JFrame Menu
    private final Principal prin = obtenerframe();
    // Obtener los paneles desde el JFrame Menu
    JPanel pnlNoti = prin.getPanelnoti();
    JPanel jpnlventana = prin.getPanelventana();
    JPanel pnlmenu = prin.getPanelmenu();
    public Menu() {
        initComponents();
        //cambiar icono de ventana
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/Imagenes/descarga.png"));
        setIconImage(iconoVentana.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        panBotones = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(876, 600));
        setUndecorated(true);
        setResizable(false);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panBotones.setBackground(new java.awt.Color(48, 48, 48));
        panBotones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Elija una opcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 153));
        btnRegistrar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add_User_icon-icons.com_55971.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 153, 153));
        btnModificar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit_User_icon-icons.com_55920.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 153, 153));
        btnBuscar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reviewer_icon-icons.com_55824.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotonesLayout = new javax.swing.GroupLayout(panBotones);
        panBotones.setLayout(panBotonesLayout);
        panBotonesLayout.setHorizontalGroup(
            panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotonesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panBotonesLayout.setVerticalGroup(
            panBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotonesLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        panPrincipal.add(panBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 330));

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_user_student_staff_person_icon-icons.com_75492.png"))); // NOI18N
        panPrincipal.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        lblTitulo1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Gestion");
        panPrincipal.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblTitulo3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo3.setText(" estudiante");
        panPrincipal.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        lblTitulo2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo2.setText(" de");
        panPrincipal.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/next32.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusPainted(false);
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        panPrincipal.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 40, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public JPanel getPanelmenu() {//envia panel principal para animaciones
        return panPrincipal;
    }
    
    //metodo para obtener jframe principal
    private Principal obtenerframe() {
        // Obtener una matriz de todos los frames activos
        Frame[] frames = JFrame.getFrames();
        // Iterar sobre los frames para encontrar una instancia de Menu
        for (Frame frame : frames) {
            if (frame instanceof Principal) {
                return (Principal) frame;
            }
        }
        // Retornar null si no se encuentra una instancia de Menu
        return null;
    }

    //animaciones
    private void animacionX(JPanel menu, JPanel ventana) {
        int VentanaX = pnlmenu.getX();//obtener posicion
        if (VentanaX > -1) {//mover izquierda o derecha segun la posicion
            Animacion.mover_izquierda(0, -220, 10, 5, menu);
            Animacion.mover_izquierda(290, 200, 10, 5, ventana);
        } else {
            Animacion.mover_derecha(-220, 0, 10, 5, menu);
            Animacion.mover_derecha(200, 290, 10, 5, ventana);
        }
    }

    //mostrar paneles
    private void mostrar(JPanel panel) {
        panel.setSize(600, 600);
        panel.setLocation(0, 0);
        jpnlventana.removeAll();//limpiar panel
        jpnlventana.add(panel, BorderLayout.CENTER);
        jpnlventana.revalidate();
        jpnlventana.repaint();//reactivar panel
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            if (Archivo.verificar()) {//verificar si el archivo a sido creado o tiene contenido
                buscar = new Buscar(); //abrir ventana buscar
                JPanel pnlPrincipalBuscar = buscar.getPanelPrincipal();
                mostrar(pnlPrincipalBuscar);//mostrar menu buscar en ventana principal
            } else {
                JOptionPane.showMessageDialog(this, "No hay datos registrados\nIntente registrar algun estudiante primero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(Menu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if (Archivo.verificar()) {//verificar si el archivo ha sido creado o tiene datos
                try {
                    modificar = new Modificar();// abrir jframe 
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                JPanel pnlPrincipalModificar = modificar.getPanelPrincipal();
                mostrar(pnlPrincipalModificar);//mostrar panel en panventana de jframe principal
            } else {
                JOptionPane.showMessageDialog(this, "No hay datos registrados\nIntente registrar algun estudiante primero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(Menu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar = new Registrar();//abrir vetana
        JPanel pnlPrincipalRegistrar = registrar.getPanelPrincipal();
        mostrar(pnlPrincipalRegistrar);//mostrar panel en jframe Principal
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        animacionX(pnlmenu, jpnlventana);//animaciones al dar click en boton menu
    }//GEN-LAST:event_btnMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panBotones;
    private javax.swing.JPanel panPrincipal;
    // End of variables declaration//GEN-END:variables
}
