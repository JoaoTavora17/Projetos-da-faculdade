import java.util.Scanner;

public class descontoRevisao {
    public static double valordesconto(double valorProduto) {
        double desconto = 0.15;
        return valorProduto * desconto;
    }
}

void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    double valorProduto,valorDesconto, valorTotal;
    System.out.println("Digite o valor do produto: ");
    valorProduto = leia.nextDouble();
    valorDesconto = descontoRevisao.valordesconto(valorProduto);
    valorTotal = valorProduto - valorDesconto;
    System.out.println("Valor do desconto: " + valorDesconto);
    System.out.println("Valor total a ser pago: " + valorTotal);


}