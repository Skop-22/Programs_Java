//realizar un programa que convierta la velocidad
//de kilometros (Km/h) a metros (m/s)
//programa21
//David Emanuel Flores Beltran 
import java.util.Scanner;
public class pro21{
	public static void main(String[] args){
	Scanner Sc=new Scanner(System.in);
	double kilome,conver;
	System.out.println("Introduce Los Kilometros: ");
	kilome=Sc.nextDouble();
	conver=(kilome*1000)/3600;
	System.out.println("Los metros son: "+conver+"m/s");
	}
}