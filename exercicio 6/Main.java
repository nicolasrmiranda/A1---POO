package Avaliacao1_5_Informacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Editora e1 = new Editora();

        int op = 0;

        while (op != 9) {
            System.out.println("\nLIVRARIA CULTURA (ANTES DE FALIR)!\n ");
            System.out.println("Selecione uma opcao:");
            System.out.println("1 - Registrar editora");
            System.out.println("2 - Registrar novo livro");
            System.out.println("3 - Visualizar todos livros");
            System.out.println("4 - Visualizar livro por editora");
            System.out.println("5 - Visualizar livros por autor ");
            System.out.println("6 - Visualizar livro por ano que foi lancado");
            System.out.println("7 - Procurar livro por titulo");
            System.out.println("8 - Remover um livro");
            System.out.println("9 - Sair\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Editora e2 = new Editora();
                    System.out.println("Digite o nome da editora: ");
                    sc.nextLine();
                    e2.setNome(sc.nextLine());
                    System.out.println("Digite o email da editora: ");
                    e2.setEmail(sc.nextLine());
                    System.out.println("Digite o codigo da editora");
                    e2.setId(sc.nextLong());
                    e1.armazenaEditoras(e2);
                break;
                case 2:
                    Livro l1 = new Livro();
                    System.out.println("Digite o titulo do livro: ");
                    sc.nextLine();
                    l1.setTitulo(sc.nextLine());
                    System.out.println("Digite o autor do livro: ");
                    l1.setAutor(sc.nextLine());
                    System.out.println("Digite o ano que o livro foi publicado: ");
                    l1.setAno(sc.nextInt());
                    System.out.println("Digite o codigo da editora do livro: ");
                    l1.setIdEditora(sc.nextInt());
                    e1.armazenaLivro(l1);
                break;
                case 3:
                    e1.imprimeLivros();
                break;
                case 4:
                    int editora;
                    System.out.println("Editoras: ");
                    e1.imprimeEditoras();
                    System.out.println("\nDigite o codigo da editora: ");
                    editora = sc.nextInt();
                    e1.verEditora(editora);
                break;
                case 5:
                    String Autor;
                    System.out.println("Digite o nome do autor do livro: ");
                    sc.nextLine();
                    Autor = sc.nextLine();
                    e1.verAutor(Autor);
                break;
                case 6:
                    System.out.println("Digite o ano em que o livro foi lançado: ");
                    e1.verPorAnos(sc.nextInt());
                break;
                case 7:
                    String titulo;
                    System.out.println("Digite o nome do livro: ");
                    sc.nextLine();
                    titulo = sc.nextLine();
                    e1.imprimeLivro(titulo);
                break;
                case 8:
                    String title;
                    System.out.println("Digite o nome do livro: ");
                    sc.nextLine();
                    title = sc.nextLine();
                    e1.removeLivro(title);
                break;
                case 9:
                    System.out.println("Programa finalizado.");
                break;
                default:
                    System.out.println("Ops... Opcao invalida.");
                break;
            }
        } 
        sc.close();
    }
}
