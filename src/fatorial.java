import java.util.Scanner;

public class fatorial {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        long fatorial = 1;
        System.out.println("Digite um numero: ");
        numero = leia.nextInt();
        for (int i = numero; i > 1; i--){
            fatorial = fatorial *i;

        }
        System.out.println(fatorial);

    }
}
