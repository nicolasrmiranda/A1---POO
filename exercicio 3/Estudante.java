package Avaliacao1_3_Studant;

import java.util.Scanner;

public class Estudante {
    Scanner sc = new Scanner(System.in);

    private float nota1;
    private float nota2;
    private float nota3;

    public Estudante(float n1, float n2, float nota3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = nota3;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float notaFinal() {
        float notaFinal;
        notaFinal = (nota1 + nota2 + nota3);
        return notaFinal;
    }
}
