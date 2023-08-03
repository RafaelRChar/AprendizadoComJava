package Desafio.Java.Alura.Aula.Processos;

import Desafio.Java.Alura.Aula.Modelos.Audio;

public class MusicasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " Está nos preferidos!");
        } else {
            System.out.println(audio.getTitulo() + " é ótimo, Escute mais tarde!");
        }
    }
}
