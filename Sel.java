/**
 * @(#)Sel.java
 * uno dos
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/29
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class Sel extends JFrame{
JComboBox cmb1;
    public Sel() {
    	setLayout(null);
		cmb1=new JComboBox();
		cmb1.setBounds(10,10,200,20);
		add(cmb1);
		cmb1.addItem("selecciona");
		cmb1.addItem("Uno");
		cmb1.addItem("Dos");
    }
    public static void main (String[] args) {
		Sel mia= new Sel();
		mia.setBounds(500,0,300,200);
		mia.setVisible(true);
	}
}