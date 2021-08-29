
package punto7;

import java.util.Scanner;


public class punto7 {
 public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
        
        System.out.println("Ingrese valor del producto:");
        float v_pro = ingreso.nextFloat();
        
        System.out.println("Ingrese su utilidad:");
        float por_uti = ingreso.nextFloat();
        
        System.out.printf("El porcentaje es:%.3f%n",resul(v_pro,por_uti));
        System.out.printf("Con un porcetage de ganancia de:%.3f%n ",resul2(v_pro,por_uti));
                
    }
    public static float resul(float v_pro,float por_uti){
    return ((por_uti*100)/v_pro);
    }  
    public static float resul2(float v_pro,float por_uti){
    return ((por_uti*100)/v_pro)-100;
    }
}
