import java.util.*;

class Disco {
    private String titulo;
    private int anoLancamento;
    private List<String> faixas;
    private Artista artista;

    public Disco(String titulo, int anoLancamento, Artista artista, List<String> faixas) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
        this.faixas = faixas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    public void setFaixas(List<String> faixas) {
        this.faixas = faixas;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Disco [Título=" + titulo
                + ", Ano=" + anoLancamento
                + ", Artista=" + artista.getNome()
                + ", Faixas=" + faixas + "]";
    }
}
