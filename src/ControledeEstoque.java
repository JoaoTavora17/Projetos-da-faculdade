import java.util.Scanner;

public class ControledeEstoque {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        int quantidade;
        System.out.printf("Digite a quantidade atual do produto: ");
        quantidade = leia.nextInt();
        if (quantidade <10){
            System.out.println("Reposição necessária");

        }
        else {
            System.out.println("Estoque adequado");
        }
    }
}
