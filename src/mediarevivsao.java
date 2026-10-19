import java.util.Scanner;

public class mediarevivsao {
    public static double media(double nota1, double nota2, double nota3){
        return (nota1+nota2+nota3)/3;
    }

    static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1, n2, n3, resultado;
        System.out.println("Digite a primeira nota do aluno: ");
            n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
         n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        n3 = leia.nextDouble();
        resultado = mediarevivsao.media(n1, n2, n3);
        if (resultado >= 60){
            System.out.println("APROVADO! " + resultado + " pontos");
        }
        else {
            System.out.println("REPROVADO! " + resultado + " pontos");
        }
        }
    }
