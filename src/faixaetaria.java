import java.util.Scanner;
public class faixaetaria {
    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        if (idade <= 14){
            System.out.println("Criança");
        }
        else if (idade > 14 && idade <= 18){
            System.out.println("Adolescente");
        }
        else if (idade > 18 && idade <= 50){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }

    }
}
