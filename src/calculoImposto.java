public class calculoImposto {
    public static double valorReal(double subtotal1, double valorDesconto){
        final double imposto = 0.05;
         double valorcomDesconto = subtotal1 - valorDesconto;
         double valorImposto = subtotal1 * imposto;
         double valorTotal = valorcomDesconto + (valorcomDesconto * imposto);
         return valorTotal;
    }
}
