/******************************************************************************

                            David Emanuel Flores Beltran
                            Programa 24
                            Tabla de Multiplicar

*******************************************************************************/
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner ce= new Scanner(System.in);
        int i,Ent;
        System.out.println("Ingresa un Numero: ");
        Ent=ce.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(i+"*"+Ent+"="+(Ent*i));
        }
    }
}