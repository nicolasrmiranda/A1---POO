package Avaliacao1_4_Artistas;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Artistas> artista;

    public Sistema() {
        artista = new ArrayList<Artistas>();
    }

    public ArrayList<Artistas> getArtista() {
        return artista;
    }

    public void setArtista(ArrayList<Artistas> artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Sistema (" + "artista=" + artista + ')';
    }

    public void armazenarArtista(Artistas a1) {
        this.artista.add(a1);
    }

    public void buscarArtista(String nome) {
        for (int i = 0; i < artista.size(); i++) {
            Artistas a = artista.get(i);
            if (a.getNome().equals(nome)) {
                System.out.println(a);
            }
        }
    }

    public void quantidadeArtistas() {
        System.out.println("Quantidade de artistas na gravadora: " + artista.size());
    }

    public void verTodosArtistas() {
        for (int i = 0; i < artista.size(); i++) {
            Artistas a = artista.get(i);
            System.out.println("Artista: " + a.getNome());
            System.out.println("Genero musical: " + a.getGenero());
            System.out.println("Quantidade de álbuns lançados: " + a.getAlbuns());
        }
    }

    public void apagarArtistas() {
        artista.removeAll(artista);
    }
}
