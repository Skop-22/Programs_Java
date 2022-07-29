//programa12
import java.lang.*;
import java.util.Scanner;
public class pro12{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	double cel,far,su;
	System.out.println("introduce los grados celcius");
	cel=Sc.nextDouble();
	far=cel*1.8;
	su=far+32;
	System.out.println("los grados Fahrenheit son de:  "+su);
}
}