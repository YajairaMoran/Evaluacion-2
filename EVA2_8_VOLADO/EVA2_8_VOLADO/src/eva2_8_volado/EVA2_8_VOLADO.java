/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_volado;

/**
 *
 * @author danie
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Numero aleatorio en Java
        //Valores entre 0 y 1
        //0.5646486654
        //0.4465447913
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de la moneda es = " + moneda);
        
        //0.5 es la mitad e l rango
        if (moneda > 0.5)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
        
    }
    
}
