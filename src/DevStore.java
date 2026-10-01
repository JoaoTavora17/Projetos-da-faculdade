import java.util.Scanner;

public class DevStore {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double precoUnitario;
        int quantidade;
        exibirCabecalho.Cabecalho();
        System.out.println("Digite o preço do produto:");
        precoUnitario = leia.nextDouble();
        System.out.println("Digite a quantidade de produtos: ");
        quantidade = leia.nextInt();
        double subtotal1 = produto1.subtotal1(precoUnitario, quantidade);
        double valorDesconto = calculoDesconto.desconto(subtotal1);
        double valorImposto = calculoImposto.valorReal(subtotal1, valorDesconto);
        double valorcomDesconto = calculoImposto.valorReal(subtotal1, valorDesconto);
        double valorTotal = calculoImposto.valorReal(subtotal1,valorDesconto);
        comprovante.Comprovante(subtotal1,valorDesconto, valorTotal, valorImposto);

    }
}