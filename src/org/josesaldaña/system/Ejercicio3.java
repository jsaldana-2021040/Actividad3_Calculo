package org.josesaldaña.system;
import java.util.Scanner;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public class Ejercicio3 {
    
    public static void main(String[] args) {

        int numero = 1;
        int temp=0 ;
        int contador = 0;
        String respuesta;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("\nIngrese una nota: ");
            numero = sc.nextInt();
            temp=temp+numero;
            contador++;
            System.out.print("\nDesea ingresar otra nota? (s/n): ");
            respuesta=sc.next();
        }while (respuesta.equalsIgnoreCase("s"));
        
        System.out.println("\nEl promedio es: " + temp/contador );
    }
}
