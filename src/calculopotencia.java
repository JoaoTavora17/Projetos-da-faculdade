import java.util.Scanner;

public class calculopotencia {
    public static int calculoQuadrado(int numero){
        return numero*numero;
    }

    static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        num = leia.nextInt();
        calculoQuadrado(num);
        System.out.println("O Quadrado do seu numero é: " + calculoQuadrado(num));

    }
}
