package org.josesaldaña.system;
import java.util.Scanner;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero;
        int temporal=0;
        
        for (int i = 0; i <=9; i++) {
            System.out.print("Ingrese un sueldo: ");
            numero = sc.nextInt();
            
            if(numero>5000){
             contador++;   
            }
        }
        System.out.println("Mayores a 5000 hay: " + contador);
    }

}
