package Vista;

import Modelo.Archivo;
import Modelo.Cursos;
import Modelo.Estudiante;
import java.awt.Color;
import java.awt.Frame;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class Buscar extends javax.swing.JFrame {
    //crear arraylist principal y tabla
    private List<Estudiante> estudiantes = new ArrayList<>();
    DefaultTableModel dtm = new DefaultTableModel();

    public Buscar() {
        initComponents();
        //cambiar icono de ventana
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/Imagenes/descarga.png"));
        setIconImage(iconoVentana.getImage());
        //definir jtable
        dtm = (DefaultTableModel) tblListaCursos.getModel();
        confiTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        panTabla = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        lblPromedio = new javax.swing.JLabel();
        scpTabla = new javax.swing.JScrollPane();
        tblListaCursos = new javax.swing.JTable();
        txtPromedio = new javax.swing.JLabel();
        panBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        panTabla.setBackground(new java.awt.Color(48, 48, 48));
        panTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Buscar estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));

        lblApellido.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));

        lblCodigo.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Codigo:");

        txtCodigo.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));

        lblPromedio.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        lblPromedio.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedio.setText("Promedio");

        tblListaCursos.setBackground(new java.awt.Color(51, 51, 51));
        tblListaCursos.setForeground(new java.awt.Color(255, 255, 255));
        tblListaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Creditos", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaCursos.setCellSelectionEnabled(true);
        tblListaCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblListaCursos.setFillsViewportHeight(true);
        scpTabla.setViewportView(tblListaCursos);
        tblListaCursos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtPromedio.setFont(new java.awt.Font("Century Schoolbook", 0, 12)); // NOI18N
        txtPromedio.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panTablaLayout = new javax.swing.GroupLayout(panTabla);
        panTabla.setLayout(panTablaLayout);
        panTablaLayout.setHorizontalGroup(
            panTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTablaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(scpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panTablaLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPromedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panTablaLayout.setVerticalGroup(
            panTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTablaLayout.createSequentialGroup()
                .addGroup(panTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panBuscar.setBackground(new java.awt.Color(48, 48, 48));
        panBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search25.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(153, 153, 153));
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(null);
        txtBuscar.setCaretColor(new java.awt.Color(255, 255, 255));

        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setText("Buscar ");

        javax.swing.GroupLayout panBuscarLayout = new javax.swing.GroupLayout(panBuscar);
        panBuscar.setLayout(panBuscarLayout);
        panBuscarLayout.setHorizontalGroup(
            panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panBuscarLayout.setVerticalGroup(
            panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuscarLayout.createSequentialGroup()
                .addGroup(panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reviewer_icon-96.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Ver estudiante");

        btnAceptar.setBackground(new java.awt.Color(0, 153, 153));
        btnAceptar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar32.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(panBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUser)
                        .addGap(29, 29, 29))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPrincipalLayout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(btnAceptar))
                            .addGroup(panPrincipalLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panPrincipalLayout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(lblTitulo)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(panBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUser)
                        .addGap(18, 18, 18)))
                .addComponent(panTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //retornar panel principal para mostrar en menu
    public JPanel getPanelPrincipal() {
        return panPrincipal;
    }
    
    //metodo que calcula el promedio de las notas
    private float promedio() {
        //obtener datos
        String code = txtBuscar.getText();
        float suma = 0;
        int totalCred = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            //verificar estudiante
            if (estudiantes.get(i).getCodigo().equals(code)) {
                List<Cursos> cursos = estudiantes.get(i).getCursos();
                for (Cursos curso : cursos) {
                    //calcular nota
                    suma += curso.getNota() * curso.getCreditos();
                    totalCred += curso.getCreditos();
                }
                break;  // Puedes salir del bucle externo una vez que encuentras al estudiante
            }
        }
        //retornar nota
        float promedioPonderado = totalCred > 0 ? suma / totalCred : 0;
        return promedioPonderado;
    }

    //configuracion de la tabla
    private void confiTabla() {
        tblListaCursos.setModel(dtm); // Establece el modelo de la tabla
        // Centrar los títulos de las columnas
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        centerRenderer.setBackground(Color.LIGHT_GRAY);
        centerRenderer.setForeground(Color.BLACK);
        for (int i = 0; i < tblListaCursos.getColumnModel().getColumnCount(); i++) {
            tblListaCursos.getColumnModel().getColumn(i).setHeaderRenderer(centerRenderer);
        }
        // Centrar los datos de las columnas
        DefaultTableCellRenderer centerRendererData = new DefaultTableCellRenderer();
        centerRendererData.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tblListaCursos.getColumnModel().getColumnCount(); i++) {
            tblListaCursos.getColumnModel().getColumn(i).setCellRenderer(centerRendererData);
        }
    }

    //metodo para buscar estudiantes
    private void buscarEstudiante() throws IOException {
        estudiantes = Archivo.leer();//llama al metodo leer para guardar los datos almacenados en la array
        String code = txtBuscar.getText();
        boolean sw = false;//switch de busqueda
        for (Estudiante e : estudiantes) {//recorrer estudiantes
            if (e.getCodigo().equals(code)) {//buscador
                txtNombre.setText(e.getNombre());
                txtApellido.setText(e.getApellido());
                txtCodigo.setText(e.getCodigo());
                float prom = promedio();
                // Limpia la tabla antes de agregar nuevas filas
                dtm.setRowCount(0);
                if (!e.getCursos().isEmpty()) {
                    for (Cursos curso : e.getCursos()) {//recorrer cursos
                        Object datos[] = new Object[4];
                        datos[0] = curso.getCodigo();
                        datos[1] = curso.getNombreCurso();
                        datos[2] = curso.getCreditos();
                        datos[3] = curso.getNota();
                        //agregar datos a la tabla
                        dtm.addRow(datos);
                    }
                    // formato a un float
                    DecimalFormat formato = new DecimalFormat("#.##");
                    String promedio = formato.format(prom);
                    if (prom < 3.25) {
                        JOptionPane.showMessageDialog(this, "Con el promedio " + promedio + " el estudiante entra en prueba academica", "Prueba academica", JOptionPane.INFORMATION_MESSAGE);
                    }
                    txtPromedio.setText(promedio);
                } else {
                    JOptionPane.showMessageDialog(this, "El estudiante no tiene cursos registrados", "Error", JOptionPane.ERROR_MESSAGE);

                }
                sw = true;//switch de busqueda
                break;
            }
        }
        if (!sw) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado el estudiante", "Error", JOptionPane.ERROR_MESSAGE);
            txtBuscar.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtCodigo.setText("");
            txtBuscar.requestFocus();
            dtm.setRowCount(0);
        }
        confiTabla();
    }

    //obtener jframe
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            buscarEstudiante();
        } catch (IOException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // Obtener una referencia al JFrame Menu
        Principal menuFrame = obtenerframe();
        // Verificar si la referencia es válida
        if (menuFrame != null) {
            // Obtener los paneles desde el JFrame Menu
            JPanel menu = menuFrame.getPanelmenu();
            JPanel ventana = menuFrame.getPanelventana();

            // Invocar la animación en el JFrame Menu
            if(menu.getX()!=0){
            menuFrame.animacionX(menu, ventana);
            menuFrame.limpiar();  
            }else{
                // Limpiar el contenido del panel principal en el JFrame actual
                menuFrame.limpiar();  
            }
            
        } else {
            // Manejar la situación en la que no se pudo obtener la referencia al JFrame Menu
            JOptionPane.showMessageDialog(this, "No se pudo obtener la referencia al JFrame Menu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPromedio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panBuscar;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panTabla;
    private javax.swing.JScrollPane scpTabla;
    private javax.swing.JTable tblListaCursos;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPromedio;
    // End of variables declaration//GEN-END:variables
}
