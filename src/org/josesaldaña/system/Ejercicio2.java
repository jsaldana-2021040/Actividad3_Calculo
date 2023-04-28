package org.josesaldaña.system;
import java.util.Scanner;
        
/**
 * @author José Roberto Saldaña Arrazola
 * @date 21/03/2022

 * Codigo tecnico: IN5BM
 * Carné: 2021040
 * Grupo: 2 (lunes) 
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        int numero = 1;
        int temp=0 ;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();
            temp=temp+numero;
            
        }while (numero > 0);
        
        System.out.println("La suma de todos los numero : " + temp );
    }
}