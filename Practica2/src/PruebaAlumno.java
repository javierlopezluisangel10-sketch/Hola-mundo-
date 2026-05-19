/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel_lopez
 */
public class PruebaAlumno {
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Luisina", "de paula");
        Alumno  alu3 = new Alumno(10, "ivan", "gonzales");
        
        System.out.println(" La id del alumno 2 es: " + alu2.getId());
        System.out.println(" El nombre es: " + alu2.getNombre());
        System.out.println(" El apellido es:" + alu2.getApellido());
        
        System.out.println("---------------");
        
        System.out.println(" la id del alumno 3 es: " + alu3.getId());
        System.out.println(" El nombre  es: " + alu3.getNombre());
        System.out.println(" El apelido es: " + alu3.getApellido());
        


        
        alu1.setId(8);
        alu1.setNombre("Suscribete");
        alu1.setApellido("code");
        
        System.out.println("-------------");
        System.out.println(" La id del alumno 1 es: " + alu1.getId());
        System.out.println(" El nombre es: " + alu1.getNombre());
        System.out.println(" El apellido es:" + alu1.getApellido());
        //cambio de valor id 
        alu2.setId(35);
        System.out.println("--------------");
        System.out.println(" La id del alumno 2 es: " + alu2.getId());
        System.out.println(" El nombre es: " + alu2.getNombre());
        System.out.println(" El apellido es:" + alu2.getApellido());
        

    }
    
}
