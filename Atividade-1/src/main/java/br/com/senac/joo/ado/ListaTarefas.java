
import java.util.Scanner;

public class FilaAtendimento {

    private String[] atendimentoPreferencial = new String[10];
    private String[] atendimentoNormal = new String[10];
    private int posicaoPreferencial = 0;
    private int posicaoNormal = 0;

    public void adicionarAtendimento(String nome, boolean preferencial) {
        if (preferencial) {
            atendimentoPreferencial[posicaoPreferencial] = nome;
            posicaoPreferencial++;
        } else {
            atendimentoNormal[posicaoNormal] = nome;
            posicaoNormal++;
        }
    }

    public void chamarProximoAtendimento() {
        if (posicaoPreferencial > 0) {
            System.out.println("Chamando próximo atendimento preferencial: " + atendimentoPreferencial[0]);
            for (int i = 1; i < posicaoPreferencial; i++) {
                atendimentoPreferencial[i - 1] = atendimentoPreferencial[i];
            }
            posicaoPreferencial--;
        } else if (posicaoNormal > 0) {
            System.out.println("Chamando próximo atendimento normal: " + atendimentoNormal[0]);
            for (int i = 1; i < posicaoNormal; i++) {
                atendimentoNormal[i - 1] = atendimentoNormal[i];
            }
            posicaoNormal--;
        } else {
            System.out.println("Não há pacientes na fila de atendimento.");
        }
    }

    public void listarAtendimentoPreferencial() {
        if (posicaoPreferencial == 0) {
            System.out.println("Não há pacientes na fila de atendimento preferencial.");
        } else {
            System.out.println("Fila de atendimento preferencial:");
            for (int i = 0; i < posicaoPreferencial; i++) {
                System.out.println(atendimentoPreferencial[i]);
            }
        }
    }

    public void listarAtendimentoNormal() {
        if (posicaoNormal == 0) {
            System.out.println("Não há pacientes na fila de atendimento normal.");
        } else {
            System.out.println("Fila de atendimento normal:");
            for (int i = 0; i < posicaoNormal; i++) {
                System.out.println(atendimentoNormal[i]);
            }
        }
    }

    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar atendimento");
            System.out.println("2 - Chamar próximo atendimento");
            System.out.println("3 - Listar fila de atendimento preferencial");
            System.out.println("4 - Listar fila de atendimento normal");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do paciente:");
                    String nome = scanner.nextLine();
                    System.out.println("Atendimento preferencial? (s/n)");
                    boolean preferencial = scanner.nextLine().equalsIgnoreCase("s");
                    fila.adicionarAtendimento(nome, preferencial);
                    break;
                case 2:
                    fila.chamarProximoAtendimento();
                    break;
                case 3:
                    fila.listarAtendimentoPreferencial();
                    break;
                case 4:
                    fila.listarAtendimento
