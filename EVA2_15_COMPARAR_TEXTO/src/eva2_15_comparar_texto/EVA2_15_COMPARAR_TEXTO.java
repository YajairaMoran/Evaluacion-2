/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_15_COMPARAR_TEXTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COMPARAR TEXTO EN JAVA
        String dia;
        Scanner captu = new Scanner (System.in);
        System.out.println("Introduce un dia de la semana en minusculas");
        dia = captu.nextLine();
        
        if (dia.equals("domingo")) // AI SE COMPARAN CADENAS DE TEXTO EN JAVA 
            //SE APOYA DEL .EQUALS
            System.out.println("Es el 1er dia de la semana");
        else if (dia.equals("lunes"))
            System.out.println("Es el 2do dia de la semana");
        else if (dia.equals("martes"))
            System.out.println("Es el 3er dia de la semana");
        else if (dia.equals("miercoles"))
            System.out.println("Es el 4to dia de la semana");
        else if (dia.equals("jueves"))
            System.out.println("Es el 5to dia de la semana");
        else if (dia.equals("viernes"))
            System.out.println("Es el 6to dia de la semana");
        else if (dia.equals("sabado"))
            System.out.println("Es el 7mo dia de la semana");
        else
            System.out.println(dia + " no es valido");
        
        
    }
    
}
