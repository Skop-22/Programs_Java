/******************************************************************************

                            David Emanuel Flores Beltran
                            Programa 25
                            Tabla de Multiplicar

*******************************************************************************/
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner ce= new Scanner(System.in);
        int i,Ent,fact=1;
        System.out.println("Ingresa un Numero: ");
        Ent=ce.nextInt();
        for(i=1;i<=Ent;i++){
            fact=fact*i;
        }
        System.out.println("El Factorial es:"+fact);
    }
}