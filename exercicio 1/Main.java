package Avaliacao1_1_Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda a1 = new Agenda();
        int op = 0;
        int limite = 0;

        while(op != 6) {
            System.out.println("\nSelecione uma das opcoes: ");
            System.out.println("\n1 - Armazenar pessoa");
            System.out.println("2 - Buscar Posição Pessoa");
            System.out.println("3 - Imprime Agenda");
            System.out.println("4 - Imprime Pessoa");
            System.out.println("5 - Remove Pessoa");
            System.out.println("6 - Sair\n");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    if (limite < 10) {
                        Pessoa p1 = new Pessoa();
                        System.out.println("Nome: ");
                        sc.nextLine();
                        p1.setNome(sc.nextLine());

                        while (p1.getAltura() <= 0) {
                            System.out.println("Altura: ");
                            p1.setAltura(sc.nextFloat());

                            if (p1.getAltura() <= 0) {
                                System.out.println("Altura deve ser maior que 0");
                            }
                        }

                        while (p1.getIdade() <= 0) {
                            System.out.println("Idade: ");
                            p1.setIdade(sc.nextInt());
                            if (p1.getIdade() <= 0) {
                                System.out.println("Idade deve ser maior que 0");
                            }
                        }

                        a1.aPessoa(p1);
                        limite++;
                        System.out.println("Informações armazenadas com sucesso.");
                        } else {
                            System.out.println("Ops... A agenda está lotada!");
                        }
                break;
                case 2:
                    String pessoa;
                    System.out.println("Quem você deseja buscar? ");
                    sc.nextLine();
                    pessoa = sc.nextLine();
                    a1.bPessoa(pessoa);
                break;
                case 3:
                    if (a1.getAgenda().isEmpty()) {
                        System.out.println("Agenda vazia.");
                    } else {
                        System.out.println(a1);
                    }
                break;
                case 4:
                    int index;
                    System.out.println("Digite a posição da pessoa que deseja imprimir");
                    index = sc.nextInt();
                    a1.iPessoa(index);
                break;
                case 5:
                    String Pessoa;
                    System.out.println("Qual o nome da pessoa que deseja remover?");
                    sc.nextLine();
                    Pessoa = sc.nextLine();
                    a1.rPessoa(Pessoa);
                    System.out.println("Remoção realizada com sucesso.");
                    break;
                case 6:
                    System.out.println("Programa finalizado.");
                break;
            }
        }
        sc.close();
    }
}
