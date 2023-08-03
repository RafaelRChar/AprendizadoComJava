package Desafio.Java.Alura.Aula.Main;

import Desafio.Java.Alura.Aula.Modelos.Musicas;
import Desafio.Java.Alura.Aula.Modelos.Podcast;
import Desafio.Java.Alura.Aula.Processos.MusicasPreferidas;

public class Main {
    public static void main(String[] args) {
        System.out.println(" == Desafio Alura == ");
        //Para Setar os preferidos:
        MusicasPreferidas preferidas = new MusicasPreferidas();
        //Para testar as músicas;
        Musicas alone = new Musicas();
        System.out.println("//////////");
        alone.setAlbum("Album");
        alone.setTitulo("Titulo");
        alone.setGenero("Musical");
        alone.setArtista("Artistico");
        alone.curte(100);
        alone.reproduzir(200);
        alone.mostrarFichaTecnica();
        System.out.println("A classificação foi: " + alone.getClassificacao());
        preferidas.inclui(alone);
        System.out.println("//////////");
        Podcast cafezinho = new Podcast();
        cafezinho.setHost("Host sei lá");
        cafezinho.setDescricao("É alguém conversando com alguém, sei lá");
        cafezinho.setTitulo("Bem-vindo ao Café");
        cafezinho.curte(600);
        cafezinho.reproduzir(200);
        cafezinho.mostrarFichaTecnica();
        System.out.println("A classificação foi: " + cafezinho.getClassificacao());
        preferidas.inclui(cafezinho);
    }
}