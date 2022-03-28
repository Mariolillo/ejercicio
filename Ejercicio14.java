package ejerciciosarray;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] datos={5,8,1};
        int[] nuevo;//{10,16,2} EJEMPLO
        
        //Crear un array del mismo tamaño que el original
        //Mismo tamaño de datos
        
        nuevo=new int[datos.length];
        for(int i=0;i<nuevo.length;i++){
            nuevo[i]=datos[i]*2;
        }
        
        for(int i=0;i<nuevo.length;i++){
            System.out.print(nuevo[i]+" ");
        }
        System.out.println();
        
        
    }
}
