import java.util.Scanner;

public class PedidodeLanches {
    public static final double valorUnitario = 20.50;
    public static final double desconto = 0.05;
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        String nome;
        double valorTotal,valorDesconto;
        int hamburguer;

        System.out.printf("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.print("Digite a quantidade de hamburguer desejada: ");
        hamburguer = leia.nextInt();
        valorTotal = hamburguer * valorUnitario;

        if (valorTotal > 50){
            valorDesconto = valorTotal * desconto;
            valorTotal = valorTotal - (valorTotal*desconto);
            System.out.println(nome + ", seu desconto é de: " + valorDesconto);

            System.out.println(nome + " , o valor da sua compra agora é:" + valorTotal);
        }
        else {
            System.out.println(nome + " , o valor da compra é: " + valorTotal);
        }


    }
}
