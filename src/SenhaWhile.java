import java.util.Scanner;

public class SenhaWhile {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int senha = 0;
        while(senha != 2025) {
            System.out.println("Digite a senha: ");
            senha = leia.nextInt();
            if (senha != 2025) {
                System.out.println("Senha invalida");
            }
        }
            System.out.println("Acesso liberado");
        }
    }


