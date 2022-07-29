//PROGRAMA 6
import java.util.Scanner;
public class programa6{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in); 
	int edad;
	String name;
	System.out.println("ingresa tu nombre: ");
	name=sc.nextLine();
	System.out.println("ingresa tu edad");
	edad=sc.nextInt();
	System.out.println("su nombre: "+name +" tiene: "+edad +" años");
}
}