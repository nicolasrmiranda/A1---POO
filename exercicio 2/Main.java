package Avaliacao1_2_Elevador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevador e1 = new Elevador();
        int op = 0;
        
        while (op != 6) {
            System.out.println("\nMenu\n ");
            System.out.println("1 - Parâmetros programa");
            System.out.println("2 - Entrar");
            System.out.println("3 - Sair");
            System.out.println("4 - Subir andar");
            System.out.println("5 - Descer andar");
            System.out.println("6 - Sair\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    e1.ElevadorNovo();
                    System.out.println("Capacidade máxima de pessoas no elevador: ");
                    e1.setCapacidadeElevador(sc.nextInt());
                    System.out.println("Quantidade de andares do prédio: ");
                    e1.setCapacidadeAndar(sc.nextInt());
                    break;
                case 2:
                    e1.entra();
                break;
                case 3:
                    e1.removePessoa();
                break;
                case 4:
                    System.out.println("Para qual andar deseja subir?");
                    e1.subir(sc.nextInt());
                break;
                case 5:
                    System.out.println("Para qual andar deseja descer?");
                    e1.descer(sc.nextInt());
                break;
                case 6:
                    System.out.println("Programa finalizado.");
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        } 
        sc.close();
    }
}