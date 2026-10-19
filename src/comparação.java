import java.util.Scanner;
public class comparação {
    static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        double n1, n2;

        System.out.println("Informe um número: ");
        n1 = leia.nextDouble();
        System.out.println("Informe outro número: ");
        n2 = leia.nextDouble();
        if (n1 > n2){
            System.out.println(n1);
        }
        else if (n1<n2){
            System.out.println(n2);
        }
        else{
            System.out.println("Os números são iguais!");
        }

    }
}
