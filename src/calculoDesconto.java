import java.util.Scanner;

public class calculoDesconto {
    public static double desconto(double subtotal1) {
        Scanner leia = new Scanner(System.in);
        final double vip = 0.10;
        final double funcionario = 0.15;
        final double comum = 0;
        double valorDesconto = 0.0;
        int opcao;

        System.out.println("Qual tipo do cliente?");
        System.out.println("1-Cliente comum.");
        System.out.println("2-Cliente VIP");
        System.out.println("3-Funcionario");
        opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                valorDesconto = subtotal1 * comum;
                break;
            case 2:
                valorDesconto =  subtotal1 * vip;
                break;
            case 3:
                valorDesconto = subtotal1 * funcionario;
                break;
            default:
                System.out.println("Opção Invalida, nenhum desconto aplicado.");
                break;
        }
            return valorDesconto;

        }

    }


