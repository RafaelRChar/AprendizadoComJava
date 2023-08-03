package Desafio.Java.Alura.Aula.Modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Host do programa: " + host);
        System.out.println("Descrição: " + descricao);
    }

    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 2;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
