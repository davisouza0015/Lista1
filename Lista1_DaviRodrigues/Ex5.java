package Lista1_DaviRodrigues;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorOriginal, descontoPercentual, valorDesconto, novoValor;

        System.out.println("Qual o valor original do produto? ");
        valorOriginal = entrada.nextDouble();
        System.out.println("Quantos % de desconto voce ganhou? ");
        descontoPercentual = entrada.nextDouble();

        valorDesconto = valorOriginal *(descontoPercentual/100);
        novoValor = valorOriginal - valorDesconto;

        System.out.println("O novo valor do produto é de " + novoValor + " reais.");

    }

}
