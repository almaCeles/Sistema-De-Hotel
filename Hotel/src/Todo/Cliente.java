/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;

import Metodos.medi;
import dataBase.Conecccion;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alma Cuevas <celeste300298@gmail.com>
 */
public class Cliente extends javax.swing.JFrame {
   public  static int total; 
 Conecccion connecion = new Conecccion("jdbc:mysql://127.0.0.1/sys" , "root" , "morado");
    /**
     * Creates new form Cliente
     */
    public Cliente() {
        setUndecorated(true);
        initComponents();
        jLabel7.setText("Usted Cuenta con: "+  connecion.dinero);
        llenarTablaReservaciones(jTableMostrarReserva,"FK_Usuario");
//       jTableMostrarReserva.removeColumn(jTableMostrarReserva.getColumn("Id"));
//       jTableMostrarReserva.removeColumn(jTableMostrarReserva.getColumn("Id"));
        connecion.MostarTEsta("ID_Estado", "1");
        this.setSize(848, 512);
        this.setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Jfoto = new javax.swing.JLabel();
        jNumHabitacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jReservar = new javax.swing.JButton();
        jprecio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jdias = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBDinero = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMostrarReserva = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/HOTEL2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 190, 120);

        jButton1.setText("Cerrar Secion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(720, 30, 120, 60);

        jButton3.setText("Principal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(570, 30, 110, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 849;
        gridBagConstraints.ipady = 119;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        Jfoto.setText("jLabel2");
        jPanel2.add(Jfoto);
        Jfoto.setBounds(130, 30, 59, 59);

        jNumHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6" }));
        jNumHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumHabitacionActionPerformed(evt);
            }
        });
        jPanel2.add(jNumHabitacion);
        jNumHabitacion.setBounds(10, 180, 150, 30);

        jLabel3.setText("Precio");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(220, 150, 50, 20);

        jReservar.setText("Reservar");
        jReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReservarActionPerformed(evt);
            }
        });
        jPanel2.add(jReservar);
        jReservar.setBounds(130, 320, 77, 23);

        jprecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1000", "600", "600", "400", "500", "1000" }));
        jprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprecioActionPerformed(evt);
            }
        });
        jPanel2.add(jprecio);
        jprecio.setBounds(190, 180, 130, 30);

        jLabel4.setText("Numero Habitacion");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 150, 110, 20);
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(90, 250, 180, 30);

        jLabel5.setText(" Fecha");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(140, 220, 50, 14);

        jdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4" }));
        jdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdiasActionPerformed(evt);
            }
        });
        jPanel2.add(jdias);
        jdias.setBounds(240, 30, 80, 20);

        jLabel6.setText("Dias");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(260, 10, 20, 14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 329;
        gridBagConstraints.ipady = 399;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(null);

        jBDinero.setBackground(new java.awt.Color(255, 153, 153));
        jBDinero.setForeground(new java.awt.Color(51, 51, 51));
        jBDinero.setText("Agregar Dinero");
        jBDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBDineroMousePressed(evt);
            }
        });
        jBDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDineroActionPerformed(evt);
            }
        });
        jPanel3.add(jBDinero);
        jBDinero.setBounds(373, 328, 120, 30);

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Dinero: ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(120, 10, 220, 90);

        jTableMostrarReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMostrarReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMostrarReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMostrarReserva);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 520, 100);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 519;
        gridBagConstraints.ipady = 399;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        Principal obj=new Principal ();
//        obj.setVisible(true);
     new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Perfi.bandera=false;
        Principal obj=new Principal();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBDineroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBDineroMousePressed
        // TODO add your handling code here:
        agreDine();
    }//GEN-LAST:event_jBDineroMousePressed
 public void agreDine(){
        Dinero obj=new Dinero();
        obj.setVisible(true);
        this.dispose();
 }
    private void jReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReservarActionPerformed
        MetReser();
       //connecion.tol+=total;
        System.out.println(connecion.tol+ " es essta");
      // connecion.AgregarUsuario(" estado "," INSERT INTO ", connecion.tol);
    }//GEN-LAST:event_jReservarActionPerformed
     public void llenarTablaReservaciones(JTable jt,String FK_Usuario ){
         String[] columnas ={"Id", "Usuario" , "habitaciones","Dias","CostosHabitacion", "Fecha_Inicio", "Costo_Total"};
       
        DefaultTableModel modelo= new DefaultTableModel(connecion.MostarTablaRe( FK_Usuario , connecion.idee),columnas);
        jt.setModel(modelo);
     }
     public void MetReser(){
          if(jdias.getSelectedItem().toString()!="-"&&jprecio.getSelectedItem().toString()!="-"&&jNumHabitacion.getSelectedItem().toString()!="-"
          &&jDateChooser1.getDate()!=null){
        medi obj=new medi();
        obj.calendario(jDateChooser1);
        total=Integer.parseInt(jprecio.getSelectedItem().toString())*Integer.parseInt(jdias.getSelectedItem().toString());
        connecion.tol+=total;
              System.out.println(" tol " + connecion.tol);
        if(  JOptionPane.showConfirmDialog(null,"Sucargo sera de "+total+" confirmar con s/n")==JOptionPane.OK_OPTION){
           GuarReser();
           connecion.dinero-=total;
             jLabel7.setText("Usted Cuenta con: "+  connecion.dinero);
             
             llenarTablaReservaciones( jTableMostrarReserva,"FK_Usuario");
             
        }
       }else{
           JOptionPane.showMessageDialog(null, "Deben estar llenos todos los campos");
       } 
     } 
    private void jNumHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNumHabitacionActionPerformed

    private void jprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jprecioActionPerformed

    private void jdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdiasActionPerformed

    private void jBDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBDineroActionPerformed

    private void jTableMostrarReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMostrarReservaMouseClicked
        // TODO add your handling code here:
        clik();
    }//GEN-LAST:event_jTableMostrarReservaMouseClicked
    public void clik(){
        
    }
    public void GuarReser(){
   
          medi obj=new medi();
         boolean SioNo =
         connecion.AgregarUsuario( " reservaciones ", " INSERT INTO",connecion.idee,jNumHabitacion.getSelectedItem(),
         jdias.getSelectedItem(), jprecio.getSelectedItem(),obj.calendario(jDateChooser1),""+total+"");
        
         
         if(SioNo)
             JOptionPane.showMessageDialog(null, "correcto menn ");
 
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Jfoto;
    public javax.swing.JButton jBDinero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public static javax.swing.JComboBox<String> jNumHabitacion;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JButton jReservar;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableMostrarReserva;
    public javax.swing.JComboBox<String> jdias;
    public javax.swing.JComboBox<String> jprecio;
    // End of variables declaration//GEN-END:variables
}