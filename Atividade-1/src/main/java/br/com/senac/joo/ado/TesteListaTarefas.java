/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.joo.ado;

import java.util.Scanner;

public class TesteListaTarefas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTarefas lista = new ListaTarefas(10);

        int opcao = 0;
        do {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Exibir tarefas");
            System.out.println("0 - Sair");
            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    scanner.nextLine();
                    String tarefa = scanner.nextLine();
                    lista.adicionarTarefa(tarefa);
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = scanner.nextInt() - 1;
                    lista.removerTarefa(indice);
                    System.out.println("Tarefa removida com sucesso.");
                    break;
                case 3:
                    lista.exibirTarefas();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
