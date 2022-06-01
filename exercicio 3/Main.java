package Avaliacao1_3_Studant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;

        Estudante s1 = new Estudante(n1, n2, n3);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        //**********O QUE EU TENTEI *********/
        /* while (n1 < 0 || n1 > 30) {
            System.out.println(nome + ", digite a nota do primeiro trimestre: ");
            n1 = sc.nextFloat();
            if (n1 >= 31 || n1 < 0)
                System.out.println("Nota minima: 0 \nNota Maxima: 30 \nDigite novamente: ");
        }
        s1.setNota1(n1);

        while (n2 < 0 || n2 >= 35) {
            System.out.println(nome + ", digite a nota do segundo trimestre: ");
            n2 = sc.nextFloat();
            if (n2 >= 36 || n2 < 0)
                System.out.println("Nota minima: 0 \nNota Maxima: 35 \nDigite novamente: ");
        }
        s1.setNota2(n2);

        while (n3 < 0 || n3 > 35) {
            System.out.println(nome + ", digite a nota do terceiro trimestre: ");
            n3 = sc.nextFloat();
            if (n3 >= 36 || n3 < 0)
                System.out.println("Nota minima: 0 \nNota Maxima: 35 \nDigite novamente: ");
        }
        s1.setNota3(n3); */

        //*******pedi ajuda *********/
        do {
            System.out.println(nome + ", digite a nota do primeiro trimestre: ");
            n1 = sc.nextFloat();
            if (n1 >= 31 || n1 < 0) {
                System.out.println("Nota minima: 0 \nNota Maxima: 30 \nDigite novamente: ");
            }
        } while (n1 < 0 || n1 > 30);
        s1.setNota1(n1);

        do {
            System.out.println(nome + ", digite a nota do segundo trimestre: ");
            n2 = sc.nextFloat();
            if (n2 >= 36 || n2 < 0) {
                System.out.println("Nota minima: 0 \nNota Maxima: 35 \nDigite novamente: ");
            }
        } while (n2 < 0 || n2 > 35);
        s1.setNota2(n2);

        do {
            System.out.println(nome + ", digite a nota do terceiro trimestre: ");
            n3 = sc.nextFloat();
            if (n3 >= 36 || n3 < 0) {
                System.out.println("Nota minima: 0 \nNota Maxima: 35 \nDigite novamente: ");
            }
        } while (n3 < 0 || n3 > 35);
        s1.setNota3(n3);

        float notaFinal = s1.notaFinal();
        System.out.println("Nota final: " + notaFinal);

        if (notaFinal >= 60) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
            System.out.println("Faltaram" + (notaFinal - 60) * -1 + " para tua aprovacao.");
        }
        sc.close();
    }
}
