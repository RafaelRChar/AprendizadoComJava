package Desafio.Java.Alura.Aula.Modelos;

public class Audio {
    private String titulo;
    private int classificacao;
    private int totalDeReproducoes;
    private int totalCurtidas;


    public void curte(int curtidas){
        totalCurtidas = curtidas;
    }
    public void reproduzir(int reproducoes){
        totalDeReproducoes = reproducoes;
    }

    public void mostrarFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Total de curtidas: " + totalCurtidas);
        System.out.println("Total de reproduções: " + totalDeReproducoes);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }
}
