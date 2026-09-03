import java.util.Scanner;

public class Compras {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        int produtos;
        float valorUnitario, valorTotal;

        System.out.printf("Qual a quantidade de produtos? ");
        produtos = leia.nextInt();
        System.out.printf("Qual valor unitario dos produtos ?");
        valorUnitario = leia.nextFloat();
        valorTotal = produtos * valorUnitario;
        System.out.println("O Valor total da compra é: " + valorTotal);

        if (valorTotal > 100) {
            System.out.println("Voce ganhou frete gratis");
        } else {
            System.out.println("Frete não disponivel");
        }
    }
}
