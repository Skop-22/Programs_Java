/**
 * @(#)frame3.java
 * @Crea un frame que no sea visible, que sea localizado 
 * @en 0,400 y que tenga dimensiones de 500x500
 * @author David Emanuel Flores Beltran 
 * @version 1.00 2020/11/13
 */
import javax.swing.JFrame;
import java.awt.*;
public class frame3{
    public frame3() {
    	JFrame ventana=new JFrame();
    	ventana.setSize(500,500);
    	ventana.setVisible(false);
    	ventana.setLocation(0,400);
    	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  	public static void main(String[] args){
  		frame3 da=new frame3();
  	}
}