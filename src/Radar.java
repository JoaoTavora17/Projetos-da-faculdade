import java.util.Scanner;

public class Radar {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        double velocidade;

        System.out.println("Digite a velocidade registrada no radar: ");
        velocidade = leia.nextDouble();

        if (velocidade > 60){
            System.out.println("Acima da velocidade permitida");
        }
        else {
            System.out.println("Velocidade dentro do limite");
        }

    }
}
