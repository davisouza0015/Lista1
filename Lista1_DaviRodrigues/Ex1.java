package Lista1_DaviRodrigues;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nomeMarido,nomeEsposa,sobrenomeMarido,sobrenomeEsposa;
        int anoCasamento, anoAtual = 2025,tempoCasamento;

        System.out.println("Informe o nome do marido: ");
        nomeMarido = entrada.nextLine();
        System.out.println("Informe o sobrenome do marido: ");
        sobrenomeMarido = entrada.nextLine();

        System.out.println("Informe o nome da Esposa: ");
        nomeEsposa = entrada.nextLine();
        System.out.println("Informe o sobrenome da Esposa: ");
        sobrenomeEsposa = entrada.nextLine();

        System.out.println("Informe o ano de casamento de voces: ");
        anoCasamento = entrada.nextInt();
        tempoCasamento = anoAtual - anoCasamento;

        System.out.println(nomeMarido+ " " + sobrenomeMarido + " é casado com " +nomeEsposa + " " + sobrenomeEsposa+ " a "+tempoCasamento+" anos.");
    }

}