package Lista1_DaviRodrigues;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dividendo,divisor, quociente, resto;

        System.out.println("Digite um valor para ser o dividendo: ");
        dividendo = entrada.nextInt();
        System.out.println("Digite um valor para ser o divisor: ");
        divisor = entrada.nextInt();

        quociente = dividendo / divisor;
        resto = dividendo % divisor;

        System.out.println("Dividendo = " + dividendo);
        System.out.println("Divisor = " + divisor);
        System.out.println("Quociente = " + quociente);
        System.out.println("Resto = " + resto);

    }

}
