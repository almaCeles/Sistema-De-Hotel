/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodos;

import Todo.Principal;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;



/**
 * 
 * @author Alma Cuevas <celeste300298@gmail.com>
 */
public class medi {
  public static int i=1;
   
  public void carusel (JLabel koo){
     
        Timer tiner= new Timer (2000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String cad=i + ".png";
               Principal obj=new Principal();
               //koo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesHotel/"+cad)));
               ImageIcon ñ=new javax.swing.ImageIcon(getClass().getResource("/ImagenesHotel/"+cad));
               Image u= ñ.getImage().getScaledInstance(400,250,Image.SCALE_DEFAULT );
               koo.setIcon(new ImageIcon(u));
               i++;
               if(i==10)
                   i=1;
            }  
        });
        tiner.start();
    }
  
    
    public void  BorrarTex (JTextField lo ){
       lo.setText("escribe...");

      lo.addFocusListener(new FocusListener() {
           @Override
           public void focusGained(FocusEvent e) {
                System.out.println(" entroooo");
        lo.setText("");
           }

           @Override
           public void focusLost(FocusEvent e) {
               if("".equals(lo.getText())){
                   
                   System.out.println(" ganinetLOst");
            lo.setText("escribe...");
        }
        } 

    });}
    
     public Date calendario(JDateChooser jDateChooser1){
        Date date= jDateChooser1.getDate();
               
               long de=date.getTime();
               java.sql.Date fecha= new java.sql.Date(de);
               // JOptionPane.showMessageDialog(null, fecha);
                return fecha;
     }
      public  Date calendario(String ho) throws ParseException{
         
    
          SimpleDateFormat uno= new SimpleDateFormat("yyyy/MM/dd");
          Date d=uno.parse(ho);
          long de=d.getTime();
          java.sql.Date fecha= new java.sql.Date(de);
          System.out.println(fecha);
          return fecha;
      
          
     }
}    

