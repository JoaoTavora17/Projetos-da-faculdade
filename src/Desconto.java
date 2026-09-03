import java.util.Scanner;

public class Desconto {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        float valordaCompra, desconto;
        System.out.printf("Digite o valor da compra: ");
        valordaCompra = leia.nextFloat();
        desconto = valordaCompra * 0.90f;
        if (valordaCompra > 200) {
            System.out.println("Valor com desconto: " + desconto + " reais");
        } else {
            System.out.println("Valor insuficiente para aplicar desconto");

        }
    }
}
