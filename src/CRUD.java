import java.util.Scanner;

public class CRUD {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        int opcao;
        String nome = "";


        System.out.println("Para cadastrar digite 1");
        System.out.println("Para buscar digite 2");
        System.out.println("Para atualizar digite 3");
        System.out.println("Para apagar digite 4");
        System.out.println("Escolha uma das opçoes: ");
        opcao = leia.nextInt();
        nome = leia.nextLine();

        switch (opcao) {
            case 1 :
                System.out.println("Digite seu nome: ");
                nome = leia.nextLine();
                System.out.println("Cadastro realizado com sucesso, senhor : " + nome);
                break;
            case 2 :
                System.out.println("Buscando seu nome");
                nome = leia.nextLine();
                System.out.println("Seu nome é " + nome);
                break;
            case 3 :
                System.out.println("Atualize o nome: ");
               nome =  leia.nextLine();
                System.out.println("Seu cadastro foi atualizado, senhor : " + nome);
                break;
            case 4 :
                nome = "";
                System.out.println("Seu cadastro foi excluido.");
                break;

            default:
                System.out.println("Opção invalida");

        }

    }
}
