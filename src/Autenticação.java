import java.util.Scanner;

public class Autenticação {
    public static final int senha = 123;
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        int senhaDigitada;
        System.out.printf("Digite sua senha: ");
        senhaDigitada = leia.nextInt();

        if (senhaDigitada == senha) {
            System.out.println("Acesso permitido");
        }
        else {
            System.out.println("Acesso negado");
        }

    }
}
