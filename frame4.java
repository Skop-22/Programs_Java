/**
 * @(#)frame4.java
 * @Crea un Frame que el título Sea PÁGINA PRINCIPAL que sea visible,
 * @que sea redimensionable, que mida 300x280 y que tenga una posición de 200,200.
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/13
 */
import javax.swing.JFrame;
import java.awt.*;
public class frame4{
    public frame4() {
    	JFrame ventana=new JFrame();
    	ventana.setTitle("PAGINA PRINCIPAL");
    	ventana.setSize(300,280);
    	ventana.setVisible(true);
    	ventana.setLocation(200,200);
    	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  	public static void main(String[] args){
  		frame4 ve=new frame4();
  	}
}