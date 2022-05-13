import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;

public class LeerArchivo {
    private Scanner entrada;
    
    public void leer(int tipoCuenta){
        int cuenta;
        String nombre;
        double saldo;
        try{
            entrada = new Scanner( new File( "cuenta.txt" ) );
        }
        catch ( FileNotFoundException fileNotFoundException ){
            System.err.println( "Error al abrir el archivo." );
            System.exit( 1 );
        }
        
        try{ // lee registros del archivo, usando el objeto Scanner
            while ( entrada.hasNext() ){
                cuenta=entrada.nextInt(); // lee el número de cuenta
                nombre=entrada.next(); // lee el primer nombre
                saldo=entrada.nextDouble(); // lee el saldo
               verificar(tipoCuenta, cuenta, nombre, saldo);
            }
        }
        catch ( NoSuchElementException elementException ){
            System.err.println( "El archivo no esta bien formado." );
            entrada.close();
            System.exit( 1 );
        }
        catch ( IllegalStateException stateException ){
            System.err.println( "Error al leer del archivo." );
            System.exit( 1 );
        }
    }
     
    public static void verificar(int tipoCuenta, int cuenta, String nombre, double saldo){
        if(tipoCuenta==0){
            if(saldo==0){
            System.out.println(cuenta+" "+nombre+" "+saldo);
            }
        }
        else if(tipoCuenta==1){
            if(saldo > 0){
                System.out.println(cuenta+" "+nombre+" "+saldo);
            }
        }

    }
}
