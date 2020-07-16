package Bo;

import Todo.Perfi;
import Todo.Principal;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;


/**
 * 
 * @author Alma Cuevas <celeste300298@gmail.com>
 */
public class BotonNew  extends javax.swing.JLabel implements MouseListener{

    List <ImageIcon> imagen, imagenp;
    public  BotonNew(){

        imagen= new ArrayList<>();
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bo/N1.png")));
        
        this.imagen.add(new javax.swing.ImageIcon(getClass().getResource("/Bo/N1.png")));
        this.imagen.add(new javax.swing.ImageIcon(getClass().getResource("/Bo/N2.png")));
        this.imagen.add(new javax.swing.ImageIcon(getClass().getResource("/Bo/N3.png")));
        //this.setIcon(imagen.get(0));
        this.setPreferredSize(new Dimension(90,50));
        this.addMouseListener(this);
        imagenp=imagen;

    }
    @Override
    public void mouseClicked(MouseEvent e) {
     
    }

    @Override
    public void mousePressed(MouseEvent e) {   
       
        this.setIcon(imagenp.get(2));
        if(Perfi.bandera==false){
        Perfi obj=new Perfi();
        obj.setVisible(true);
        } 
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       this.setIcon(imagenp.get(1));
    }

    @Override
    public void mouseExited(MouseEvent e) {
     this.setIcon(imagenp.get(0));
    }
    @Override
    public void setSize(int x, int y){
        super.setSize(x,y);
        imagenp=new ArrayList<>();
        
        for(ImageIcon Imagen :imagen ){
            Image Icono= Imagen.getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT);
            imagenp.add(new ImageIcon(Icono));
            this.setIcon(Imagen);
        }
        pintar();
    }
    public void pintar(){
        this.setIcon(imagenp.get(0));
    }
}