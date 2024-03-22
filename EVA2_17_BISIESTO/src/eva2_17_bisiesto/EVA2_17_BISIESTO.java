/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año, divi, resi1, resi2, resi3;
        Scanner captu = new Scanner (System.in);
        System.out.println("Ingresa un año");
        año = captu.nextInt();
        divi = año / 4;
        resi1 = año % 4;
        resi2 = año % 100;
        resi3 = año % 400;
        
        if ((resi1 == 0) )
            System.out.println("Es bisiesto");
        else if ((resi2 == 100) && (resi3 == 400)) 
            System.out.println("Es bisiesto");
        else 
            System.out.println("No es bisiesto");
            
    }
    
}
