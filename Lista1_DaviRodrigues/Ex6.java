package Lista1_DaviRodrigues;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double autonomia = 12.0, tempoGasto, velocidadeMedia, distancia, litrosUsados;

        System.out.println("Qual foi o tempo gasto para realizar a viagem? ");
        tempoGasto = entrada.nextDouble();
        System.out.println("Qual foi a velocidade média? ");
        velocidadeMedia = entrada.nextDouble();

        distancia = tempoGasto * velocidadeMedia;
        litrosUsados = distancia / autonomia;

       System.out.println("Sua velocidade media foi de " + velocidadeMedia + " KM/H, você gastou um total de " + tempoGasto + " horas, percorrendo " + distancia + " e gastando " + litrosUsados + " litros de combustível nessa viagem.");


    }

}
