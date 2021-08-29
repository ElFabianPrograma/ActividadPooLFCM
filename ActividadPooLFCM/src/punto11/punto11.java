
package punto11;

import java.util.Scanner;


public class punto11 {
public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        
        int num,uni,dec,cen,res;
        System.out.println("MOSTRAR LA UNIDAD, DECENA Y CENTENA\n");
        System.out.println("Ingrese un numero de 3 cifras : ");
        num = Integer.parseInt(ingreso.next());
        cen = num /100;
        res = num - (cen * 100);
        dec = res / 10;
        uni = res- (dec * 10);
        System.out.println("Centena : "+cen);
        System.out.println("Decena : "+dec);
        System.out.println("Unidad : "+uni);
    
     }
    
}
