package practicadeejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int puntos = 0;
        String tipocliente = "";

        System.out.println("Escriba los puntos del cliente");
        puntos = entrada.nextInt();

        if (puntos <= 1000){
            tipocliente = "Bronce";

        }
        else if (puntos > 1000 && puntos <= 3000){
            tipocliente = "Plata";
        }
        else if (puntos > 3000){
            tipocliente = "Oro";
        }


        System.out.println("Los puntos del cliente son: " + puntos);
        System.out.println("Tipo de cliente: " + tipocliente);

    }
}
