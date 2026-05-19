/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploswitch;

import java.util.Scanner;

public class EjemploSwitch {

    public static void main(String[] args) {
        int dia;
        String nombreDia;
        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese un numero del 1 al 7 ");
        dia = leer.nextInt();

        switch (dia) {
            case 1:
                nombreDia = "lunes";
                break;
            case 2:
                nombreDia = "martes";
                break;
            case 3:
                nombreDia = "miercoles";
                break;
            case 4:
                nombreDia = "jueves";
                break;
            case 5:
                nombreDia = "viernes";
                break;
            case 6:
                nombreDia = "sabado";
                break;
            case 7:
                nombreDia = "domingo";
                break;
            default:
                nombreDia = "Dia incorrecto";
        }

        System.out.println(" El nombre del dia es: " + nombreDia);

    }
}
