package Lista1_DaviRodrigues;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a1,r,n,an;

        System.out.println("Digite o primeiro termo (a1): ");
        a1 = entrada.nextInt();
        System.out.println("Digite a razao (r): ");
        r = entrada.nextInt();
        System.out.println("Digite o valor de n (indice do termo): ");
        n = entrada.nextInt();

        an = a1 + (n-1) * r;

        System.out.println("O valor da P.A de n é: " + an);

    }

}
