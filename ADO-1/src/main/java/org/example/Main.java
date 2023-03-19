package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sitema de coleta de sangue");
        System.out.println("");
        Laboratorio atendimento = new Laboratorio();
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        while(!sair) {
            System.out.println("");
            System.out.println("Escolha um numero");
            System.out.println("1 - Pacinte novo");
            System.out.println("2 - Chamar proximo da fila");
            System.out.println("3 - Mostra fila preferencial");
            System.out.println("4 - Mostra fila normal");
            System.out.println("0 - Fechar laboratorio");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("Digite o nome do paciente");
                    String nome = sc.nextLine();
                    System.out.println("Ele(a) é preferencial ? (s/n)");
                    boolean preferencial = sc.nextLine().equalsIgnoreCase("s");
                    atendimento.adiciona(nome, preferencial);
                    break;
                case 2:
                    atendimento.proximo();
                    break;
                case 3:
                    atendimento.contemPreferencial();
                    break;
                case 4:
                    atendimento.contemNormal();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}