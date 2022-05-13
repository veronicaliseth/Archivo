import java.util.Scanner;
public class MainCuentas{
    public static void main(String[] args){
        int tipoCuenta;
        LeerArchivo leer = new LeerArchivo();
        Scanner entrada = new Scanner(System.in);
        
        do{
         System.out.println("Eliga una opcion");
         System.out.println("1.Cuentas con saldo de cero");
         System.out.println("2.Cuentas con saldo disponible");
         System.out.println("3.Salir");
         tipoCuenta=entrada.nextInt();
         if(tipoCuenta==1){
             leer.leer(0);
         }else if(tipoCuenta==2){
             leer.leer(1);
         }
        }while(tipoCuenta!=3);
        

    }
}