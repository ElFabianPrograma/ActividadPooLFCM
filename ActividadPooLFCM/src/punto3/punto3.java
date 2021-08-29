
package punto3;

import java.util.Scanner;


public class punto3 {
    public static void main(String[] args) {
        
            Scanner ingreso = new Scanner (System.in);
            
            System.out.print("Ingrese el primer numero: \n");
            float num1 = ingreso.nextFloat();
            System.out.println("Ingrese el segundo numero: ");  
            float num2 = ingreso.nextFloat();
            System.out.println("Ingrese el tercer numero: ");
            float num3 = ingreso.nextFloat();
            
            System.out.printf("Suma:%.2f%n",suma(num1,num2,num3));
            System.out.printf("promedio:%.2f%n",promedio(num1,num2,num3));
            System.out.printf("producto:%.2f%n",producto(num1,num2,num3));
            System.out.printf("cociente:%.2f%n",cociente(num1,num2,num3));
            System.out.printf("modulo:%.2f%n",modulo(num1,num2,num3));       
        
    }
    public static float suma(float a,float b,float c){
    return a + b + c;
    }
    
     public static float promedio(float a,float b,float c){
    return (a + b + c)/3;
    }
     
    public static float producto(float a,float b,float c){
    return a * b * c;
    }
    
    public static float cociente(float a,float b,float c){
    return a / b / c;
    }
    
    public static float modulo(float a,float b,float c){
    return a % b % c;
    }   
}
