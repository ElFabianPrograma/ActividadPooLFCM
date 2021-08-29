
package punto10;

import java.util.Scanner;


public class punto10 {
 public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
            
            System.out.print("Ingrese el peso por KILOGRAMO(S): \n");
            float num1 = ingreso.nextFloat();
           
            System.out.printf("El peso en kilo(s) es :%f%n",Kilo(num1));
            System.out.printf("El peso en gramo(s) es :%f%n",Gramo(num1));
            System.out.printf("El peso en Libra(s) es :%f%n",Libra(num1));
            System.out.printf("El peso en Tonelada(s) es :%f%n",Tonelada(num1));
                
        
    }
    public static float Kilo(float a){
    return a ;
    }
    
     public static float Gramo(float a){
    return a*1000 ;
    }
     
    public static float Libra(float a){
    return (float) (a*(2.20462)) ;
    }
    
    public static float Tonelada(float a){
    return (float)(a*(0.001)) ;
    }   
}
