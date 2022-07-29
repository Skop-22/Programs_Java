import java.util.Scanner;
public class programa11{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	int num1,num2;
	System.out.println("introduce primer numero:");
	num1=Sc.nextInt();
	System.out.println("introduce segundo numero:");
	num2=Sc.nextInt();
	if(num1==num2){
		System.out.println("Son iguales");}
	else if((num1<num2)||(num2<num1)){
		System.out.println("Son diferentes");}
}
}