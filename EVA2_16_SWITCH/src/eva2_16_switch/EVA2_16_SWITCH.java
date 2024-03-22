/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_switch;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_16_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un numero de mes");
        mes = captu.nextInt();
        
        switch (mes){
            case 1:
                System.out.println("Enero");
                break; // TERMINA EL SWITHC
            case 2:
                System.out.println("Febrero");
                break; // TERMINA EL SWITHC
            case 3:
                System.out.println("Marzo");
                break; // TERMINA EL SWITHC
            case 4:
                System.out.println("Abril");
                break; // TERMINA EL SWITHC
            case 5:
                System.out.println("Mayo");
                break; // TERMINA EL SWITHC
            case 6:
                System.out.println("Junio");
                break; // TERMINA EL SWITHC
            case 7:
                System.out.println("Julio");
                break; // TERMINA EL SWITHC
            case 8:
                System.out.println("Agosto");
                break; // TERMINA EL SWITHC
            case 9:
                System.out.println("Septiembre");
                break; // TERMINA EL SWITHC
            case 10:
                System.out.println("Octubre");
                break; // TERMINA EL SWITHC
            case 11:
                System.out.println("Noviembre");
                break; // TERMINA EL SWITHC
            case 12:
                System.out.println("Diciembre");
                break; // TERMINA EL SWITHC
            default: // se puede utilizar if
                System.out.println("numero de mes no valido");
            
        }
        
        
    }
    
}
