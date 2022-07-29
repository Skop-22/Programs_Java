//PROGRAMA 8
import java.util.Scanner;
public class programa8{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in); 
	int n1,cuadrado,cubo;
	System.out.println("ingrese un numero:");
	n1=sc.nextInt();
	cuadrado=n1*n1;
	cubo=n1*n1*n1;
	System.out.println("El cudrado del numero es de: "+cuadrado);
	System.out.println("El cubo del numero es de: "+cubo);
	}
}