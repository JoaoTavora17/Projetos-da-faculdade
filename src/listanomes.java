import java.util.ArrayList;
import java.util.Scanner;

public class listanomes {
    public static void main(String[] args) {
        String[] nome = new String[5];
        Scanner leia = new Scanner(System.in);


        for (int i = 0; i < 5; i++){
            System.out.println("Digite um nome: ");
           nome[i] = leia.nextLine();
        }
        System.out.println("Nomes cadastrados : ");
        for (int i = 0; i <5; i++){
            System.out.println("Nome " + i + ": " + nome[i]);
        }

    }
}
