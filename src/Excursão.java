import java.util.Scanner;

public class Excursão {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        String nome;
        int idade;

        System.out.printf("Digite o seu nome: ");
        nome = leia.nextLine();
        System.out.printf("Digite a sua idade: ");
        idade = leia.nextInt();

        if (idade >= 18) {
            System.out.println(nome + ", Você está autorizado a participar");
        }
        else {
            System.out.println(nome + " , Você precisa da autorização dos responsáveis para participar");
        }
    }
}
