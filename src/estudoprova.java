import java.util.Scanner;

public class estudoprova {

    // 1. FUNÇÃO: Cadastrar Veículo (Retorna o novo total de veículos)
    public static int cadastrarVeiculo(int[] id_veiculo, String[] placa, String[] modelo, int total, Scanner teclado) {
        if (total < 100) {
            id_veiculo[total] = total + 1; // ID automático

            System.out.print("Placa: ");
            placa[total] = teclado.nextLine();
            System.out.print("Modelo: ");
            modelo[total] = teclado.nextLine();

            total++; // Incrementa o contador
            System.out.println("Veículo cadastrado!\n");
        } else {
            System.out.println("Estacionamento cheio!\n");
        }
        return total; // Retorna o total atualizado para a main
    }

    // 2. FUNÇÃO: Registrar Entrada (Retorna o novo total de entradas)
    public static int registrarEntrada(int[] id_veiculo, int total_v, int[] id_entrada, int[] ent_id_veiculo, String[] data_ent, int total_e, Scanner teclado) {
        System.out.print("Digite o ID do veículo: ");
        int idBusca = teclado.nextInt();
        teclado.nextLine(); // Limpa buffer

        // Validação usando INT em vez de BOOLEAN (0 = falso, 1 = verdadeiro)
        int existe = 0;
        for (int i = 0; i < total_v; i++) {
            if (id_veiculo[i] == idBusca) {
                existe = 1;
            }
        }

        if (existe == 1) {
            id_entrada[total_e] = total_e + 1;
            ent_id_veiculo[total_e] = idBusca;

            System.out.print("Data/Hora Entrada: ");
            data_ent[total_e] = teclado.nextLine();

            total_e++;
            System.out.println("Entrada registrada!\n");
        } else {
            System.out.println("Erro: Veículo não cadastrado!\n");
        }
        return total_e;
    }

    // 3. FUNÇÃO COM RETORNO: Calcular Valor
    public static double calcularValor() {
        return 15.00; // Preço único fixo
    }

    // 4. FUNÇÃO: Registrar Saída (Retorna o novo total de saídas)
    public static int registrarSaida(int[] id_entrada, int total_e, int[] id_saida, int[] sai_id_entrada, String[] data_sai, double[] valor, int total_s, Scanner teclado) {
        System.out.print("Digite o ID da Entrada: ");
        int idEntradaBusca = teclado.nextInt();
        teclado.nextLine(); // Limpa buffer

        int existe = 0;
        for (int i = 0; i < total_e; i++) {
            if (id_entrada[i] == idEntradaBusca) {
                existe = 1;
            }
        }

        if (existe == 1) {
            id_saida[total_s] = total_s + 1;
            sai_id_entrada[total_s] = idEntradaBusca;

            System.out.print("Data/Hora Saída: ");
            data_sai[total_s] = teclado.nextLine();

            // Chamada da função modular de cálculo
            valor[total_s] = calcularValor();

            System.out.println("Saída realizada! Valor: R$ " + valor[total_s] + "\n");
            total_s++;
        } else {
            System.out.println("Erro: Entrada não encontrada!\n");
        }
        return total_s;
    }

    // METODO PRINCIPAL
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // ARRAYS DECLARADOS DENTRO DA MAIN
        int[] id_veiculo = new int[100];
        String[] placa = new String[100];
        String[] modelo = new String[100];
        int total_veiculos = 0;

        int[] id_entrada = new int[100];
        int[] ent_id_veiculo = new int[100];
        String[] data_entrada = new String[100];
        int total_entradas = 0;

        int[] id_saida = new int[100];
        int[] sai_id_entrada = new int[100];
        String[] data_saida = new String[100];
        double[] valor_pago = new double[100];
        int total_saidas = 0;

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1-Cadastrar 2-Entrada 3-Saída 0-Sair");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer

            if (opcao == 1) {
                // Passa os vetores e atualiza o contador com o retorno da função
                total_veiculos = cadastrarVeiculo(id_veiculo, placa, modelo, total_veiculos, teclado);
            } else if (opcao == 2) {
                total_entradas = registrarEntrada(id_veiculo, total_veiculos, id_entrada, ent_id_veiculo, data_entrada, total_entradas, teclado);
            } else if (opcao == 3) {
                total_saidas = registrarSaida(id_entrada, total_entradas, id_saida, sai_id_entrada, data_saida, valor_pago, total_saidas, teclado);
            }
        }
        System.out.println("Fim do programa.");
    }
}