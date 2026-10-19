import java.util.Scanner;

public class tabuada {
    static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            int num,calculo;
        System.out.println("Digite um numero: ");
        num = leia.nextInt();
        for (int i = 1; i <= 10; i++){
            calculo = num * i;
            System.out.println(calculo);

        }


    }
}
