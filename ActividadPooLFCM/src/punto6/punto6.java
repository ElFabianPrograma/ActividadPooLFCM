
package punto6;

import java.util.Scanner;


public class punto6 {
 public static void main(String[] args) {
         Scanner ingreso = new Scanner (System.in);
         
         System.out.print("Ingrese el peso en Kilogramos: \n");
            float peso = ingreso.nextFloat();
            System.out.println("Ingrese la altura metros: ");  
            float altura = ingreso.nextFloat();
            
            System.out.printf("El resultado es:%.2f%n",BMI(peso,altura));
            
    }
    public static float BMI(float peso,float altura){
    return peso/(altura*altura);
    }   
}
