import java.util.Scanner;
public class programa7{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in); 
	int n1,n2,n3,n4,prom;
	System.out.println("ingrese primer numero:");
	n1=sc.nextInt();
	System.out.println("ingrese segundo numero:");
	n2=sc.nextInt();
	System.out.println("ingrese tercer numero:");
	n3=sc.nextInt();
	System.out.println("ingrese cuarto numero:");
	n4=sc.nextInt();
	prom=(n1+n2+n3+n4)/4;
	System.out.println("La el promedio es de= " +prom);
	}
} 