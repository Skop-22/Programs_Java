/**
 * @(#)viajes1.java
 * @programa viajes 
 * @programa 1 del segundo parcial
 * @David Emanuel Flores Beltran
 * @version 1.00 2020/11/3
 */
import java.util.Scanner;
public class viajes1 {
    Scanner sc=new Scanner(System.in);
	double mer=3670;//merida
	double gua=689;//guadalajara
	double bc=2730;//baja california
	double oa=4521;//Oaxaca
	double me=3010;//mexicali
	double vo,pe1,pe12,pe2,pe22,pe3,pe32,pe4,pe42,pe5,pe52;
	double to1,to2,to3,to4,to5;
	int asi,pago;
    public viajes1() {
    	System.out.println("---------------------------------------------------");
    	System.out.println("Adonde quiere viajar:");
    	System.out.println("1:Merida          =3670$");
    	System.out.println("2:Guadalajara     =689$");
    	System.out.println("3:Baja california =2730$");
    	System.out.println("4:Oaxaca          =4521$");
    	System.out.println("5:Mexicali        =3010$");
    	System.out.println("Por favor inserte el numero:");
    	asi=sc.nextInt();
    	System.out.println("Cuantos voletos:");
    	vo=sc.nextDouble();
    	System.out.println("    conque pagara ");
    	System.out.println("si es con targeta de credito tecle =6");
    	System.out.println("si es con efectivo tecle =7");
    	pago=sc.nextInt();
    	System.out.println("---------------------------------------------------");
    	System.out.println(" ");
    }
    public void total(){
    	if(asi==1){
    		to1=mer*vo;
    		if(pago==6){
    			pe1=to1*0.1;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le aumentara un 10% ="+pe1);
    			System.out.println("Total A pagar es de: "+(to1+pe1));
    		}
    		if(pago==7){
    			pe12=to1*0.05;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le descuenta el 5% ="+pe12);
    			System.out.println("Total A pagar es de: "+(to1-pe12));
    		}
    		
    	}
    	if(asi==2){
    		to2=gua*vo;
    		if(pago==6){
    			pe2=to2*0.1;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le aumentara un 10% ="+pe2);
    			System.out.println("Total A pagar es de: "+(to2+pe2));
    		}
    		if(pago==7){
    			pe22=to2*0.05;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le descuenta el 5% ="+pe22);
    			System.out.println("Total A pagar es de: "+(to2-pe22));
    		}
    	}
    	if(asi==3){
    		to3=bc*vo;
    		if(pago==6){
    			pe3=to3*0.1;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le aumentara un 10% ="+pe3);
    			System.out.println("Total A pagar es de: "+(to3+pe3));
    		}
    		if(pago==7){
    			pe32=to3*0.05;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le descuenta el 5% ="+pe32);
    			System.out.println("Total A pagar es de: "+(to3-pe32));
    		}
    	}
    	if(asi==4){
    		to4=oa*vo;
    		if(pago==6){
    			pe4=to4*0.1;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le aumentara un 10% ="+pe4);
    			System.out.println("Total A pagar es de: "+(to4+pe4));
    		}
    		if(pago==7){
    			pe42=to4*0.05;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le descuenta el 5% ="+pe42);
    			System.out.println("Total A pagar es de: "+(to4-pe42));
    		}
    	}
    	if(asi==5){
    		to5=me*vo;
    		if(pago=='t'){
    			pe5=to5*0.1;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le aumentara un 10% ="+pe5);
    			System.out.println("Total A pagar es de: "+(to5+pe5));
    		}
    		if(pago=='e'){
    			pe52=to5*0.05;
    			System.out.println("Usted compra "+vo+" voletos");
    			System.out.println("se le descuenta el 5% ="+pe52);
    			System.out.println("Total A pagar es de: "+(to5-pe52));
    		}
    	}
    }
    public static void main(String[] args){
    	viajes1 ob=new viajes1();
    	ob.total();
    }
}