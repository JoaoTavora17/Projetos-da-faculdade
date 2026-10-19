import java.util.Scanner;

public class fundamentos {
    static void main() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = leia.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O numero digitado é: " + numero);
        System.out.println("O Sucessor é: " + sucessor);
        System.out.println("O antecessor é: " + antecessor);
    }
}
