//programa14
import java.lang.*;
import java.util.Scanner;
public class pro14{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	double A,t,ba,ha;
	System.out.println("introduce la Haltura");
	ha=Sc.nextDouble();
	System.out.println("introduce el base");
	ba=Sc.nextDouble();
	A=ba*ha;
	t=A/2;
	System.out.println("El area del triangulo es de:   "+t);
}
}