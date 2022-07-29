/**
 * @(#)boton.java
 * crear un boton de finalizar
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/11/30
 */
import javax.swing.*;
import java.awt.event.*;

public class boton extends JFrame implements ActionListener {

	JButton bot;
	public boton() {
		setLayout(null);
		bot=new JButton("FINALIZAR");
		bot.setBounds(300,250,100,30);
		add(bot);
		bot.addActionListener(this);
	}
    
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bot) {
			System.exit(0);
		}
	}
    
	public static void main(String[] args) {
		boton form=new boton();
		form.setBounds(800,0,450,350);
		form.setVisible(true);
	}
}