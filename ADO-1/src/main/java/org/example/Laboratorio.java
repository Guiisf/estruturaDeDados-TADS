package org.example;

public class Laboratorio {

    private String[] atdPreferencial = new String[10];
    private String[] atdNormal = new String[10];
    private int posPreferencial = 0;
    private int posNormal = 0;

    public void adiciona(String nome, boolean preferencial) {
        if (preferencial) {
            atdPreferencial[posPreferencial] = nome;
            posPreferencial++;
        } else atdNormal[posNormal] = nome;
        posNormal++;
    }

    public void proximo() {
        if (posPreferencial > 0) {
            System.out.println("Proximo na fila preferencial " + atdPreferencial[0]);
            for (int i = 1; i < posPreferencial; i++) {
                atdPreferencial[i - 1] = atdPreferencial[i];
            }
            posPreferencial--;
            System.out.println("Efetuando Atendimento.................");
            System.out.println("Paciente Preferencial foi atendido e ja saiu da fila");
        } else if (posNormal > 0) {
            System.out.println("Proximo da fila " + atdNormal[0]);

            for (int i = 1; i < posNormal; i++) {
                atdNormal[i - 1] = atdNormal[i];
            }
            posNormal--;
            System.out.println("Efetuando Atendimento.................");
            System.out.println("Paciente foi atendido e ja saiu da fila");
        } else {
            System.out.println("Não tem ninguem na fila, bora fechar ");
        }

    }

    public void contemPreferencial() {
        if (posPreferencial == 0) {
            System.out.println("Não tem pacientes preferencial");
        } else {
            System.out.println("Ainda tem essas pessoas na fila preferencial");
            for (int i = 0; i < posPreferencial; i++) {
                System.out.println(atdPreferencial[i]);
            }
        }
    }

    public void contemNormal() {
        if (posNormal == 0) {
            System.out.println("Não tem mais nenhum paciente, vamo bora");
        } else {
            System.out.println("Tem gente ainda, atende esses infelizes ai ");
            for (int i = 0; i < posNormal; i++) {
                System.out.println(atdNormal[i]);
            }
        }
    }


}
