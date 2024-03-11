/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int canti, saldo ;
        
        Scanner cap = new Scanner (System. in);
        System.out.println("¿Cuantas piezas quieres comprar?");
        canti = cap.nextInt();
        
        if(canti > 1000)
            saldo = canti*500;
        else
          saldo = canti*800;
        System.out.println("El precio es:" + saldo);
    }
    
}
