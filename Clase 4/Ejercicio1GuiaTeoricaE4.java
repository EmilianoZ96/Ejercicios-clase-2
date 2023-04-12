/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1GuiaTeoricaE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Implementar un programa que le pida dos números enteros al usuario y determine 
    si ambos o alguno de ellos es mayor a 25.*/
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int num2 = leer.nextInt();
      if (num1 >=25){ 
System.out.println("El numero 1 es mayor o igual que 25"); 
}else { 
System.out.println("El numero 1 es menor o igual que 25");
}
      if (num2 >=25){
          System.out.println("El numero 2 es mayor o igual que 25");
}else{
          System.out.println("El numero 2 es menor o igual que 25");
      }
    }
}
