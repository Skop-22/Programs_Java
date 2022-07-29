/**
 * @(#)MiFrame.java
 * @David Emanuel Flores Beltran
 * @version 1.00 2020/11/10
 */
import javax.swing.JFrame;
import java.awt.*;
public class MiFrame {
    public MiFrame() {
    	JFrame ventana=new JFrame();
    	ventana.setSize(290,150);
    	ventana.setVisible(true);
    	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  	public static void main(String[] args){
  		MiFrame ventana=new MiFrame();
  	}
}