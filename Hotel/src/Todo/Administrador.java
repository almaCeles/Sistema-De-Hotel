
package Todo;

import Metodos.medi;

import dataBase.Conecccion;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Alma Cuevas <celeste300298@gmail.com>
 */
public class Administrador extends Cliente {
    Conecccion connecion = new Conecccion("jdbc:mysql://127.0.0.1/sys" , "root" , "morado");
    public static String u[][], j[][];
    int to, yu;
  
    public Administrador() {
      initComponents();  
      this.setSize(850,500);
      this.setLocationRelativeTo(null);
      jaja();
    
      u=connecion.obtenerRegistros(" reservaciones ");
        llenarTablaReservaciones();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaganancia = new javax.swing.JTable();
        buscardo = new javax.swing.JTextField();
        jLFecha = new javax.swing.JLabel();
        jLDias1 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jTFDias = new javax.swing.JComboBox<>();
        jC1 = new javax.swing.JComboBox<>();
        jC2 = new javax.swing.JComboBox<>();
        JL1 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        Idii = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jTablaganancia.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaganancia.setShowHorizontalLines(true);
        jTablaganancia.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jTablaganancia);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 170, 230, 250);

        buscardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscardoActionPerformed(evt);
            }
        });
        getContentPane().add(buscardo);
        buscardo.setBounds(0, 120, 100, 30);

        jLFecha.setForeground(new java.awt.Color(51, 51, 51));
        jLFecha.setText("Fecha");
        getContentPane().add(jLFecha);
        jLFecha.setBounds(590, 330, 40, 16);

        jLDias1.setForeground(new java.awt.Color(51, 51, 51));
        jLDias1.setText("Dias");
        getContentPane().add(jLDias1);
        jLDias1.setBounds(430, 330, 30, 20);

        jDateChooser5.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jDateChooser5);
        jDateChooser5.setBounds(567, 300, 110, 28);

        jTFDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7" }));
        getContentPane().add(jTFDias);
        jTFDias.setBounds(420, 300, 37, 26);

        jC1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6" }));
        jC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC1ActionPerformed(evt);
            }
        });
        getContentPane().add(jC1);
        jC1.setBounds(490, 400, 37, 26);

        jC2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1000", "600", "600", "400", "500", "1000" }));
        jC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC2ActionPerformed(evt);
            }
        });
        getContentPane().add(jC2);
        jC2.setBounds(584, 400, 50, 26);

        JL1.setText("Habitacion");
        getContentPane().add(JL1);
        JL1.setBounds(490, 440, 59, 16);

        jL2.setText("Costo");
        getContentPane().add(jL2);
        jL2.setBounds(590, 440, 33, 16);

        Idii.setEditable(false);
        Idii.setEnabled(false);
        getContentPane().add(Idii);
        Idii.setBounds(360, 400, 12, 28);

        jButton1.setText("Resetear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(763, 108, 80, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscardoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscardoActionPerformed

    private void jC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC1ActionPerformed

    private void jC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed
    @Override
     public void agreDine(){
        jTablaganancia.setBounds(50, 100, 230, 250);
        jScrollPane2.setBounds(50, 100, 230, 250);
        jPanel2.add(jScrollPane2); 
        jPanel2.add(jTablaganancia);
        //connecion.MostarTablaRe("ID_Estado", "1");
        
        
         //jScrollPane2.setVisible(true);
         jTablaganancia.setVisible(true);
      
       yuyu();
 
     }
    public void yuyu(){        
      for (int i = 0; i <u.length; i++) {
             yu+=Integer.parseInt(u[i][6]);
         }
        // System.out.println("ttttttsfd  "+yu);
        j=connecion.MostarTEsta("ID_Estado", "1");
        j[0][1]=""+yu; 
         String[] columnas ={"Id", "Usuario"};
         DefaultTableModel modelo= new DefaultTableModel(j,columnas);
         jTablaganancia.setModel(modelo);   
         yu=0;
    }
    @Override
    public void MetReser(){
        medi o=new medi();

        int r=jTFDias.getSelectedIndex();
        int t=Integer.parseInt(jC2.getSelectedItem().toString());
        to=r*t;
       // System.out.println("ttttttttt "+to);
        
        System.out.println(to+" tiene esooooooo"  + Integer.parseInt(jC2.getSelectedItem().toString())+ "  ASF " +jTFDias.getSelectedIndex() );
        connecion.ModificarReservacion(Idii.getText(), jTFDias, jC1, jC2,jDateChooser1,to);
        u=connecion.obtenerRegistros(" reservaciones ");
        llenarTablaReservaciones();
          yuyu();
       
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
        
    }
    @Override
    public void clik(){
        medi ob=new medi();
       Idii.setText(jTableMostrarReserva.getValueAt(jTableMostrarReserva.getSelectedRow(), 0).toString());
       jTFDias.setSelectedIndex(Integer.parseInt(jTableMostrarReserva.getValueAt(jTableMostrarReserva.getSelectedRow(), 3).toString()));
       jC1.setSelectedIndex(Integer.parseInt(jTableMostrarReserva.getValueAt(jTableMostrarReserva.getSelectedRow(), 2).toString()));
       jC2.setSelectedItem(jTableMostrarReserva.getValueAt(jTableMostrarReserva.getSelectedRow(), 4).toString());
       
//        try {
//            jDateChooser5.setDate(ob.calendario(jTableMostrarReserva.getValueAt(jTableMostrarReserva.getSelectedRow(), 5).toString()));
//        } catch (ParseException ex) {
//            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
//        }
      
    }
    public void llenarTablaReservaciones(){
     
     String[] columnas ={"Id", "Usuario", "habitaciones","Dias","Costo_Habitacion", "Fecha_Inicio", "Costo_Total"};
       
        DefaultTableModel modelo= new DefaultTableModel(u,columnas);
        jTableMostrarReserva.setModel(modelo);
        
        //jTableMostrarReserva
                
  }
    public  void jaja(){
      jPanel3.add(Idii);
      Idii.setBounds(30, 230, 50, 30);
        
      jScrollPane2.setVisible(false);
      jTablaganancia.setVisible(false); 
      jNumHabitacion.setVisible(false);
      jprecio.setVisible(false);
      jLabel4.setVisible(false);
      jLabel3.setVisible(false);
      jLabel7.setVisible(false);
      Jfoto.setVisible(false);
      jLabel5.setVisible(false);
      jDateChooser1.setVisible(false);
      jLabel6.setVisible(false);
      jdias.setVisible(true);
      jdias.setVisible(false);
      
      jPanel2.add( jBDinero);
      jBDinero.setText("Estado de cuenta");
      jBDinero.setBackground(Color.LIGHT_GRAY);
      jBDinero.setBounds(90, 30, 150, 60);
      
      
      jPanel3.add( jReservar);
      jReservar.setText("Aplicar Cambios");
      jReservar.setBounds(170, 30, 150, 60); 
      
      jDateChooser5.setBounds(10, 100, 150, 30);
      
      jPanel3.add(jTFDias);
      jTFDias.setBounds(100, 260, 50, 30);
      jPanel3.add(jLDias1);
      jLDias1.setBounds(100, 230, 50, 30);
      
      jPanel3.add(jDateChooser5);
      jDateChooser5.setBounds(180, 260, 90, 30);
      jPanel3.add(jLFecha);
      jLFecha.setBounds(180, 230, 50, 30);
      
      jPanel3.add(JL1);
      jPanel3.add(jL2);
      jPanel3.add(jC1);
      jPanel3.add(jC2);
      JL1.setBounds(300, 230, 70, 30);
      jL2.setBounds(380, 230, 50, 30);
      jC1.setBounds(300, 260, 70, 30);
      jC2.setBounds(380, 260, 50, 30);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Idii;
    private javax.swing.JLabel JL1;
    private javax.swing.JTextField buscardo;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jC1;
    private javax.swing.JComboBox<String> jC2;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jLDias1;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jTFDias;
    private javax.swing.JTable jTablaganancia;
    // End of variables declaration//GEN-END:variables
}
