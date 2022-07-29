/**
 * @(#)convercion.java
 * @ convercion de datos
 * @author David Emanuel Flores Beltran
 * @version 1.00 2020/12/1
 */
import java.awt.event.*;
import javax.swing.*;
public class convercion extends JFrame implements ActionListener {
	JTextField c1,s;
	JLabel text1;
	JButton bot,botD,botY,botE;
	public convercion() {
		setLayout(null);
    	//texto
		text1=new JLabel("PESOS: ");
		text1.setBounds(70,10,150,30);
		add(text1);
		//introducir datos
		c1=new JTextField();
    	c1.setBounds(120,12,100,25);
    	add(c1);
		//salida datos
		s=new JTextField();
    	s.setBounds(50,100,250,30);
    	add(s);
		//boton de finalizar
		bot=new JButton("FINALIZAR");
		bot.setBounds(200,150,100,30);
		add(bot);
		bot.addActionListener(this);
		//boton de dolares
		botD=new JButton("Dolar");
		botD.setBounds(10,50,90,30);
		add(botD);
		botD.addActionListener(this);
		//boton de Euros
		botE=new JButton("Euros");
		botE.setBounds(110,50,90,30);
		add(botE);
		botE.addActionListener(this);
		//boton de yen
		botY=new JButton("Yenes");
		botY.setBounds(210,50,90,30);
		add(botY);
		botY.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		double n1,nr;
        if(e.getSource()==botD){
            n1=Integer.parseInt(c1.getText());
            nr=n1/20.03;
            s.setText(("")+nr);
        }
        if(e.getSource()==botY){
            n1=Integer.parseInt(c1.getText());
            nr=n1/5.21;
            s.setText(("")+nr);
        }
        if(e.getSource()==botE){
            n1=Integer.parseInt(c1.getText());
            nr=n1/24.17;
            s.setText(("")+nr);
        }
		if (e.getSource()==bot) {System.exit(0);}
    }
	public static void main(String[] args){
		convercion form=new convercion();
		form.setBounds(800,0,350,250);
		form.setVisible(true);
	}
}