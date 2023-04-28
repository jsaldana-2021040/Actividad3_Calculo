package org.josesaldaña.system;
import java.util.Scanner;

/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        int numero = 1;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        while (numero >= 0) {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();
            contador++;
        }
        System.out.println("Se han introducido: " + contador);
    }
}
