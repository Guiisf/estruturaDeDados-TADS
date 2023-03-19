package com.mycompany.arranjos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.print.attribute.standard.Media;

/**
 *
 * @author Guilherme Ferreira
 */
public class Arranjos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double vetor[] = new double[7];
        double soma = 0;
        double media = 0;

        System.out.println("Digite 7 numeros");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();

        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        
        media = soma/vetor.length;
        
        System.out.println(media);
        
        

//        
    }
}
