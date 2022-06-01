package Avaliacao1_2_Elevador;

public class Elevador {

    public int capacidadeElevador;
    public int capacidadeAndar;
    private int pessoas;
    private int andar;

    public Elevador() {

    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getCapacidadeAndar() {
        return capacidadeAndar;
    }

    public void setCapacidadeAndar(int capacidadeAndar) {
        this.capacidadeAndar = capacidadeAndar;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void ElevadorNovo() {
        pessoas = 0;
        andar = 0;
    }

    public void entra() {
        if (pessoas == capacidadeElevador) {
            System.out.println("Chega! Elevador lotado, evite acidentes!");
        } else {
            pessoas++;
            System.out.println("Número de pessoas dentro do elevador: " + pessoas);
        }
    }

    public void removePessoa() {
        if (pessoas == 0) {
            System.out.println("Elevador vazio!");
        } else {
            pessoas--;
            System.out.println("Número de pessoas no elevador: " + pessoas);
        }
    }

    public void subir(int Andar) {
        if (Andar > capacidadeAndar || andar < 0) {
            System.out.println("Não há andar, tu vai parar em setealem.");
        } else {
            if (Andar < andar) {
                System.out.println("Selecionou subir mas tu vai descer, praga dos infernos");
            }
            if (Andar == 0) {
                System.out.println("Terreo.");
            } else if (Andar == capacidadeAndar) {
                System.out.println("Chegamos ao fim.");
            }
            andar = Andar;
            System.out.println("Andar atual: " + andar);
        }
    }

    public void descer(int Andar) {
        if (Andar > capacidadeAndar || andar < 0) {
            System.out.println("Não há andar, tu vai parar em setealem.");
        } else {
            if (Andar > andar) {
                System.out.println("Selecionou descer e agora tu vai subir, desisto");
            } else if (Andar == 0) {
                System.out.println("Terreo.");
            } else if (Andar == capacidadeAndar) {
                System.out.println("Chegamos ao último andar.");
            }
            andar = Andar;
            System.out.println("Andar atual: " + andar);
        }
    }

    
}