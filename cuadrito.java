/**
 * @(#)cuadrito.java
 * JTextField
 * @author David Emanuel Flores Beltran 
 * @version 1.00 2020/11/23
 */
 
import java.awt.*;
import javax.swing.*;
public class cuadrito extends JFrame {
	JTextField c1;
    public cuadrito() {
    		setLayout(null);
    		c1=new JTextField();
    	c1.setBounds(10,10,100,30);
    	add(c1);
    }
  	public static void main(String[] args){
  		cuadrito gomita=new cuadrito();
  		gomita.setVisible(true);
  		gomita.setSize(500,500);
  	}
}