import java.util.Scanner;

public class Temperatura {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        float temperatura;

        System.out.printf("Qual a temperatura atual do ambiente? ");
        temperatura = leia.nextFloat();
        if (temperatura >= 28) {
            System.out.println("Ligar ar-condicionado");
        } else {
            System.out.println("Temperatura agradavel");
        }
    }
}
