import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilaAtendimento {
    
    private List<String> atendimentoPreferencial = new ArrayList<String>();
    private List<String> atendimentoNormal = new ArrayList<String>();
    
    public void adicionarAtendimento(String nome, boolean preferencial) {
        if(preferencial) {
            atendimentoPreferencial.add(nome);
        } else {
            atendimentoNormal.add(nome);
        }
    }
    
    public void chamarProximoAtendimento() {
        if(!atendimentoPreferencial.isEmpty()) {
            System.out.println("Chamando próximo atendimento preferencial: " + atendimentoPreferencial.get(0));
            atendimentoPreferencial.remove(0);
        } else if(!atendimentoNormal.isEmpty()) {
            System.out.println("Chamando próximo atendimento normal: " + atendimentoNormal.get(0));
            atendimentoNormal.remove(0);
        } else {
            System.out.println("Não há pacientes na fila de atendimento.");
        }
    }
    
    public void listarAtendimentoPreferencial() {
        if(atendimentoPreferencial.isEmpty()) {
            System.out.println("Não há pacientes na fila de atendimento preferencial.");
        } else {
            System.out.println("Fila de atendimento preferencial:");
            for(String nome : atendimentoPreferencial) {
                System.out.println(nome);
            }
        }
    }
    
    public void listarAtendimentoNormal() {
        if(atendimentoNormal.isEmpty()) {
            System.out.println("Não há pacientes na fila de atendimento normal.");
        } else {
            System.out.println("Fila de atendimento normal:");
            for(String nome : atendimentoNormal) {
                System.out.println(nome);
            }
        }
    }
    
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        while(!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar atendimento");
            System.out.println("2 - Chamar próximo atendimento");
            System.out.println("3 - Listar fila de atendimento preferencial");
            System.out.println("4 - Listar fila de atendimento normal");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao) {
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
                    fila.listarAtendimentoNormal();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
