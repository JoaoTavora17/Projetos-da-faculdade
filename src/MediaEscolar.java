import java.util.Scanner;

public class MediaEscolar {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        int nota1, nota2, media;
        System.out.println("Digite sua primeira nota: ");
        nota1 = leia.nextInt();
        System.out.println("Digite sua segunda nota: ");
        nota2 = leia.nextInt();
        media = (nota1 + nota2)/2;

        if (media >= 60) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");

        }

    }
}
