/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.senac.projeto_temperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme Ferreira
 */
public class Projeto_temperatura {

    public static void main(String[] args) {

        double[] temperatura = new double[7];
        double soma, media;

        int contador, dias_acima, dias_abaixo;
        soma = 0;
        for (contador = 0; contador < 7; contador++) {
            temperatura[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (contador + 1) + "º temperatura: "));
            soma = soma + temperatura[contador];
        }

        media = soma / 7;
        dias_acima = 0;
        dias_abaixo = 0;

        for (contador = 0; contador < 7; contador++) {
            if (temperatura[contador] > media) {
                dias_acima += 1;

            }
            if (temperatura[contador] < media) {
                dias_abaixo += 1;
            }

        }

        JOptionPane.showMessageDialog(null, "A media das temperaturas é " + media);
        JOptionPane.showMessageDialog(null, "A quantidade de dias acima da media é " + dias_acima);
        JOptionPane.showMessageDialog(null, "A quantidade de dias abaixo da media é " + dias_abaixo);

    }
}
