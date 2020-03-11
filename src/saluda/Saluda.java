/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saluda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class Saluda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad ;
        System.out.println("Introduzca nombre");
        nombre = sc.nextLine();
        System.out.print("Hola " + nombre);
        System.out.println("");
        edad = sc.nextInt();
        System.out.println("Introduzca la edad");
       System.out.print("Hola " + nombre + " tienes " + edad + " años");
    }
}
