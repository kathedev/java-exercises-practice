package practicadeejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String[] mascotas = new String[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Escriba el nombre de una mascota: [" + i +  "]");
            mascotas[i] = Scanner.next();
        }

        System.out.println("Los nombres de las mascotas ingresadas son: ");
        for (int i = 0; i < 10; i++){
            System.out.println("[" + i + "] " + mascotas[i]);
        }
    }
}
