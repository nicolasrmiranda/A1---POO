package Avaliacao1_4_Artistas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sistema s1 = new Sistema();

        int op = 0;

        while (op != 6) {
            System.out.println("\n\n*******MEKA MOB RECORDS*******");
            System.out.println("\n1 - Registrar artista na gravadora");
            System.out.println("2 - Ver todos artistas");
            System.out.println("3 - Buscar vulgo do artista");
            System.out.println("4 - Número de artistas na gravadora");
            System.out.println("5 - Apagar todos artistas");
            System.out.println("6 - Sair\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Artistas a1 = new Artistas();
                    System.out.println("Digite o vulgo do artista: ");
                    sc.nextLine();
                    a1.setNome(sc.nextLine());
                    System.out.println("Digite o genero musical do artista: ");
                    a1.setGenero(sc.nextLine());
                    System.out.println("Digite a quantidade de álbuns que o artista possui: ");
                    a1.setAlbuns(sc.nextInt());
                    s1.armazenarArtista(a1);
                break;
                case 2:
                    if (s1.getArtista().isEmpty()) {
                        System.out.println("Falimos...");
                    } else {
                        s1.verTodosArtistas();
                    }
                break;
                case 3:
                    if (s1.getArtista().isEmpty()) {
                        System.out.println("Não há ninguém aqui com esse nome");
                        System.out.println("\nQuem te falar que o miu é da 30 vai levar um tiro na perna..."); 
                    } else {
                        String nome;
                        System.out.println("Digite o vulgo do artista que deseja buscar: ");
                        sc.nextLine();
                        nome = sc.nextLine();
                        s1.buscarArtista(nome);
                    }
                break;
                case 4:
                    if (s1.getArtista().isEmpty()) {
                        System.out.println("Falimos...");
                    } else {
                        s1.quantidadeArtistas();
                    }
                break;
                case 5:
                    if (s1.getArtista().isEmpty()) {
                        System.out.println("Falimos...");
                    } else {
                        System.out.println("Cabo dinheiro, tchau gurizada");
                        s1.apagarArtistas();
                        break;
                    }
                break;
                case 6:
                    System.out.println("ate amanha fio...");
                break;
                default:
                    System.out.println("\nOpcao invalida");
                break;
            }

        }
        sc.close();
    }
}
