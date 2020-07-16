/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;


import Bo.BotonNew;
import Metodos.medi;
import dataBase.Conecccion;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author Alma Cuevas <celeste300298@gmail.com>
 */
public class Principal extends javax.swing.JFrame  {
       public static  boolean banderita=false;
   Conecccion connecion = new Conecccion("jdbc:mysql://127.0.0.1/sys" , "root" , "morado");
    /**
     * Creates new form Principal
     */
    public Principal() {  
        setUndecorated(true);
        this.setSize(850, 500);
        this.setLocationRelativeTo(null);
        initComponents();
        //tabla.removeColumn(tabla.getColumn("Id"));
        tabla.setVisible(false);
       jScrollPane1.setVisible(false);
            BotonNew bn=new BotonNew();
            bn.setBounds(600, 55, 100, 60);
            if(Perfi.bandera ==false){
            Hola.add(bn);}  
            Hola.add(imaginacion);  
            connecion.kk=false;
        String[] columnas ={"Id", "Camas", "Precio"};
        DefaultTableModel modelo= new DefaultTableModel(connecion.obtenerHabi(" habitaciones "),columnas);
        jScrollPane2.setVisible(false);
        // jTable1.removeColumn(jTable1.getColumn("Id"));       
        jTable1.setVisible(false);
        jLabel5.setVisible(false);
        //tabla.setBounds(200,150,400 ,40);
         connecion.kk=false;
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jGale = new javax.swing.JLabel();
        jHabi = new javax.swing.JLabel();
        imaginacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Hola = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(851, 509));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jGale.setBackground(new java.awt.Color(0, 0, 0));
        jGale.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jGale.setForeground(new java.awt.Color(255, 255, 255));
        jGale.setText("Galeria");
        jGale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jGaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jGaleMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jGaleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jGaleMouseReleased(evt);
            }
        });
        getContentPane().add(jGale, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 70, 90, 50));

        jHabi.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jHabi.setForeground(new java.awt.Color(255, 255, 255));
        jHabi.setText("Habitaciones");
        jHabi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jHabiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jHabiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jHabiMousePressed(evt);
            }
        });
        getContentPane().add(jHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 70, 140, 50));
        getContentPane().add(imaginacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 270, 210));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("x");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 50));

        jButton2.setText("Entrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 260, 240));

        Hola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/e2.png"))); // NOI18N
        Hola.setText("jLabel2");
        getContentPane().add(Hola, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/HOTEL2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 190, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icalendario.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 20, 70, 60);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(90, 40, 170, 29);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 70, 70, 36);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(290, 30, 560, 110);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Habitaciones reservadas ese dia");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(440, 10, 310, 16);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 850, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfil1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfil1MousePressed
        // TODO add your handling code here:
        Perfi obj=new Perfi();
        if(Perfi.bandera==true){
           if(banderita==false){
               Cliente ob=new Cliente();
               ob.setVisible(true);
           } else {
               Administrador ad=new Administrador();
               
               
               ad.setVisible(true);
           }
            this.dispose();
        }else{
            Inicio j=new Inicio();
            j.setVisible(true);
            this.dispose();
        }
            
    }//GEN-LAST:event_perfil1MousePressed

    private void jGaleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGaleMouseReleased
        // TODO add your handling code here:
      //   imaginacion.setVisible(false);
    }//GEN-LAST:event_jGaleMouseReleased

    private void jGaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGaleMouseEntered
        // TODO add your handling code here:
        jGale.setForeground(Color.red);
    }//GEN-LAST:event_jGaleMouseEntered

    private void jGaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGaleMouseExited
        // TODO add your handling code here:.
        jGale.setForeground(Color.WHITE);
        //jLabel2.setVisible(false);
       
    }//GEN-LAST:event_jGaleMouseExited

    private void jHabiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHabiMousePressed
        // TODO add your handling code here:
      
       tabla.setVisible(true);
       jScrollPane1.setVisible(true);
    }//GEN-LAST:event_jHabiMousePressed

    private void jHabiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHabiMouseEntered
        jHabi.setForeground(Color.red);
    }//GEN-LAST:event_jHabiMouseEntered

    private void jHabiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHabiMouseExited

        jHabi.setForeground(Color.WHITE);
    }//GEN-LAST:event_jHabiMouseExited

    private void jGaleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGaleMousePressed
    medi obj=new medi();
     obj.carusel(imaginacion);
    
    }//GEN-LAST:event_jGaleMousePressed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here
     
     System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       medi obj=new medi();
       Cliente oj=new  Cliente();
       String gg=""+obj.calendario(jDateChooser1);
       connecion.MostarTablaRe("Fecha_Inicio", gg);
       
        String[] columnas ={"Id", "Usuario","habitacionen", "Dias","CostosHabitacion", "FechaInicio"};
       
       DefaultTableModel modelo= new DefaultTableModel(connecion.MostarTablaRe( "Fecha_Inicio", gg),columnas);
       jTable1.setModel(modelo);
       jLabel5.setVisible(true);
       jScrollPane2.setVisible(true);
       jTable1.setVisible(true);
       
       System.out.println(" llega");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Inicio i=new Inicio();
        i.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hola;
    private javax.swing.JLabel imaginacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jGale;
    private javax.swing.JLabel jHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

