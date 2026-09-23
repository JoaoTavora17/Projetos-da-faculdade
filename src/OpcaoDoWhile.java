import java.util.Scanner;

public class OpcaoDoWhile {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1-Ver saldo");
            System.out.println("2-Fazer depósito");
            System.out.println("3-Sair");
            opcao = leia.nextInt();

        }
        while (opcao != 3);

    }
}
