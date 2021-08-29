
package punto4;

import java.util.Scanner;


public class punto4 {
 public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
        
        System.out.print("Ingrese el radio de la circunferencia: \n");
            float radio = ingreso.nextFloat();
            
            System.out.printf("Su longitud es:%.2f%n",longitud(radio));
            System.out.printf("Su area es:%.2f%n",area(radio));
            
    }
    public static float longitud(float radio){
    return (float) (2*3.1416*radio);
    }
    
    public static float area(float radio){
    return (float) (3.1416*(radio*radio));
    }      
}
