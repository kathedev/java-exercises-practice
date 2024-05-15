package practicadeejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int respuestascorrectas = 0;
        int respuestasincorrectas = 0;
        int respuestasvacias = 0;
        int puntaje = 0;

        System.out.println("Escriba el número de respuestas correctas");
        respuestascorrectas = entrada.nextInt();
        System.out.println("Escriba el número de respuestas incorrectas");
        respuestasincorrectas = entrada.nextInt();
        System.out.println("Escriba el número de respuestas vacías");
        respuestasvacias = entrada.nextInt();

        puntaje = (respuestascorrectas * 5) + (respuestasincorrectas -2) + (respuestasvacias );
        System.out.println("El puntaje es: " + puntaje);
    }
}
