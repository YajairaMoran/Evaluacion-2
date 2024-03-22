/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda; 
        int adivinar;
        moneda = Math.random();
        Scanner captu = new Scanner (System.in);
        System.out.println("cara (0) o cruz (1)");
        adivinar = captu.nextInt();
        
        System.out.println("valor de la moneda = " + moneda);
        
        //0.5 es la mitad de l rango, >0.5 cara, menor es cruz
        if (moneda < 0.5 && adivinar == 0)
            System.out.println("Adivinaste, es cara!!");
        else
            if (moneda >= 0.5 && adivinar == 1)
                System.out.println("Adivinaste, es cruz!!");
            else 
                System.out.println("perdiste!!");
        
    }
    
}
