import java.util.Scanner;

public class ContadeEnergia {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        double consumo, valor, valorTotal;
        System.out.printf("Digite o consumo em kwh: ");
        consumo = leia.nextDouble();
        System.out.printf("Digite o valor do kwh: ");
        valor = leia.nextDouble();
        valorTotal = consumo * valor;

        if (valorTotal > 300) {
            System.out.println("Consumo elevado");
        }
        else {
            System.out.println("Consumo dentro do esperado");
        }

    }
}
