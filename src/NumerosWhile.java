import java.util.Scanner;

public class NumerosWhile {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = 1;
       while(opcao != 0) {
           System.out.println("Escolha um número inteiro: ");
           opcao = leia.nextInt();
       }
        System.out.println("Programa encerrado.");
    }
}
