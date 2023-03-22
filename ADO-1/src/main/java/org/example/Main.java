package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem vindo ao sitema de coleta de sangue");

        Laboratorio atendimento = new Laboratorio();
        boolean sair = false;

        while (!sair) {
            String escolha = JOptionPane.showInputDialog(null,
                    "Escolha uma opção:\n1 - Paciente novo\n2 - Chamar próximo da fila\n3 - Mostrar fila preferencial\n4 - Mostrar fila normal\n0 - Fechar laboratório");
            switch (escolha) {
                case "1":
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do paciente");
                    String preferencialInput = JOptionPane.showInputDialog(null, "Ele(a) é preferencial ? (s/n)");
                    boolean preferencial = preferencialInput.equalsIgnoreCase("s");
                    atendimento.adiciona(nome, preferencial);
                    break;
                case "2":
                    atendimento.proximo();
                    break;
                case "3":
                    atendimento.contemPreferencial();
                    break;
                case "4":
                    atendimento.contemNormal();
                    break;
                case "0":
                    sair = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

}