package Lista1_DaviRodrigues;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, area, perimetro;

        System.out.println("Informe o raio: ");
        raio = entrada.nextDouble();

        area = Math.PI * Math.pow(raio, 2.0);
        perimetro = 2 * Math.PI * raio;

        System.out.println("Raio " + raio);
        System.out.println("Area " + area);
        System.out.println("Perimetro " + perimetro);


    }

}
