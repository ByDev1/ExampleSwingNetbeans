/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import model.entities.Alumno;
import model.entities.Materia;
import model.entities.Profesor;

/**
 *
 * @author banto
 */
public class MatriculacionViewArrayList extends JFrame{
    
    private Alumno alumno;
    private int rowToInserted = 0;
    private Materia[] materias;
    List alumnoRepositorio;
    List materiasRepositorio;
    
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInscribir;
    private javax.swing.JButton jButtonMatricular;
    private javax.swing.JComboBox<Materia> jComboBoxMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInscripciones;
    private javax.swing.JTextField jTextFieldAlumnoApellido;
    private javax.swing.JTextField jTextFieldAlumnoNombre;
    private javax.swing.JTextField jTextFieldProfesor;
    private javax.swing.JCheckBox jCheckBox;
    
     /**
     * Creates new form Matriculacion
     */
    public MatriculacionViewArrayList() {
        initData();
        initComponents();
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Matriculacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriculacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriculacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriculacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatriculacionViewArrayList().setVisible(true);
            }
        });
    }
    
    private void initData() {
        alumnoRepositorio = new ArrayList();
        alumnoRepositorio.add(new Alumno("Ernesto", "Buitron"));
        alumnoRepositorio.add(new Alumno("Julia", "Gonzalez"));
        alumnoRepositorio.add(new Alumno("Enrique", "Gonzalez"));
        alumnoRepositorio.add(new Alumno("Ernesto", "Guevara"));
        
        materiasRepositorio = new ArrayList();
        materiasRepositorio.add(new Materia("Matematicas", new Profesor("Lic. Pepito")));
        materiasRepositorio.add(new Materia("Programacion", new Profesor("Lic. Agusta")));
        materiasRepositorio.add(new Materia("Base de Datos", new Profesor("Lic. Hugo")));
        materiasRepositorio.add(new Materia("Pedagogia", new Profesor("Lic. Josefina")));
        
        alumno = (Alumno) alumnoRepositorio.get(0);
        materias = (Materia[]) materiasRepositorio.toArray(new Materia[materiasRepositorio.size()]);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAlumnoNombre = new javax.swing.JTextField();
        jTextFieldAlumnoApellido = new javax.swing.JTextField();
        jComboBoxMateria = new javax.swing.JComboBox<>();
        jButtonInscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInscripciones = new javax.swing.JTable();
        jTextFieldProfesor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonMatricular = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");
        jLabel2.setToolTipText("");

        jLabel3.setText("Materia");

        jTextFieldAlumnoNombre.setEditable(false);
        jTextFieldAlumnoNombre.setText(alumno.getNombre());

        jTextFieldAlumnoApellido.setEditable(false);
        jTextFieldAlumnoApellido.setText(alumno.getApellido());

        jComboBoxMateria.setModel(new DefaultComboBoxModel<Materia>(materias));

        jButtonInscribir.setText("Inscribir");

        jTableInscripciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Materia", "Profesor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableInscripciones);

        jTextFieldProfesor.setEditable(false);
        jTextFieldProfesor.setColumns(10);

        jLabel4.setText("Profesor");

        jButtonMatricular.setText("Matricular");

        jButtonEliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAlumnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAlumnoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonInscribir)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMatricular)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAlumnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAlumnoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInscribir)
                    .addComponent(jButtonMatricular)
                    .addComponent(jButtonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        
        jButtonInscribir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jTableInscripciones.getModel().setValueAt(jComboBoxMateria.getSelectedItem(), rowToInserted, 0);
                jTableInscripciones.getModel().setValueAt(jTextFieldProfesor.getText(), rowToInserted, 1);
                rowToInserted++;
            }
        });
        
        jButtonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jTableInscripciones.getModel().setValueAt(null, rowToInserted - 1, 0);
                jTableInscripciones.getModel().setValueAt(null, rowToInserted - 1, 1);
                rowToInserted--;
            }
        });
        
        jButtonMatricular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //recorrer table y guardar en alumno Materias y Alumno Repositorio
            }
        });
        
        jComboBoxMateria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Profesor profesorMateriaItemSelected = ((Materia) materiasRepositorio.get(jComboBoxMateria.getSelectedIndex())).getProfesor();
                System.out.println(profesorMateriaItemSelected);
                jTextFieldProfesor.setText(profesorMateriaItemSelected.getNombre());
            }
        });
        
        
    }
}
