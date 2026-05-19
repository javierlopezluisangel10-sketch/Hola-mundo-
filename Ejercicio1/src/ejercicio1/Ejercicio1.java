/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;



public class Ejercicio1 {

    public static void main(String[] args) {
        int edad;
        Scanner leer = new Scanner(System.in);

        System.out.println(" Escribe la edad que tienes ");
        edad = leer.nextInt();

        if (edad > 18) {
            System.out.println(" ya eres mayor mijo tito ");
            if(edad>40){
                System.out.println(" eres generacion x  ");
            }
            else{
                System.out.println(" sos milenial ");
            }
        } else {

            if (edad == 18){
            System.out.println(" justo los acabas de cumplir brother ");
            }
            else {
                    
                System.out.println(" no podes acceder eres menor /: ");
           }
        }

        System.out.println(" ------------ ");
        System.out.println(" llegaste a la parte final ");

    }
}
