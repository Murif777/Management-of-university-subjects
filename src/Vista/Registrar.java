package Vista;

import Modelo.Archivo;
import Modelo.Cursos;
import Modelo.Estudiante;
import java.awt.Color;
import java.awt.Frame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class Registrar extends javax.swing.JFrame {

    //variables y arrays principales
    private final List<Estudiante> est = new ArrayList<>();
    private final List<Cursos> cursos = new ArrayList<>();
    private final List<Cursos> cursosadd = new ArrayList<>();
    private final List<String> codigosIntroducidos = new ArrayList<>();
    DefaultTableModel dtm = new DefaultTableModel();
    int fila;

    public Registrar() {
        initComponents();
        //agrega icono a la ventana
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/Imagenes/descarga.png"));
        setIconImage(iconoVentana.getImage());
        //define jtable
        dtm = (DefaultTableModel) tblListaCursos.getModel();
        Cursos();//llama los cursos por defecto
        mostrarTabla();//llama mostrar tabla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        panRegistrarCursos = new javax.swing.JPanel();
        scpTabla = new javax.swing.JScrollPane();
        tblListaCursos = new javax.swing.JTable();
        btnAñadir = new javax.swing.JButton();
        panRegistrareEstudiantes = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        btnCancelar.setBackground(new java.awt.Color(0, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel25.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

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

        lblTitulo.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registrar Estudiante");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add_User_96.png"))); // NOI18N

        panRegistrarCursos.setBackground(new java.awt.Color(48, 48, 48));
        panRegistrarCursos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Registrar Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblListaCursos.setBackground(new java.awt.Color(51, 51, 51));
        tblListaCursos.setForeground(new java.awt.Color(255, 255, 255));
        tblListaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Creditos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaCursos.setCellSelectionEnabled(true);
        tblListaCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblListaCursos.setFillsViewportHeight(true);
        scpTabla.setViewportView(tblListaCursos);
        tblListaCursos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (tblListaCursos.getColumnModel().getColumnCount() > 0) {
            tblListaCursos.getColumnModel().getColumn(0).setPreferredWidth(2);
            tblListaCursos.getColumnModel().getColumn(1).setPreferredWidth(5);
            tblListaCursos.getColumnModel().getColumn(2).setPreferredWidth(2);
        }

        btnAñadir.setBackground(new java.awt.Color(0, 153, 153));
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add25.png"))); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistrarCursosLayout = new javax.swing.GroupLayout(panRegistrarCursos);
        panRegistrarCursos.setLayout(panRegistrarCursosLayout);
        panRegistrarCursosLayout.setHorizontalGroup(
            panRegistrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarCursosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panRegistrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAñadir)
                    .addComponent(scpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panRegistrarCursosLayout.setVerticalGroup(
            panRegistrarCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistrarCursosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(scpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAñadir)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panRegistrareEstudiantes.setBackground(new java.awt.Color(48, 48, 48));
        panRegistrareEstudiantes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Registrar Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido");

        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Codigo");

        txtNombre.setBackground(new java.awt.Color(153, 153, 153));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));

        txtApellido.setBackground(new java.awt.Color(153, 153, 153));
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setBorder(null);
        txtApellido.setCaretColor(new java.awt.Color(255, 255, 255));

        txtCodigo.setBackground(new java.awt.Color(153, 153, 153));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setBorder(null);
        txtCodigo.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panRegistrareEstudiantesLayout = new javax.swing.GroupLayout(panRegistrareEstudiantes);
        panRegistrareEstudiantes.setLayout(panRegistrareEstudiantesLayout);
        panRegistrareEstudiantesLayout.setHorizontalGroup(
            panRegistrareEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrareEstudiantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panRegistrareEstudiantesLayout.setVerticalGroup(
            panRegistrareEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panRegistrareEstudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRegistrareEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panRegistrareEstudiantesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panRegistrareEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panRegistrareEstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNombre)
                                .addComponent(lblApellido)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo)))
                    .addComponent(txtApellido))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTitulo))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(panRegistrarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addComponent(panRegistrareEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagen)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panRegistrareEstudiantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panRegistrarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        panRegistrareEstudiantes.getAccessibleContext().setAccessibleName("Registro de estudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Retornar el panel principal para mostrarlo en principal
    public JPanel getPanelPrincipal() {
        return panPrincipal;
    }

    //cursos por defecto para seleccionar
    private void Cursos() {
        Cursos cur1 = new Cursos("SS463", "BASE DE DATOS", 3, 0);
        Cursos cur2 = new Cursos("MT402", "ECUACIONES DIFERENCIALES", 3, 0);
        Cursos cur3 = new Cursos("FS400", "ELECTROMAGNETISMO", 3, 0);
        Cursos cur4 = new Cursos("MT403", "ESTADISTICA DESCRIPTIVA", 3, 0);
        Cursos cur5 = new Cursos("UPC07", "LENGUA EXTRANJERA CONVERSACION", 2, 0);
        Cursos cur6 = new Cursos("SS462", "PROG DE COMPUTADORES III", 3, 0);
        Cursos cur7 = new Cursos("HM201", "HUMANIDADES I", 2, 0);
        Cursos cur8 = new Cursos("ING301", "METODOLOGIA DE LA INVESTIGACION", 2, 0);
        Cursos cur9 = new Cursos("UPC09", "ACTIVIDAD CULTURAL", 1, 0);
        Cursos cur10 = new Cursos("MT403", "ESTADISTICA DESCRIPTIVA", 3, 0);
        //agregar cursos por defecto a una array
        cursos.add(cur1);
        cursos.add(cur2);
        cursos.add(cur3);
        cursos.add(cur4);
        cursos.add(cur5);
        cursos.add(cur6);
        cursos.add(cur7);
        cursos.add(cur8);
        cursos.add(cur9);
        cursos.add(cur10);
    }

    //configuracion de jtable 
    private void confiTabla() {
        //definir tabla
        tblListaCursos.setModel(dtm);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);//centar contenido
        centerRenderer.setBackground(Color.LIGHT_GRAY);//poner colores
        centerRenderer.setForeground(Color.BLACK);
        for (int i = 0; i < tblListaCursos.getColumnModel().getColumnCount(); i++) {
            tblListaCursos.getColumnModel().getColumn(i).setHeaderRenderer(centerRenderer);//poner los titulos de cada columna 
        }
        DefaultTableCellRenderer centerRendererData = new DefaultTableCellRenderer();
        centerRendererData.setHorizontalAlignment(JLabel.CENTER);//centrar contenido de cursos
        tblListaCursos.getColumnModel().getColumn(0).setCellRenderer(centerRendererData);
        tblListaCursos.getColumnModel().getColumn(2).setCellRenderer(centerRendererData);
    }

    //muestra tabla en jtable
    private void mostrarTabla() {
        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);//resetear tabla
        }
        for (Cursos c : cursos) {//recorrer los cursos y agregarlos a la tabla
            Object datos[] = new Object[3];
            datos[0] = c.getCodigo();
            datos[1] = c.getNombreCurso();
            datos[2] = c.getCreditos();
            dtm.addRow(datos);//agregar cursis a la tabla
        }
        confiTabla();//llamar la configuracion de la tabla
    }

    //limpiador de labels y jtable
    private void limpiar() {
        // Limpiar campos de entrada para el nuevo estudiante
        txtNombre.setText("");
        txtApellido.setText("");
        txtCodigo.setText("");
        // Limpiar la lista de cursos para el próximo estudiante
        cursosadd.clear();
        // Puedes reiniciar la tabla de cursos si es necesario
        mostrarTabla();
        txtNombre.requestFocus();
    }

    //metodo para agregar un estudiante nuevo
    private void continuar() {
        int opcion = JOptionPane.showOptionDialog(//preguntar si desea seguir añadiendo estudiantes
                this,
                "¿Desea agregar otro estudiante?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // Utiliza el icono predeterminado
                new Object[]{"Sí", "No"}, // Opciones de botones
                "No" // Botón predeterminado
        );
        switch (opcion) {
            case JOptionPane.YES_OPTION:
                limpiar();//limpia todo para el proximo estudiante
                break;
            case JOptionPane.NO_OPTION:
                animacion();//animacion por si no
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }

    //metodo para verificar que no se repitan personas
    private boolean verificar(String nuevoCodigo) {
        boolean codigoExiste = codigosIntroducidos.contains(nuevoCodigo);//verificar si el codigo existe dentro de la array de codigos
        if (!codigoExiste) {
            codigosIntroducidos.add(nuevoCodigo);
        }
        return codigoExiste;//retorna true o false
    }

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

    private void animacion() {
        // Obtener una referencia al JFrame Menu
        Principal menuFrame = obtenerframe();
        // Verificar si la referencia es válida
        if (menuFrame != null) {
            // Obtener los paneles desde el JFrame Menu
            JPanel menu = menuFrame.getPanelmenu();
            JPanel ventana = menuFrame.getPanelventana();
            // Invocar la animación en el JFrame Menu
            if (menu.getX() != 0) {
                menuFrame.animacionX(menu, ventana);
                menuFrame.limpiar();
            } else {
                // Limpiar el contenido del panel principal en el JFrame actual
                menuFrame.limpiar();
            }
        } else {
            // Manejar la situación en la que no se pudo obtener la referencia al JFrame Menu
            JOptionPane.showMessageDialog(this, "No se pudo obtener la referencia al JFrame Menu", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        fila = tblListaCursos.getSelectedRow();//obtener fila seleccionada
        if (fila != -1) {
            if (cursosadd.size() <= 5) {//verificar que se añadan hasta 5 cursos
                //guardar los datos de los cursos seleccionados
                String codigo = tblListaCursos.getValueAt(fila, 0).toString();
                String nombreCur = tblListaCursos.getValueAt(fila, 1).toString();
                String creditos = tblListaCursos.getValueAt(fila, 2).toString();
                //introducir lo datos en un array 
                Cursos cursoSeleccionado = new Cursos(codigo, nombreCur, Integer.parseInt(creditos), 0);
                cursosadd.add(cursoSeleccionado);
                String mensaje = "Curso Agregado\n"//mensaje de confirmacion de curso añadido
                        + "Código: " + cursoSeleccionado.getCodigo() + "\n"
                        + "Nombre: " + cursoSeleccionado.getNombreCurso() + "\n"
                        + "Créditos: " + cursoSeleccionado.getCreditos() + "\n";
                // Eliminar la fila seleccionada del modelo de la tabla
                DefaultTableModel model = (DefaultTableModel) tblListaCursos.getModel();
                model.removeRow(fila);//ir eliminando los cursos seleccionados para no repetir
                // Establecer el modelo actualizado en la tabla
                tblListaCursos.setModel(model);
                JOptionPane.showMessageDialog(this, mensaje, "Curso Agregado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ya se han seleccionado 5 cursos para este estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un curso antes de añadir.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCodigo.getText().isEmpty()) {//verificar sque se hayan ingresado todos los datos
            JOptionPane.showMessageDialog(this, "Asegurese de registrar todos los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (cursosadd.isEmpty()) {//verificar que se haya registrado algun curso
            JOptionPane.showMessageDialog(this, "Registre al menos un curso", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String nuevoCodigo = txtCodigo.getText();//guarda el codigo
            boolean verificacion = verificar(nuevoCodigo);//se llama el metodo verificar para saber si esta repetido
            if (verificacion) {//verificacion si ya se encuentra ese codigo
                JOptionPane.showMessageDialog(this, "El código del estudiante ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                //crear estudiante segun los datos ingresados
                Estudiante estudiante = new Estudiante();
                estudiante.setNombre(txtNombre.getText());
                estudiante.setApellido(txtApellido.getText());
                estudiante.setCodigo(nuevoCodigo);
                //poner los cursos seleccionados a su respectivo estudiante
                estudiante.setCursos(new ArrayList<>(cursosadd));
                //agregar el estudiante a la array de estudiantes
                est.add(estudiante);
                try {
                    Archivo.guardar((ArrayList<Estudiante>) est);//guardar la array de estudiantes en un archivo
                    est.clear();//limpiar array de estudiantes
                    continuar();//llamar metodo continuar 
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "No se pudo guardar los datos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        animacion();//animaciones de ventana
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panRegistrarCursos;
    private javax.swing.JPanel panRegistrareEstudiantes;
    private javax.swing.JScrollPane scpTabla;
    private javax.swing.JTable tblListaCursos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
