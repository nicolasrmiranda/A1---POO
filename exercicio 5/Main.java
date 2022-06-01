package Avaliacao1_6_Cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        char resposta;

        Pessoa p1 = new Pessoa();
        Endereco e1 = new Endereco();

        System.out.println("Digite o nome: ");
        p1.setNome(sc.nextLine());

        while (p1.getIdade() <= 0) {
            System.out.println("Digite a idade: ");
            p1.setIdade(sc.nextInt());
            if (p1.getIdade() <= 0) {
                System.out.println("Idade inválida. Digite uma idade válida.");
            }
        }

        while (p1.getGenero() != 'M' && p1.getGenero() != 'm' && p1.getGenero() != 'F' && p1.getGenero() != 'f') {
            System.out.println("Digite o genero (M/F): ");
            p1.setGenero(sc.next().charAt(0));
            if (p1.getGenero() != 'M' && p1.getGenero() != 'F') {
                System.out.println("Digite um genero valido: ");
            }
        }

        System.out.println("\nDigite o endereço: ");
        e1.setLogradouro(scString.nextLine());
        System.out.println("Endereço possui algum tipo de complemento? (S/N)");
        resposta = scString.nextLine().charAt(0);

        if (resposta == 'S' || resposta == 's') {
            System.out.println("Digite o complemento: ");
            e1.setComplemento(scString.nextLine());
        } else {
            e1.setComplemento("");
        }

        System.out.println("Digite o numero do endereço: ");
        e1.setNumero(sc.nextInt());
        System.out.println("Digite o CEP: ");
        e1.setCep(scString.nextLine());
        p1.setEnd(e1);
        System.out.println("\n Informações obtidas: \n" + p1);

        sc.close();
        scString.close();
    }
}
