/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println(" Escribe el primer numero: ");
        num1 = teclado.nextInt();

        System.out.println(" Escribe el segundo numero: ");
        num2 = teclado.nextInt();

        suma = num1 - num2;

        System.out.println(" tu resultado es: " + suma);

    }

}
