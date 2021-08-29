
package punto2;

import java.util.Scanner;


public class punto2 {
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner (System.in);
        System.out.println("Ingrese el primero numero entero");
        int num1 = ingreso.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int num2 = ingreso.nextInt();
        
        System.out.printf("La suma es:%d%n",suma(num1,num2));
        System.out.printf("El producto es:%d%n",produc(num1,num2));
        System.out.printf("La diferencia es:%d%n",diferent(num1,num2));
        
    } 
    public static int suma(int num1,int num2){
    return num1+num2;
    }
    
    public static int produc(int num1,int num2){
    return num1*num2;
    }
    
    public static int diferent(int num1,int num2){
    return num1-num2;
    }
}
