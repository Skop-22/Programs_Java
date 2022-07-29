/**
 * @(#)suma.java
 * la suma de dos balores 
 * @author 
 * @version 1.00 2020/12/1
 */
import java.awt.event.*;
import javax.swing.*;
public class suma extends JFrame implements ActionListener {
	JTextField c1,c2,c3;
	JLabel text1,text2;
	JButton bot,botS;
	public suma() {
		setLayout(null);
    	//primer dato
		text1=new JLabel("Introduce Un numero: ");
		text1.setBounds(10,10,150,30);
		add(text1);
		//salida de dato
		c1=new JTextField();
    	c1.setBounds(150,12,100,25);
    	add(c1);
		//segundo dato
		text2=new JLabel("Introduce Un numero: ");
		text2.setBounds(10,70,150,30);
		add(text2);
		//salida de dato numero dos
		c2=new JTextField();
    	c2.setBounds(150,72,100,25);
    	add(c2);
		//salida final
		c3=new JTextField();
    	c3.setBounds(50,110,250,30);
    	add(c3);
		//boton de finalizar
		bot=new JButton("FINALIZAR");
		bot.setBounds(170,150,100,30);
		add(bot);
		bot.addActionListener(this);
		//boton de dolares
		botS=new JButton("SUMA");
		botS.setBounds(10,150,100,30);
		add(botS);
		botS.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		int n1,n2,nr;
        if(e.getSource()==botS){
            n1=Integer.parseInt(c1.getText());
            n2=Integer.parseInt(c2.getText());
            nr=n1+n2;
            c3.setText(("")+nr);
        }
		if (e.getSource()==bot) {System.exit(0);}
    }
	public static void main(String[] args){
		suma form=new suma();
		form.setBounds(800,0,350,250);
		form.setVisible(true);
	}
}