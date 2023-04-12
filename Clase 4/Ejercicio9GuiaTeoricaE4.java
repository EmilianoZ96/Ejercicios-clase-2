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
public class Ejercicio9GuiaTeoricaE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle 
y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado
de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el 
uso de la sentencia break.*/
        Scanner leer = new Scanner(System.in);

        System.out.println("A cotinuacion escriba 20 numeros enteros");
        int num;
        int suma = 0;
        int cont = 0;
        do {
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("Se capturo el numero cero");
                break;
            } else if (num < 0) {
                cont++;
                continue;
            } else {
                suma = num + suma;
            }
            cont++;
        } while (cont != 20);
        System.out.println("La suma es: " + suma);

    }

}
