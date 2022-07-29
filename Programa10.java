import java.util.Scanner;
public class programa10{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	int num;
	System.out.println("introduce un numero:");
	num=Sc.nextInt();
	if(num==0){
		System.out.println("Es nulo");}
	else if(num>0){
		System.out.println("El numero es positivo");}
}
}
	