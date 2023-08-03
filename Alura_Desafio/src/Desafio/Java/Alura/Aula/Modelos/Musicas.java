package Desafio.Java.Alura.Aula.Modelos;

public class Musicas extends Audio {
    private String album;
    private String artista;
    private String genero;

    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Álbum: " + album);
        System.out.println("Artista: " + artista);
        System.out.println("Gênero da Música: " + genero);
    }

    @Override
    public int getClassificacao() {
        if(getTotalDeReproducoes() > 500){
            return 10;
        } else {
            return 2;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
