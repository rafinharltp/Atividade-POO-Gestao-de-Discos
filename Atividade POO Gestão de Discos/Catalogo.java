import java.util.*;

class Catalogo {
    private List<Disco> discos = new ArrayList<>();
    private List<Artista> artistas = new ArrayList<>();

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }

    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco cadastrado.");
        } else {
            for (Disco disco : discos) {
                System.out.println(disco);
            }
        }
    }

    public void removerDisco(String titulo) {
        discos.removeIf(disco -> disco.getTitulo().equalsIgnoreCase(titulo));
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void listarArtistas() {
        if (artistas.isEmpty()) {
            System.out.println("Nenhum artista cadastrado.");
        } else {
            for (Artista artista : artistas) {
                System.out.println(artista);
            }
        }
    }

    public Artista buscarArtista(String nome) {
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nome)) {
                return artista;
            }
        }
        return null;
    }
}