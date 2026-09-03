import java.util.Scanner;

public class ControledePresença {
    static void main(String[] args) {
        Scanner leia;
        leia = new Scanner(System.in);
        int aulas, faltas, presenca;
        System.out.printf("Digite a quantidade de aulas no semestre: ");
        aulas = leia.nextInt();
        System.out.printf("Digite a quantidade de faltas no semestre: ");
        faltas = leia.nextInt();
        presenca = ((aulas - faltas)*100)/aulas;


        if (presenca >= 75) {
            System.out.println("Frequência suficiente");
        }
        else {
            System.out.println("Frequência insuficiente");
        }


    }
}
