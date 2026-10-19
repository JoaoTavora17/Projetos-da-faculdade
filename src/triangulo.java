import java.util.Scanner;

public class triangulo {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.println("Informe o lado do triângulo: ");
        lado1 = leia.nextDouble();
        System.out.println("Informe o lado do triângulo: ");
        lado2 = leia.nextDouble();
        System.out.println("Informe o lado do triângulo: ");
        lado3 = leia.nextDouble();
        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Triângulo Equilátero");
        }
        else if (lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado3 != lado2){
            System.out.println("Triângulo Isósceles");
        }
        else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("Triângulo Escaleno");
        }

    }
}
