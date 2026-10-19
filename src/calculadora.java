import java.util.Scanner;

public class calculadora {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double num1, num2, resultado;
        int opcao;

        System.out.println("Digite um número: ");
        num1 = leia.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = leia.nextDouble();
        System.out.println("Qual operação matematica deseja fazer? ");
        System.out.println("1-SOMAR");
        System.out.println("2-SUBTRAIR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        opcao = leia.nextInt();

        switch (opcao){
            case 1 :
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case 4:
                resultado = num1/num2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Opção invalida!");

        }

    }
}
