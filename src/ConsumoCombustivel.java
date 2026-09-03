import java.util.Scanner;

public class ConsumoCombustivel {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        double precodoCobumstivel,consumodoCarro, distanciaPercorrida, litros, custoTotal;


        System.out.printf("Qual a distancia percorrida na viagem? ");
        distanciaPercorrida = leia.nextDouble();
        System.out.printf("Qual o consumo do carro (km/l)? ");
        consumodoCarro = leia.nextDouble();
        System.out.printf("Qual valor do combustivel? ");
        precodoCobumstivel = leia.nextDouble();
         litros = distanciaPercorrida / consumodoCarro;
         custoTotal = litros * precodoCobumstivel;
        System.out.println("Você gastou " + custoTotal + " reais, para realizar essa viagem");

    }
}
