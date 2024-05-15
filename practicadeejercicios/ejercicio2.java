package practicadeejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int i = 0;

        System.out.println("Escriba un número entero: ");
        numero = entrada.nextInt();

        System.out.println("Los números impares hasta " + numero + " son: ");

        while (i < numero){
            if (i % 2 != 0)
            System.out.println(i);
            i++;
        }
    }
}
