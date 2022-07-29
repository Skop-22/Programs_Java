//determinar el area de un circulo
//programa17
//David Emanuel Flores Beltran
import java.util.Scanner;
public class pro17{
	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		double pi,r,rac,a;
		pi=3.1416;
		System.out.println("introduce el radio de la sircunferencia");
		r=Sc.nextDouble();
		rac=r*r;
		a=rac*pi;
		System.out.println("El area de la circunferencia es igual a:  "+a);
	}
}