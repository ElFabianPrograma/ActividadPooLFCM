
package punto9;

import java.util.Scanner;


public class punto9 {
public static void main(String[] args) {
       int gaso_dia,adic;
       Scanner ingreso = new Scanner (System.in);
       
        System.out.print("Ingrese los dias del viaje: ");
        int dias = ingreso.nextInt();
        System.out.print("Ingrese lso Km por dia: ");
        float km = ingreso.nextFloat();
        System.out.print("Ingrese el costo de litro de gasolina: ");
        int gaso = ingreso.nextInt();
        System.out.print("Ingrese los Km recorridos por litro de gasolina: ");
        float km_gaso = ingreso.nextFloat();
        System.out.print("Ingrese el costo de estacionamiento por dia: ");
        int estacio = ingreso.nextInt();
        System.out.print("Ingrese el costo de peaje por dia: ");
        int peaje = ingreso.nextInt();
        
        gaso_dia= (int)((km/km_gaso)*gaso);
        adic=estacio+peaje;
        
        System.out.printf("El costo total del vieaje es de :%d%n",costoviaje(dias,gaso_dia,adic));
                
    }
    
    public static int costoviaje(int a,int g,int h){
    return (g+h)*a;
    }    
}
