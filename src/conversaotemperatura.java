import java.util.Scanner;

public class conversaotemperatura {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double celsius, fahrenheit;
        System.out.println("Informe a temperatura em graus celsius: ");
        celsius = leia.nextDouble();
        fahrenheit = (celsius*9/5)+32;
        System.out.println(fahrenheit + "ºF");

    }
}
