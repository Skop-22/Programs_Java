/**
 * @(#)etiqueta.java
 * @etiqueta
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/13
 */
import javax.swing.*;
import java.awt.*;
public class etiqueta extends JFrame{
	JLabel Label1;
    public etiqueta() {
    	setLayout(null);
    	Label1=new JLabel("1'etiqueta");
    	Label1.setBounds(10,2,300,30);
    	add(Label1);
    }
  	public static void main(String[] args){
  		etiqueta ejemplo1=new etiqueta();
  		ejemplo1.setSize(300,200);
  		ejemplo1.setVisible(true);
  	}
}