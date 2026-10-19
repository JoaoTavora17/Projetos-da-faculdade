import java.util.Scanner;

public class revisaofor {
    static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        int contaPar = 0;
        int contaImpar = 0;
        int numero;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escreva um numero inteiro: ");
            numero = leia.nextInt();
            if (numero%2==0){
                contaPar++;
            }
            else {
                contaImpar++;
            }

        }
        System.out.println("Quantidade de numeros pares: " + contaPar);
        System.out.println("Quantidade de numeros impares: " + contaImpar);

    }
}
