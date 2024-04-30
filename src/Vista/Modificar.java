package Vista;

import Modelo.Archivo;
import Modelo.Cursos;
import Modelo.Estudiante;
import java.awt.Color;
import java.awt.Frame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class Modificar extends javax.swing.JFrame {
    //crear arraylist y tabla
    private List<Estudiante> estudiantes = new ArrayList<>();
    DefaultTableModel dtm = new DefaultTableModel();

    public Modificar() throws IOException {
        initComponents();
        //cambiar icono de ventana
        ImageIcon iconoVentana = new ImageIcon(getClass().getResource("/Imagenes/descarga.png"));
        setIconImage(iconoVentana.getImage());
        //definir jtable
        dtm = (DefaultTableModel) tblListaCursos.getModel();
        confiTabla();
        // escuchador para seleccionar directamente del jtable
        ListSelectionModel selectionModel = tblListaCursos.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Llamar a un método para actualizar txtNota
                actualizarTxtNotaDesdeTabla();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        panBuscar = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        panEditar = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        scpTabla = new javax.swing.JScrollPane();
        tblListaCursos = new javax.swing.JTable();
        txtNombre = new javax.swing.JLabel();
        txtApellido = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        panBuscar.setBackground(new java.awt.Color(48, 48, 48));
        panBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Buscar estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        panBuscar.setForeground(new java.awt.Color(48, 48, 48));

        lblBuscar.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar.setText("Buscar ");

        txtBuscar.setBackground(new java.awt.Color(153, 153, 153));
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(null);
        txtBuscar.setCaretColor(new java.awt.Color(255, 255, 255));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search25.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panBuscarLayout.setVerticalGroup(
            panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblBuscar)
                    .addComponent(txtBuscar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panEditar.setBackground(new java.awt.Color(48, 48, 48));
        panEditar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Editar datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNombre.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblApellido.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido:");

        lblCodigo.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Codigo:");

        lblNota.setForeground(new java.awt.Color(255, 255, 255));
        lblNota.setText("Nota:");

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
        tblListaCursos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        txtNombre.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));

        txtApellido.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));

        txtCodigo.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));

        txtNota.setBackground(new java.awt.Color(153, 153, 153));
        txtNota.setForeground(new java.awt.Color(255, 255, 255));
        txtNota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNota.setBorder(null);
        txtNota.setCaretColor(new java.awt.Color(255, 255, 255));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add25.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete25.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEditarLayout = new javax.swing.GroupLayout(panEditar);
        panEditar.setLayout(panEditarLayout);
        panEditarLayout.setHorizontalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarLayout.createSequentialGroup()
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(lblNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panEditarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panEditarLayout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panEditarLayout.setVerticalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarLayout.createSequentialGroup()
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCodigo, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(scpTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNota)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(txtNota))
                .addContainerGap())
        );

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
        lblTitulo.setText("Modificar datos");

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edit_User_icon96.png"))); // NOI18N

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panPrincipalLayout.createSequentialGroup()
                        .addComponent(panBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(lblUser)))
                .addGap(99, 99, 99))
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lblTitulo))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar))
                .addGap(43, 43, 43))
        );

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

    public JPanel getPanelPrincipal() {//enviar panel principal
        return panPrincipal;
    }

    //metodo para seleccionar nota directamente del jtable 
    private void actualizarTxtNotaDesdeTabla() {
        int filaSeleccionada = tblListaCursos.getSelectedRow(); //seleccionar fila
        if (filaSeleccionada != -1) {
            Object nota = tblListaCursos.getValueAt(filaSeleccionada, 3); // Obtener la nota
            txtNota.setText(String.valueOf(nota)); // Mostrar la nota en txtNota
        } else {
            // Si no hay fila seleccionada borrar el contenido de txtNota
            txtNota.setText("");
        }
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
                // Limpia la tabla antes de agregar nuevas filas
                dtm.setRowCount(0);
                //verificar que el estudiante tenga cursos
                if (!e.getCursos().isEmpty()) {
                    for (Cursos curso : e.getCursos()) {//recorrer cursos
                        Object datos[] = new Object[4];
                        datos[0] = curso.getCodigo();
                        datos[1] = curso.getNombreCurso();
                        datos[2] = curso.getCreditos();
                        datos[3] = curso.getNota();
                        dtm.addRow(datos);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El estudiante no tiene cursos registrados", "Error", JOptionPane.ERROR_MESSAGE);
                    //preguntar si borrar el estudiante sin cursos
                    int result = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el estudiante sin cursos?", "Confirmar eliminacion", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(this, "Estudiante: " + e.getNombre() + " " + e.getApellido() + " ha sido eliminiado", "Archivo agregado", JOptionPane.INFORMATION_MESSAGE);
                        estudiantes.remove(e);
                    }
                }
                sw = true;//switch de busqueda
                break;
            }
        }
        if (!sw) {
            //si no se encuentra vaciar todo
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

    //cambia la nota del array y la pone en el jtable
    private void cambiarNota(String code, int fila, Float newNota){
        //afectar arraylist
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(code)) {
                List<Cursos> cursos = estudiante.getCursos();
                Cursos curso = cursos.get(fila);
                curso.setNota(newNota);
                estudiante.setCursos(cursos);//guarda la nueva nota en la array
                break;
            }
        }
        //mostrar jtable
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equals(code)) {//verificador
                // Limpia la tabla antes de agregar nuevas filas
                dtm.setRowCount(0);
                //mostrar jtable
                for (Cursos curso : e.getCursos()) {
                    //mostrar en el jtable
                    Object datos[] = new Object[4];
                    datos[0] = curso.getCodigo();
                    datos[1] = curso.getNombreCurso();
                    datos[2] = curso.getCreditos();
                    datos[3] = curso.getNota();
                    dtm.addRow(datos);
                }
                break;
            }
        }
        confiTabla();
    }

    //Eliminar curso de estudiante
    private void eliminarCurso(String code, int fila) {
        //afectar arraylist
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo().equals(code)) {
                List<Cursos> cursos = estudiante.getCursos();
                cursos.remove(fila);  // Elimina el curso seleccionado
                estudiante.setCursos(cursos);
                break;
            }
        }
        //mostrar jtable
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equals(code)) {
                // Limpia la tabla antes de agregar nuevas filas
                dtm.setRowCount(0);
                //mostrar jtable
                for (Cursos curso : e.getCursos()) {
                    //mostrar en jtable
                    Object datos[] = new Object[4];
                    datos[0] = curso.getCodigo();
                    datos[1] = curso.getNombreCurso();
                    datos[2] = curso.getCreditos();
                    datos[3] = curso.getNota();
                    dtm.addRow(datos);
                }
                break;
            }
        }
        confiTabla();
    }

    //animaciones al cancelar
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
            buscarEstudiante();//llama el metodo para buscar estudiante
        } catch (IOException ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int fila = tblListaCursos.getSelectedRow();//saber cual fila se ha seleccionado
        if (fila != -1) {
            String code = txtBuscar.getText();//obtener codigo
            String newNotastr = txtNota.getText();//obtener nota
            try {
                Float newNota = Float.valueOf(newNotastr);
                if (newNota >= 1.5 && newNota <= 5) {//verificar si la nota esta en el rango correcto
                    cambiarNota(code, fila, newNota);//llama metodo cambiar nota pasando los parametros
                } else {
                    txtNota.setText("");//limpiar txtnota para ser usado varias veces
                    JOptionPane.showMessageDialog(this, "La nota debe estar entre 1.5 y 5", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error en la nota ingresada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un curso antes de añadir.", "Error", JOptionPane.ERROR_MESSAGE);
            txtNota.setText("");//limpiar txtnota
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (!txtBuscar.getText().isEmpty()) {//verificar si txtbuscar esta vacio
            try {
                Archivo.limpiar();//llama metodo de archivo
                Archivo.guardar((ArrayList<Estudiante>) estudiantes);//llama meotodo guardar de archivo
                JOptionPane.showMessageDialog(this, "Datos actualizados", "Estado", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar los datos", "estado", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha registrado ningun dato", "estado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
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
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblListaCursos.getSelectedRow();//obtener la fila seleccionada
        String code = txtBuscar.getText();
        if (fila != -1) {//verificar si se seleccionó una fila
            int result = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres eliminar el curso?", "Eliminar curso", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Curso eliminado", "Estado", JOptionPane.INFORMATION_MESSAGE);
                eliminarCurso(code, fila);//llama metodo eliminar curso
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona el curso a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            txtNota.setText("");//limpiar txtnota para ser usado varias veces
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Modificar().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panBuscar;
    private javax.swing.JPanel panEditar;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JScrollPane scpTabla;
    private javax.swing.JTable tblListaCursos;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
