/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_24_ADIVINAR_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 5; //numero que tiene que adivinar el usuario (1-10)
        int valor = 0; // valor para almacenar lo que capture el usuario 
        Scanner captu = new Scanner (System.in);
            
        while (num != valor){
            System.out.println("¿Cual es el numero? Entre 1 y 10");
            valor = captu.nextInt();
        }
        System.out.println("ADIVINASTE!!");
        
    }
    
}
