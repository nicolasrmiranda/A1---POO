package Avaliacao1_1_Agenda;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;

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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome + ", Idade: " + this.idade + ", Altura: " + this.altura + "\n";
    }
}
