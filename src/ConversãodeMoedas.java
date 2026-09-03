import java.util.Scanner;

public class ConversãodeMoedas {
    public static final double dolar = 5.40;

    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        double reais, conversao;
        System.out.printf("Digite o valor em reais: ");
        reais = leia.nextDouble();
        conversao = reais/dolar;
        System.out.printf("Você tem: %.2f dolares%n ", conversao);

    }
}
