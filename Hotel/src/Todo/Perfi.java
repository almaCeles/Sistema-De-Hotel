/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;


import Metodos.medi;
import dataBase.Conecccion;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Alma Cuevas <celeste300298@gmail.com>
 */
public class Perfi extends javax.swing.JFrame {
   public static boolean bandera=false;
   Conecccion connecion = new Conecccion("jdbc:mysql://127.0.0.1/sys" , "root" , "morado");
    /**
     * Creates new form Perfi
     */
    public Perfi() {
        setUndecorated(true);
        this.setSize(850,500);
        this.setLocationRelativeTo(null);
        initComponents();
        medi obj=new medi();
        obj.BorrarTex(pNombre);
        obj.BorrarTex(paMaterno);
        obj.BorrarTex(pDinero);
        obj.BorrarTex(paPaterno);
        
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCargarFoto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButtonCrear = new javax.swing.JButton();
        pDinero = new javax.swing.JTextField();
        paPaterno = new javax.swing.JTextField();
        paMaterno = new javax.swing.JTextField();
        pNombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        pPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel7.setText("x");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 10, 20, 47);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 539;
        gridBagConstraints.ipady = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabelCargarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fot.png"))); // NOI18N
        jLabelCargarFoto.setText("ho");
        jLabelCargarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCargarFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCargarFotoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCargarFotoMousePressed(evt);
            }
        });
        jPanel2.add(jLabelCargarFoto);
        jLabelCargarFoto.setBounds(220, 10, 100, 100);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(350, 270, 150, 10);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(10, 170, 150, 10);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(190, 170, 150, 10);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre(s)");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(410, 180, 90, 16);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(390, 280, 70, 16);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apeido Materno");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(220, 180, 90, 16);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(370, 170, 150, 10);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apeido Paterno");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 180, 90, 16);

        jButtonCrear.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCrear.setText("Crear");
        jButtonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCrearMousePressed(evt);
            }
        });
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCrear);
        jButtonCrear.setBounds(200, 320, 120, 28);

        pDinero.setBackground(new java.awt.Color(255, 255, 255));
        pDinero.setForeground(new java.awt.Color(102, 102, 102));
        pDinero.setBorder(null);
        pDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDineroActionPerformed(evt);
            }
        });
        jPanel2.add(pDinero);
        pDinero.setBounds(30, 240, 150, 28);

        paPaterno.setBackground(new java.awt.Color(255, 255, 255));
        paPaterno.setForeground(new java.awt.Color(102, 102, 102));
        paPaterno.setBorder(null);
        paPaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                paPaternoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                paPaternoFocusLost(evt);
            }
        });
        paPaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paPaternoMouseClicked(evt);
            }
        });
        paPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paPaternoActionPerformed(evt);
            }
        });
        jPanel2.add(paPaterno);
        paPaterno.setBounds(10, 140, 150, 30);

        paMaterno.setBackground(new java.awt.Color(255, 255, 255));
        paMaterno.setForeground(new java.awt.Color(102, 102, 102));
        paMaterno.setBorder(null);
        paMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paMaternoActionPerformed(evt);
            }
        });
        jPanel2.add(paMaterno);
        paMaterno.setBounds(190, 140, 150, 28);

        pNombre.setBackground(new java.awt.Color(255, 255, 255));
        pNombre.setForeground(new java.awt.Color(102, 102, 102));
        pNombre.setBorder(null);
        pNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNombreActionPerformed(evt);
            }
        });
        jPanel2.add(pNombre);
        pNombre.setBounds(370, 140, 150, 28);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(30, 270, 150, 10);

        pPassword.setBackground(new java.awt.Color(255, 255, 255));
        pPassword.setForeground(new java.awt.Color(102, 102, 102));
        pPassword.setBorder(null);
        jPanel2.add(pPassword);
        pPassword.setBounds(350, 240, 150, 30);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dinero");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 280, 50, 16);

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(200, 110, 160, 0);

        jCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Administrador" }));
        jCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxActionPerformed(evt);
            }
        });
        jPanel2.add(jCBox);
        jCBox.setBounds(230, 250, 107, 26);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 539;
        gridBagConstraints.ipady = 409;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCargarFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCargarFotoMousePressed
        // TODO add your handling code here:
        JFileChooser jcho=new JFileChooser();
        jcho.showOpenDialog(this);
        
        File carga= jcho.getSelectedFile();
  
    }//GEN-LAST:event_jLabelCargarFotoMousePressed

    private void pDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pDineroActionPerformed

    private void paPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paPaternoActionPerformed

    private void paMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paMaternoActionPerformed

    private void pNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNombreActionPerformed

    private void jButtonCrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCrearMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCrearMousePressed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        if(jCBox.getSelectedIndex()==1){
            String cn=JOptionPane.showInputDialog("ingresa la contraseña");
            pDinero.enable(true);
            pDinero.setText("0");
            validacion();
            
        }else  
            validacion();
    }//GEN-LAST:event_jButtonCrearActionPerformed
    public void validacion(){
        if( !"escribe...".equals(pNombre.getText()) &&  pDinero.getText()!="escribe..."&& 
          !"escribe...".equals(paMaterno.getText()) &&!"escribe...".equals(paPaterno.getText())
          &&!"".equals(pPassword.getText())){
           
          
              bandera=true;
         
         
         
        
         boolean SioNo =connecion.AgregarUsuario(" usuario "," INSERT INTO", pNombre.getText(),paPaterno.getText(),
                 paMaterno.getText(),jLabelCargarFoto.getText(),pPassword.getText(),""+jCBox.getSelectedIndex()+"",pDinero.getText());
         if(SioNo)
             JOptionPane.showMessageDialog(null, "correcto"); 
          
         new Cliente().setVisible(true);
         this.dispose();}else
            JOptionPane.showMessageDialog(null, "Es obligatorio Nombre ,contraseña y dinero ");
    } 
    private void paPaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paPaternoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_paPaternoMouseClicked

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel7MousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Principal obj=new Principal();
        obj.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void paPaternoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paPaternoFocusGained
       
 
    }//GEN-LAST:event_paPaternoFocusGained

    private void paPaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paPaternoFocusLost

      
            
    }//GEN-LAST:event_paPaternoFocusLost

    private void jLabelCargarFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCargarFotoMouseEntered
        // TODO add your handling code here:
        ImageIcon juliantla=new javax.swing.ImageIcon(getClass().getResource("/Recursos/hotel-23.gif"));
               Image u= juliantla.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT );
               jLabelCargarFoto.setIcon(new ImageIcon(u));
    }//GEN-LAST:event_jLabelCargarFotoMouseEntered

    private void jLabelCargarFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCargarFotoMouseExited
         ImageIcon oso=new javax.swing.ImageIcon(getClass().getResource("/Recursos/fot.png"));
        jLabelCargarFoto.setIcon(oso);
    }//GEN-LAST:event_jLabelCargarFotoMouseExited

    private void jCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Perfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JComboBox<String> jCBox;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCargarFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField pDinero;
    private javax.swing.JTextField pNombre;
    private javax.swing.JPasswordField pPassword;
    private javax.swing.JTextField paMaterno;
    private javax.swing.JTextField paPaterno;
    // End of variables declaration//GEN-END:variables
}
