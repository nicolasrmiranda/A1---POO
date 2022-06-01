package Avaliacao1_6_Cadastro;

public class Pessoa {
    private String nome;
    private int idade;
    private char genero;
    private Endereco end;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public Pessoa(String nome, int idade, char genero, Endereco end) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.end = end;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Pessoa (" + "nome = " + nome + ", idade = " + idade + ", sexo = " + genero + ", end = " + end + ')';
    }
}
