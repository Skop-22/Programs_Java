//programa13
import java.lang.*;
import java.util.Scanner;
public class pro13{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	double pas,pasa,peri,ra,ha,pi;
	pi=3.1416;
	System.out.println("introduce la Haltura del cono");
	ha=Sc.nextDouble();
	System.out.println("introduce el radio del cono");
	ra=Sc.nextDouble();
	pas=ra*ra;
	pasa=pi*pas*ha;
	peri=pasa/3;
	System.out.println("El perimetro del cono:    "+peri);
}
}
	
