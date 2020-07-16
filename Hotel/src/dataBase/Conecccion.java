/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dataBase;;


import Todo.Administrador;
import Todo.Cliente;
import Todo.Inicio;
import Todo.Perfi;
import Todo.Principal;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 * 
 * @author Alma Cuevas <celeste300298@gmail.com>
 */
public class Conecccion {
    public static  boolean kk=false;
    public static String idee;
    public static int dinero;
    public static  int tol;
    private Connection cone;
    public static  String ide_admi;
      String Servidor, user,pasword;
    
      
      public Conecccion(String S, String U, String P){
        this.Servidor=S;
        this.user=U;
        this.pasword=P;  
        
          try {
              Class.forName("com.mysql.jdbc.Driver");
              cone=DriverManager.getConnection(S,U,P);
              
              if(cone != null){
                  System.out.println("se conecto correctamete");
                  
              }
          } catch (Exception e) {
              System.out.println("Error con el conector o datos del servidor " + e.toString());
          }
      }    
      public boolean AgregarUsuario(String tabla, String sentencia, Object ... params){
          
           boolean SiperoNo=false;
           sentencia+= tabla+"values (null"; 
          
           for(int i=0;i<params.length;i++){
              sentencia +=",?"; 
           }
       sentencia+=");";
       
         try {
           PreparedStatement ps=cone.prepareStatement(sentencia);
           for(int i=0;i<params.length;i++){
              ps.setObject(i+1, params[i]);
           }
           System.out.println(ps.toString());
          // ps.setBlob(5,ruta);
           ps.execute();
           SiperoNo=true;
       } catch (Exception e) {
             System.out.println("nooooooooooooooooooo");
       }
       
       return SiperoNo;
         
      }
      public String [][]obtenerRegistros(String tabla){
        String datos [][]=null;
        String sentencia= "Select * from "+ tabla;
        System.out.println(sentencia);
        ResultSet rs=null;
        try {
            PreparedStatement ps= cone.prepareStatement(sentencia);
            rs=ps.executeQuery();
            int contador=0;
            while(rs.next()){
                contador++;
            }
            rs.first();
             
            datos= new String[contador][7];
            int i=0;
            do{
                datos[i][0]=rs.getString(1);
                datos[i][1]=rs.getString(2);
                datos[i][2]=rs.getString(3);
                datos[i][3]=rs.getString(4);
                datos[i][4]=rs.getString(5);
                datos[i][5]=rs.getString(6);
                datos[i][6]=rs.getString(7);
               i++; 
            }while(rs.next());
           
           
        } catch (Exception e) {
        }
        //System.out.println(datos[2][2]);
        return datos;
    }
      public String [][]obtenerHabi(String tabla){
        String datos [][]=null;
        String sentencia= "Select * from "+ tabla;
        System.out.println(sentencia);
        ResultSet rs=null;
        try {
            PreparedStatement ps= cone.prepareStatement(sentencia);
            rs=ps.executeQuery();
            int contador=0;
            while(rs.next()){
                contador++;
            }
            rs.first();
            datos= new String[contador][3];
            int ii=0;
            do{
                datos[ii][0]=rs.getString(1);
                datos[ii][1]=rs.getString(2);
                datos[ii][2]=rs.getString(3);
               ii++; 
            }while(rs.next());  
        } catch (Exception e) {
        }
        System.out.println(datos[2][2]);
        return datos;
    }
      public String [][]obtenerFiltro (String tabla, JTextField parametro){
        String datos [][]=null;
        String sentencia= "Select * from "+ tabla+" where habitacines like '%"+parametro.getText()+"%'";
        System.out.println(sentencia);
        ResultSet rs=null;
        try {
            PreparedStatement ps= cone.prepareStatement(sentencia);
            rs=ps.executeQuery();
            int contador=0;
            while(rs.next()){
                contador++;
            }
            rs.first();
            datos= new String[contador][3];
            int i=0;
            do{
                datos[i][0]=rs.getString(1);
                datos[i][1]=rs.getString(2);
                datos[i][2]=rs.getString(3);
               i++; 
            }while(rs.next());
        } catch (Exception e) {
        }
       // System.out.println(datos[2][2]);
        return datos;
    }
      public  void  Validacion(JTextField jTextFieldUsuario2, JPasswordField contraseña2,JComboBox jo  ){
          int resul=0;
          try {
           String va=  "Select *  from usuario where Nombre='"+jTextFieldUsuario2.getText()+"' and contraseña='"+contraseña2.getText()+"'";
           Statement st=cone.createStatement();
           ResultSet rs= st.executeQuery(va);
           //idee=rs.getString("ID_cliente");
           
          
           JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecto");
           if(rs.next()){
              
            resul=1;
            Inicio ob=new Inicio();
              if(resul==1){
                  idee=rs.getString("ID_cliente");
                  dinero=Integer.parseInt(rs.getString("Dinero"));
                  //ide_admi=rs.getString("Admistrador");
                 System.out.println(idee);
                 Perfi.bandera=true;
                
                  if(jo.getSelectedIndex()==0){     
                  Cliente obj=new Cliente();
                  obj.setVisible(true); ob.dispose();}
                  else{
                  Administrador obj=new Administrador();
                  Principal.banderita=true;
                  
                  obj.setVisible(true); ob.dispose();
                  }       
                   }
          
          }
          } catch (SQLException ex) {
          }
          ;
     } 
      public boolean ModificarDiner(String I, int N){
       boolean SiperoNo=false;
        try {
            
            String sentencia= " UPDATE usuario set Dinero= "+N+"  where ID_cliente= "+I;
           
            System.out.println(sentencia);
            Statement st=cone.createStatement();
            st.execute(sentencia);
          SiperoNo=true;
        } catch (Exception e) {
        }
        return SiperoNo;
    }
      public String [][]MostarTablaRe ( String  FK_Usuario,String parametro){
        String datos [][]=null;
        
        String sentencia= "Select * from reservaciones where "+ FK_Usuario+"  like '"+parametro+"%'";
        System.out.println(sentencia);
        ResultSet rs=null;
        try {
            PreparedStatement ps= cone.prepareStatement(sentencia);
            rs=ps.executeQuery(); 
            
           
            int contador=0;
            while(rs.next()){
                contador++;
               
            }
            // tol=Integer.parseInt(rs.getString("d_gama"));
             System.out.println(tol+ " sssssssssssss"); 
            rs.first();
           
            datos= new String[contador][7];
            int i=0;
            do{
                datos[i][0]=rs.getString(1);
                datos[i][1]=rs.getString(2);
                datos[i][2]=rs.getString(3);
                datos[i][3]=rs.getString(4);
                datos[i][4]=rs.getString(5);
                datos[i][5]=rs.getString(6);
                datos[i][6]=rs.getString(7);
               i++; 
            }while(rs.next());
        } catch (Exception e) {
        }
       //System.out.println(datos[2][2]);
        return datos;
    }
      public void ModificarReservacion(String I, JComboBox D,JComboBox P , JComboBox ha, JDateChooser jd, int to){
           System.out.println(" yaaaaa");
      
        try {
          //medi ob=new medi();, Fecha_Inicio= "+ob.calendario(jd)+" 
            String sentencia= " UPDATE reservaciones set Dias= '"+D.getSelectedIndex()+"', FK_Habitacion= "+P.getSelectedIndex()+" , Costo_habitacion ="+ ha.getSelectedItem()+
                    " , Costo_Total= "+to+" where ID_Resevaciones= "+I;
            System.out.println(sentencia);
            Statement st=cone.createStatement();
            st.execute(sentencia);
            System.out.println(st);
        } catch (Exception e) {
        }

    }
           public String [][]MostarTEsta ( String  FK_Usuario,String parametro){
        String datos [][]=null;

            String sentencia= "Select * from    estado where "+ FK_Usuario+"  like '"+parametro+"%'";
        
        System.out.println(sentencia);
        ResultSet rs=null;
        try {
            PreparedStatement ps= cone.prepareStatement(sentencia);
            rs=ps.executeQuery();  
          
            int contador=0;
            while(rs.next()){
                contador++;
            }
            rs.first();
           
            datos= new String[contador][2];
            int i=0;
            do{
                datos[i][0]=rs.getString(1);
                datos[i][1]=rs.getString(2);
               i++; 
            }while(rs.next());
           
        } catch (Exception e) {
        }
       //System.out.println(datos[2][2]);
        return datos;
    } 
    }
