/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_20_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje;
        int rep;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un mensaje");
        mensaje = captu.nextLine();
        System.out.println("Cuantas veces quieres que se repita el mensaje");
        rep = captu.nextInt();
        for (int i = 1; i <= rep; i++) {
            System.out.println(mensaje);  
        }
        System.out.println("");
        
        
        int num, suma = 1;
        //int suma = 1;
        //int sumatoria = 0;
        System.out.println("Introduce un numero");
        num = captu.nextInt();
        int sumatoria = 0;
        for (int  i = 1;  i <= num; i++) 
            sumatoria = sumatoria + i;
        System.out.println("La sumatoria total de " + num + " = " +sumatoria);
        System.out.println("");
        
        
        System.out.println("Introduce un numero");
        num = captu.nextInt();
        for (int  i = 1;  i <= num; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            }
        for (int  i = 1;  i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("*");}
            System.out.println("");
        }
    }
    
}
