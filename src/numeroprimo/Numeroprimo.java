/*

 */
package numeroprimo;

import java.util.Scanner;

/**
 *
 * @author luistorresco
 */
public class Numeroprimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int num, sw=0, i=2;
         System.out.print("escriba un numero positivo");
                 num=objread.nextInt();
        while((i <= num/2) && (sw == 0))
            if(num% i==0)
            sw = 1;
            else  
              i++;      
       
            if (sw == 1)
            System.out.print("el numero " +num + "no es primo");
            else 
            System.out.print("el numero " +num + " es primo");
       
     }           
 }



