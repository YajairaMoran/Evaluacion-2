/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, pass;
        String USUARIO = "Admin";
        String PASS = "Admin";
        
        Scanner captu = new Scanner (System.in);
        
        //Como es un control de acceso, debemos de preguta un numero indeterminado
        //de veces, hasta que el usuario y contraseña sean correctos 
        
        while (true){//se detiene cuando el ciclo es falso
            System.out.println("Usuario:");
            usuario = captu.nextLine();
            System.out.println("Contraseña:");
            pass = captu.nextLine();
            if (usuario.equals(USUARIO) && pass.equals(PASS))
                break;
            else 
                System.out.println("Usuario o contraseña incorresctos");
        }
        System.out.println("Bienvenido al sistema");
        
        
    }
    
}
