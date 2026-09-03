import java.util.Scanner;

public class AluguelBicicletas {
public static final double valorHora = 8.00;

    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        String nome;
        double horasUtilizadas, total;
        System.out.printf("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.printf("Digite a quantidade de horas utilizadas: ");
        horasUtilizadas = leia.nextDouble();
        total = horasUtilizadas*valorHora;
        if (total > 50){
            System.out.println("Nome do cliente: " + nome);
            System.out.println("Valor do aluguel: " + total + "R$");
            System.out.println("Cliente Premium");

        }
        else {
            System.out.println("Nome do cliente: " + nome);
            System.out.println("Valor do aluguel: " + total + "R$");
            System.out.println("Cliente comum");
        }



    }
}
