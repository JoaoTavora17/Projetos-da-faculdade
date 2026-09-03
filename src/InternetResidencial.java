import java.util.Scanner;

public class InternetResidencial {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        int velocidade;
        System.out.println("Digite a velocidade da sua internet em mbps: ");
        velocidade = leia.nextInt();
        if (velocidade >= 100){
            System.out.println("Plano adequado para streaming!");
        }
        else {
            System.out.println("Considere aumentar o plano");
        }
    }
}
