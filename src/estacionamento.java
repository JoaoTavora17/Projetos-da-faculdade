import java.util.Scanner;

public class estacionamento {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double horas;
        System.out.println("Informe quantas horas o veiculo permaneceu no estacionamento: ");
        horas = leia.nextDouble();
        if (horas <= 2) {
            System.out.println("O Valor é 10R$!");
        } else if (horas >= 2 && horas <=5) {
            System.out.println("O valor é 20R$!");
        }
        else {
            System.out.println("O Valor é 35R$!");

        }
    }

    }

