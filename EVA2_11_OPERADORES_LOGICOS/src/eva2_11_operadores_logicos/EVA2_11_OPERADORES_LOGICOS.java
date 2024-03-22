/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_operadores_logicos;

/**
 *
 * @author danie
 */
public class EVA2_11_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean hayDinero, hayBuenClima;
        //PARA HACER LA CARNE ASADA SE NECESITA:
        //HAYA DINERO Y HAYA BUEN CLIMA
        
        hayDinero = false;
        hayBuenClima = false;
        
        System.out.println("1. No hay dinero y no hay buen clima ");
        if ((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se armo la carnita asada!!");
        else
            System.out.println("A comer buevito!!");
        
        
        hayDinero = false;
        hayBuenClima = true;
        
        System.out.println("2. No hay dinero y hay buen clima ");
        if ((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se armo la carnita asada!!");
        else
            System.out.println("A comer buevito!!");
        
        hayDinero = true;
        hayBuenClima = false;
        
        System.out.println("3. Hay dinero y no hay buen clima ");
        if ((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se armo la carnita asada!!");
        else
            System.out.println("A comer buevito!!");
        
        
        hayDinero = true;
        hayBuenClima = true;
        
        System.out.println("4. Hay dinero y hay buen clima ");
        if ((hayDinero == true) && (hayBuenClima == true))
            System.out.println("Se armo la carnita asada!!");
        else
            System.out.println("A comer buevito!!");
    }
    
}
