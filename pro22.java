//Realiza un programa que convierta pesos a dolares
//programa22
//David Emanuel Flores Beltran
import java.util.Scanner;
public class pro22{
public static void main(String[] args)
{
	Scanner Sc = new Scanner(System.in);
	int pesos,dolar;
	System.out.println("Introdusca los pesos:");
	pesos=Sc.nextInt();
	System.out.println("DOLAR:  "+pesos*0.047);
	}
}