/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.iesiliberis.crudcentroeducativo.formularios;

import com.iesiliberis.crudcentroeducativo.controladorDAO.AlumnoDaoImp;
import com.iesiliberis.crudcentroeducativo.controladorDAO.AulaDaoImp;
import com.iesiliberis.crudcentroeducativo.controladorDAO.CursoAcademicoDaoImp;
import com.iesiliberis.crudcentroeducativo.controladorDAO.UnidadDaoImp;
import com.iesiliberis.crudcentroeducativo.entidades.Alumno;
import com.iesiliberis.crudcentroeducativo.entidades.Aula;
import com.iesiliberis.crudcentroeducativo.entidades.CursoAcademico;
import com.iesiliberis.crudcentroeducativo.entidades.Unidad;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sergio
 */
public class frmInternoAula extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmInternoAlumnos
     */
    public frmInternoAula() {
        initComponents();
        configTabla();
        cargaTabla();
    }

     private void configTabla(){ 
    
     String col[]={"ID","CODIGO","DESCRIPCION"};
        
        DefaultTableModel modelo=new DefaultTableModel(col,0){
        
              @Override
              public boolean isCellEditable(int row, int column){
                  return false;
              }
        
        };
        
        jtAlumnos.setModel(modelo);
        jtAlumnos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
        //configuro evento valor cambiado...
/*        jtCursos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            System.out.println(jtCursos.getValueAt(jtCursos.getSelectedRow(), 0).toString());
            setCampos();
        }
    });
  */      
}
   
   
    private void cargaTabla(){
        DefaultTableModel modelo=(DefaultTableModel)jtAlumnos.getModel();
        
        AulaDaoImp aulacontroller=AulaDaoImp.getInstance();
        System.out.println(aulacontroller);
        String[] fila=new String[4];
        
        modelo.setNumRows(0);
        try{
            List<Aula> lst=aulacontroller.getAll();
            
            for( Aula a :lst){
                fila[0]=""+a.getId();
                fila[1]=""+a.getCodigo();
                fila[2]=""+a.getDescripcion();
                modelo.addRow(fila);
            }
            //selecciono la primera fila
           jtAlumnos.setRowSelectionInterval(0,0); 
           
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Curso Academico");

        jLabel1.setText("Buscar");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlumnos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            DefaultTableModel modelo=(DefaultTableModel) jtAlumnos.getModel();
            TableRowSorter<TableModel> trSorter = new TableRowSorter<TableModel>(modelo);

            jtAlumnos.setRowSorter(trSorter);

            if (txtBuscar.getText().length()==0) {
                trSorter.setRowFilter(null);
            }else{
                trSorter.setRowFilter(RowFilter.regexFilter(txtBuscar.getText().trim()));
            }

        }

    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jtAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlumnosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount()==2){
            // System.out.println("Doble click.....");
            //Cargar el detalle de un alumno
            /*JDialog frame=new JDialog(this,"Detalle Alumno",true);

            jpAlumnoDetalle panel=new jpAlumnoDetalle();

            int idseleccion=Integer.parseInt(jtAlumnos.getValueAt(jtAlumnos.getSelectedRow(), 0).toString());

            panel.CargaDetalle(idseleccion);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);
*/
        }
    }//GEN-LAST:event_jtAlumnosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAlumnos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
