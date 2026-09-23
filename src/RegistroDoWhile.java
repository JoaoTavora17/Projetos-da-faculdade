import java.util.Scanner;

public class RegistroDoWhile {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("Você deseja registrar outro pedido?(S/N)");
            opcao = leia.nextLine();

        }
        while (opcao.equalsIgnoreCase("S"));

    }
}
