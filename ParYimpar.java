import java.util.Scanner;
public class ParYimpar{
    public static void main (String[]args){
    Scanner leer = new Scanner(System.in);

    int num;

    System.out.print("Escribe un numero");
    num = leer.nextInt();

    if (num % 2 == 0){
        System.out.println(" El numero ingresado es par: "  + num);
    }else{
            System.out.println("  El numero " + num + " Es impar " );
        } 

    leer.close();
 }
}