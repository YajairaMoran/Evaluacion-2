/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author danie
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES ARITMÉTICOS
        //SUMA +, RESTA -, MULTIPLICACIÓN *, DIVISION /
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2; //operaodr de suma +
        //si el operador + uno de los terminos es
        //una cadena, todo se convierte a cadena y se unen
        //concatenación: unión de cadenas de texto
        System.out.println("La suma es:" + suma);
        boolean prueba = true; 
        System.out.println("El valor de prueba es: " + prueba);
        
        //multiplicación 
        int multi; 
        multi = num1 * num2; 
        System.out.println("La multiplicación es:" + multi);
        
        //división
        int divi = 7 / 2;
        System.out.println("la división de 7 / 2 es:" + divi );
        double diviDouble = 7.0 / 2.0 ;
        System.out.println("la división de 7 / 2 es:" + diviDouble );
        
        //ACUMULADORES
        // suma +=, resta -=, multi *=, divi /=
        int sumatoria = 0;
        /* sumatoria = sumatoria + 90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria + 80;*/
        sumatoria += 90;
        sumatoria += 80;
        sumatoria += 80;
        System.out.println("La sumatoria es:" + sumatoria);
        
        sumatoria -= 70; //le resta 70 a la sumatoria
        //sumatoria = sumatoria -70;
        System.out.println("La sumatoria es:" + sumatoria);
        
        //
        int multiAcum = 1; 
        multiAcum *= 100; 
        System.out.println("Multiacum es:" + multiAcum);
        multiAcum *= 5;
        System.out.println("Multiacum es:" + multiAcum);
    }
    
}
