/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_break_cont;

/**
 *
 * @author danie
 */
public class EVA2_25_BREAK_CONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 100; i++) {
            int mod = i % 2;
            if (mod != 0) //o (mod == 1) si se quieren imprimir los numeros pares 
                continue; // cuando se ejecuta, interrumpe la iteracion (repeticion) actual
            System.out.print(i + " - ");
        }
        
        System.out.println("");
        System.out.println("Break: >>>>");
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " - ");
            if (i == 50)
                break; // cuando se ejecuta detiene por completo el ciclo
        }
        
        
        
        
        
    }
    
}
