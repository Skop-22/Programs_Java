//programa 11
import java.util.Scanner;
public class programa11{
public static void main(String[] args)
{
	Scanner Sc=new Scanner(System.in);
	int ca;
	System.out.println("introduce tu calificacion");
	ca=Sc.nextInt();
	if(ca<5){
	System.out.println("Insufisiente");}
	if(ca==5){
	System.out.println("Suficiente");}
	if((ca>5)&&(ca<7)){
	System.out.println("Bien");}
	if((ca>=7)&&(ca<=8)){
	System.out.println("Notable");}
	if(ca>8){
	System.out.println("Sobresaliente");}
}
}