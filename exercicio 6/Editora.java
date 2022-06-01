package Avaliacao1_5_Informacao;

import java.util.ArrayList;

public class Editora {
    private ArrayList<Livro> livros;
    private long id;
    private String nome;
    private String email;
    private ArrayList<Editora> editoras;

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Editora> getEditoras() {
        return editoras;
    }

    public void setEditoras(ArrayList<Editora> editoras) {
        this.editoras = editoras;
    }

    public Editora() {
        livros = new ArrayList<Livro>();
        editoras = new ArrayList<Editora>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void armazenaEditoras(Editora e1) {
        this.editoras.add(e1);
    }

    public void armazenaLivro(Livro l1) {
        this.livros.add(l1);
    }

    public void imprimeLivros() {
        System.out.println(livros);
    }

    public void imprimeEditoras() {
        System.out.println(editoras);
    }

    public void verAutor(String Autor) {
        for (int i = 0; i < livros.size(); i++) {
            Livro l = livros.get(i);
            if (l.getAutor().equals(Autor)) {
                System.out.println(l);
            }
        }
    }

    public void verEditora(int index) {
        for (int i = 0; i < livros.size(); i++) {
            Livro l = livros.get(i);
            for (int j = 0; j < editoras.size(); j++) {
                Editora e = editoras.get(j);
                if (l.getIdEditora() == index) {
                    System.out.println(l);
                }
            }
        }
    }

    public void imprimeLivro(String livro) {
        for (int i = 0; i < livros.size(); i++) {
            Livro l = livros.get(i);
            if (l.getTitulo().equals(livro)) {
                System.out.println(l);
            }
        }
    }

    public void verPorAnos(int ano) {
        for (int i = 0; i < livros.size(); i++) {
            Livro l = livros.get(i);
            if (l.getAno() == (ano)) {
                System.out.println(l);
            }
        }
    }

    public void removeLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            Livro l = livros.get(i);
            if (l.getTitulo().equals(titulo)) {
                System.out.println(l.getTitulo() + " foi removido com sucesso!");
                livros.remove(l);
            }
        }
    }

    @Override
    public String toString() {
        return "\nEditora (" + ", nome = '" + getNome() + '\'' + ", email = '" + getEmail() + '\'' + "id = " + getId() + ')';
    }
}
