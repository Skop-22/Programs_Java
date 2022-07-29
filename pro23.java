//programa23
//determinar el area de un triangulo
import java.util.Scanner;
public class pro23{
public static void main(String[] args)
{
	Scanner Sc = new Scanner(System.in);
	double b,h,resul,resul2;
	System.out.println("Introduce la base del triangulo");
	b=Sc.nextDouble();
	System.out.println("Introduce la haltura del trangulo: ");
	h=Sc.nextDouble();
	resul=b*h;
	resul2=resul/2;
	System.out.println("El ares del -TRIANGULO- es de: "+resul2);
}
}