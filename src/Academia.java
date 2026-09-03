import java.util.Scanner;

public class Academia {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        int idade;
        System.out.printf("Digite sua idade: ");
        idade = leia.nextInt();
        if (idade >= 16){
            System.out.println("Matricula permitida");
        }
        else {
            System.out.println("Matricula não permitida");
        }
    }
}
