import java.util.Scanner;

public class Classificaçãodenotas {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        float nota;

        System.out.printf("Digite sua nota: ");
        nota = leia.nextFloat();

        if (nota <= 100 && nota >= 90) {
            System.out.println("Excelente");
        } else if (nota < 90 && nota >= 70) {
            System.out.println("Bom");
        } else if (nota <70 && nota>=60) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }

    }
}
