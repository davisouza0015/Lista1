package Lista1_DaviRodrigues;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade,ano = 365, diasvividos;

        System.out.println("Qual o seu nome ? ");
        nome = entrada.nextLine();
        System.out.println("Quantos anos voce tem? ");
        idade = entrada.nextInt();

        diasvividos = idade * ano;

        System.out.println("Ola " + nome + ", voce ja viveu " + diasvividos + " dias");
    }

}
