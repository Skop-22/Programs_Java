/**
 * @(#)bisisesto.java
 * a�o bisiesto
 * programa 4 
 * @David Emanuel flores Beltran
 * @version 1.00 2020/11/6
 */
import java.util.Scanner;
public class bisisesto{
	Scanner sc=new Scanner(System.in);
	int a;
    public bisisesto() {
    	System.out.println("Introduce un a�o");
        a=sc.nextInt();
    }
    public void bi(){
    	if ((a%4==0&&a%100!=0)||(a%100==0&&a%400==0)){
            System.out.println("El a�o " +a+" es bisiesto");
        } else {
            System.out.println(" no es bisiesto");
        }
    }
    public static void main(String[] args){
    	bisisesto ob=new bisisesto();
    	ob.bi();
    }
}