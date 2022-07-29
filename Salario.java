/**
 * @(#)Salario.java
 *Programa que determine el salario, si trabajas en:
 *informatica 8%
 *venta 4%
 *contabilidad 6%
 *-incrementar salario
 *-solicitar nombre y salario.
 * @David Emanuel Flores Beltra
 * @version 1.00 2020/11/6
 */

import java.util.Scanner;
public class Salario {
	Scanner sc=new Scanner(System.in);
	int ob,sa;
	String nam;
	double t1;
    public Salario() {
    	System.out.println("Cual es su nombre: ");
    	nam=sc.nextLine();
    	System.out.println("salario: ");
    	sa=sc.nextInt();
    	System.out.println("Trabajos: ");
    	System.out.println("1.-informatica");   //informatica 8%
    	System.out.println("2.-ventas");        //venta 4%
    	System.out.println("3.-contavilidad");  //contabilidad 6%
    	ob=sc.nextInt();
    	System.out.println("같같같같같같같같같같같같같같같같같같같같같같같같같같�");
    }
    public void total(){
    	if (ob==1){
    		t1=sa*0.08;
    		System.out.println(nam);
    		System.out.println("             TIENE UN SALARIO DE: ");
    		System.out.println("A tu salario se le suma un porsentage de: 0.08: "+t1);
    		System.out.println("Tu salario es de:"+(sa+t1));
    	}
    	if (ob==2){
    		t1=sa*0.04;
    		System.out.println(nam);
    		System.out.println("             TIENE UN SALARIO DE: ");
    		System.out.println("A tu salario se le suma un porsentage de: 0.04: "+t1);
    		System.out.println("Tu salario es de:"+(sa+t1));
    	}
    	if (ob==3){
    		t1=sa*0.06;
    		System.out.println(nam);
    		System.out.println("             TIENE UN SALARIO DE: ");
    		System.out.println("A tu salario se le suma un porsentage de: 0.06: "+t1);
    		System.out.println("Tu salario es de:"+(sa+t1));
    	}
    }
    public static void main(String[] args){
    	Salario ob=new Salario();
    	ob.total();
    }
}