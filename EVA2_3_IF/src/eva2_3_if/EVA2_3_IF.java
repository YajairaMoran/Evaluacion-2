/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double calif;
        Scanner cap = new Scanner (System. in);
        System.out.println("Introcuce la calificacion ");
        calif = cap.nextDouble();
        if(calif >= 70) { //esta seccion --> true
            //{} opcionales, solo cuando tnemos mas 
            //de una instruccion
            System.out.println("Aprobaste!!!");
        } else { //la evalucion false es opcional
            System.out.println("No acreditaste!!");
        }
        //cuando son varias instrucciones se recomienda poner llaves {}, 
        //el prograa funciona sin estas pero se usan para mayor legibilidad
        
    }
    
}
