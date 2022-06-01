package Avaliacao1_1_Agenda;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> agenda;

    public Agenda() {
        agenda = new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getAgenda() {
        return agenda;
    }

    @Override
    public String toString() {
        return "Agenda: " + agenda;
    }

    //aPessoa = armazena pessoa
    public void aPessoa(Pessoa p1) {
        this.agenda.add(p1);
    }

    //rPessoa = remove pessoa
    public void rPessoa(String nome) {
        for (int i = 0; i < agenda.size(); i++) {
            Pessoa p = agenda.get(i);
            if (p.getNome().equals(nome)) {
                agenda.remove(p);
            }
        }
    }

    //bPessoa = busca pessoa
    public void bPessoa(String nome) { 
        for (int i = 0; i < agenda.size(); i++) {
            Pessoa p = agenda.get(i);
            if (p.getNome().equals(nome)) {
                System.out.println(nome + " está na posição: " + i);
            }
        }
    }

    //iPessoa = imprime pessoa
    public void iPessoa(int index) {
        Pessoa p = agenda.get(index);
        System.out.println(p);
    }

}
