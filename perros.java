/**
 * realiza un programa que determine el total a pagar de una pelea de perros de acorde 
 * a el lugar en el que quedo:
 * 1 = se duplica
 * 2 = 600
 * 3 = 300
 * 4 = 200
 * 5 = 100
 * @(#)perros.java
 * @author 
 * @version 1.00 2020/11/6
 */
import java.util.Scanner;
public class perros {
	int ob,pre;
	String nom;
	Scanner sc=new Scanner(System.in);
    public perros() {
    	System.out.println("cual es el nombre del perro: ");
    	nom=sc.nextLine();
    	System.out.println("cual es el precio:");
    	pre=sc.nextInt();
    	System.out.println("En que lugar quedo");
    	System.out.println("1.-primer lugar");
    	System.out.println("2.-segundo lugar");
    	System.out.println("3.-tercer lugar");
    	System.out.println("4.-cuarto lugar");
    	System.out.println("5.-quinto lugar");
    	System.out.println("introduce el numero del lugar de "+nom);
    	ob=sc.nextInt();
    }  
    public void metodo(){
    	if(ob==1){
    	System.out.println("El perro "+nom);
    	System.out.println("tine el lugar de: "+ob+" tine ganacia de: "+(pre*2));	
    	}
    	if(ob==2){
    	System.out.println("El perro "+nom);
    	System.out.println("tine el lugar de: "+ob+" tine ganacia de: "+(600));	
    	}
    	if(ob==3){
    	System.out.println("El perro "+nom);
    	System.out.println("tine el lugar de: "+ob+" tine ganacia de: "+(300));	
    	}
    	if(ob==4){
    	System.out.println("El perro "+nom);
    	System.out.println("tine el lugar de: "+ob+" tine ganacia de: "+(200));	
    	}
    	if(ob==5){
    	System.out.println("El perro "+nom);
    	System.out.println("tine el lugar de: "+ob+" tine ganacia de: "+(100));	
    	}
    }
    public static void main(String[] args){
    	perros ob=new perros();
    	ob.metodo();
    }	
}