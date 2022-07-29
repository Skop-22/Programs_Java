import java.util.Scanner;//librería para la entrada de datos
import java.util.regex.*;//libreria de expreciones regulares
public class Ropa{//clase Ropa
    public static void main(String[] args){//main
        Scanner Sca = new Scanner(System.in);//crea una nueva Scanner instancia que apunta al flujo de entrada
        Pattern pat = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");//exprecion regular para fecha
        int i,condicion2=1,contador=0,escolar;//Variables de tipo entero 
        String fe;//bariables de tipo string
        String[] Producto={"Pantalones","Blusas    ","Vestidos  ","Calcetas  ","Faldas    "};//arreglo con los productos
        int[] almacen={340,500,450,500,700};//arreglo de tipo entero definido
        String[] NomComp=new String[20];//Arreglo de tipo String
        String[] fecha=new String[20];
        int[] compra=new int[20];//arreglo de tipo entero
        int[] cantidad=new int[20];
        while(condicion2==1){//condicion de menu 2
            System.out.println("°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||");//Ya se comento arriba
            System.out.println("                 Menu de adquirir producto");//Ya se comento arriba 
            System.out.println("°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||");//Ya se comento arriba
            System.out.println("Nu°   producto        cantidad");
            for(i=0;i<5;i++){//for para imprimir el producto y cantidad
                System.out.println(i+".-"+Producto[i]+" :"+almacen[i]);//imprime numero nombre del producto y cantidad del producto
            }//fin de for
            System.out.print("Introdusca el numero del producto: ");//Ya se comento arriba
            compra[contador]=Sca.nextInt();//Ya se comento arriba
            if (compra[contador]==1){
                System.out.println("La Blusa es escolar 1=si/2=no: ");
                escolar=Sca.nextInt();
                if(escolar==1){
                    System.out.println("tipo escolar solo la autoriza el señor Rodriguez ");
                }
                if(escolar==2){
                    System.out.println("autoriza el señor Lopez");
                }
            }
            while(compra[contador]>4){//while para evitar error de salida
                System.out.print("Introdusca el numero del producto: ");//Ya se comento arriba
                compra[contador]=Sca.nextInt();//Ya se comento arriba
            }//fin del while
            System.out.print("Introdusca su nombre: ");//Ya se comento arriba
            NomComp[contador]=Sca.next();//Ya se comento arriba
            System.out.print("Introdusca la cantidad de "+Producto[compra[contador]]+" :");//Ya se comento arriba
            cantidad[contador]=Sca.nextInt();//Ya se comento arriba
            System.out.println("Introdusca la fecha del dia ejemplo 29/12/1999: ");//Ya se comento arriba
            fe=Sca.next();//introduce la fecha
            Matcher mat = pat.matcher(fe);//compara conla exprecion regular
            while(mat.find()==false){//while cunado la variable fe 
                System.out.println("Introdusca la fecha del dia ejemplo 29/12/1999: ");//Ya se comento arriba
                fe=Sca.next();//Ya se comento arriba
                mat = pat.matcher(fe);//lo buelbe a comparar con la variable fe
            }//fin del while
            fecha[contador]=fe;//se gurada la fecha en el arreglo
            if ((almacen[compra[contador]]==0)||(almacen[compra[contador]]<cantidad[contador])){System.out.println("        No hay suficiente producto");break;}//control de errores si almacen es igual a 0 y cantidad es mayor de lo que hay en el almacen
            else {almacen[compra[contador]]=almacen[compra[contador]]-cantidad[contador];}//de lo contrario se resta la cantidad 
            System.out.println("\n\n°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||");//Ya se comento arriba
            System.out.println("                      Compra:");//Ya se comento arriba
            System.out.println("°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||");//Ya se comento arriba
            for(i=0;contador>=i;i++){//for para imprimir todas las compras
                System.out.println(i+".-"+"El cliente "+NomComp[i]+" compro "+Producto[compra[i]]+" Cantidad: "+cantidad[i]+" Fecha: "+fecha[i]);//iprime en pantalla nombre del cliente y el producto que compro
            }//fin del for
            System.out.println("\n\n°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||");//Ya se comento arriba
            System.out.println("                      Almacen: ");//Ya se comento arriba
            System.out.println("°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||°||");//Ya se comento arriba
            for(i=0;i<5;i++){//for para imprimir el producto y cantidad
                System.out.println(i+".-"+Producto[i]+" :"+almacen[i]);//imprime numero nombre del producto y cantidad del producto
            }//fin de for
            contador=contador+1;//contador
            System.out.print("\n\n\nDesea salir 3=si 1=no:     ");//Ya se comento arriba 
            condicion2=Sca.nextInt();//entrada de dato
            if((condicion2!=3)&&(condicion2!=1)){System.out.println("-------------Error-----------");condicion2=3;}//si condicion2 es diferente de 3 y 1
        }//fin de while de menu 2 adquirir productos
    }//fin de main
}//fin de la clase Ropa