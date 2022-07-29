/**
 * @(#)muestra.java
 * @creacion de un JComboBox
 * @author  David Emanuel Flores Beltran
 * @version 1.00 2020/11/27
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class muestra extends JFrame{
	JComboBox cmb1;
	public muestra(){
		setLayout(null);
		cmb1=new JComboBox();
		cmb1.setBounds(10,10,200,20);
		add(cmb1);
		cmb1.addItem("Primer  Semestre");
		cmb1.addItem("Tercer  Semestre");
		cmb1.addItem("Quinto  Semestre");
		cmb1.addItem("Septimo Semestre");
		}
	public static void main (String[] args) {
		muestra mia= new muestra();
		mia.setBounds(500,0,300,200);
		mia.setVisible(true);
	}
}