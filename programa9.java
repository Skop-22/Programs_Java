//programa9
import java.util.Scanner;
public class programa9{
public static void main(String[] args)
{
Scanner Sc = new Scanner(System.in);
int d;
double pi,ra,lo;
d=2;
pi=3.1416;
System.out.println("introduce el radio de la sircunferencia");
ra = Sc.nextDouble();
lo=(d*pi*ra);
System.out.println("La longitud de la circunferencia es de:"+lo);
}
}