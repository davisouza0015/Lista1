package Lista1_DaviRodrigues;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double grausCelsius, grausFahrenheit;

        System.out.println("Informe a temperatura em graus Celsius: ");
        grausCelsius = entrada.nextDouble();

        grausFahrenheit =( grausCelsius * 9.0/5.0) +32.0;

        System.out.println("A tempera em graus fahrenheit é de " + grausFahrenheit + "F");
    }

}
