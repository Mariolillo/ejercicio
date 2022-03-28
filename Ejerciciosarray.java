package ejerciciosarray;

import java.util.Random;
import java.util.Scanner;

public class Ejerciciosarray {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Random generador = new Random();
        
        int[] datos = {89, -54, 12, 45, -90, 32, 123};
        int posicion_actual,opcion;
        boolean dentro = true;
        posicion_actual = generador.nextInt(datos.length);

        do {
            System.out.println("Posicion:" + posicion_actual);
            System.out.println("Valor:" + datos[posicion_actual]);
            System.out.print("1.Izquierda ó 2.Derecha:");
            opcion=teclado.nextInt();
            if(opcion==1){
                posicion_actual--;
            }else if(opcion==2){
                posicion_actual++;
            }else{
                System.out.println("Opción erronea");
            }
            if(posicion_actual<0 || posicion_actual>=datos.length){
                dentro=false;
            }
        } while (dentro);
        System.out.println("Hasta luego te has salido del array");
    }

}
