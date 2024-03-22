/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_9_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda; 
        int resp;
        moneda = Math.random();
        Scanner captu = new Scanner (System.in);
        System.out.println("presiona 1 si cres que caera cara y 2 si es cruz");
        resp = captu.nextInt();
        
        if (moneda > 0.5 )
            System.out.println("Salio Cara");
        else
            System.out.println("Salio Cruz");
        
        if (moneda > 0.5 && resp == 1)
            System.out.println("Ganaste es cara");
        else
            if (moneda < 0.5 && resp == 2)
            System.out.println("Ganaste es cruz");
                else 
                    System.out.println("perdiste");
    }
    
}
