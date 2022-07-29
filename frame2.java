/**
 * @(#)frame2.java
 * @frame que contenga dimensiones 390,430,que sea visible y no redimensionable.
 * @author David Emanuel Flores Beltran 
 * @version 1.00 2020/11/13
 */
import javax.swing.JFrame;
import java.awt.*;
public class frame2{
    public frame2() {
    	JFrame ventana=new JFrame();
    	ventana.setSize(390,430);
    	ventana.setVisible(true);
    	ventana.setResizable(false);
    	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  	public static void main(String[] args){
  		frame2 ventanita=new frame2();
  	}
}