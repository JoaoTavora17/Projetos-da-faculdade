import java.util.Scanner;

public class CadastrodeFuncionario {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        String nome;
        double salario;

        System.out.printf("Digite o nome do colaborador: ");
        nome = leia.nextLine();
        System.out.printf("Digite o salario do colaborador: ");
        salario = leia.nextDouble();

        if (salario >= 3000){
            System.out.println("Faixa salarial alta");

        }
        else {
            System.out.println("Faixa salarial Básica");

        }
    }
}
