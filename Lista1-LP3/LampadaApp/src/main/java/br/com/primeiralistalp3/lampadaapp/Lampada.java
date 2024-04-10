package br.com.primeiralistalp3.lampadaapp;


public class Lampada {
      private String tipo, tamanho;
      private int watts;
    //construtor que recebe boolean para gerar a classe
    public Lampada(boolean ligada, int w, String t, String tm){
        int watts = w;
        String tipo = t;
        String tamanho = tm; 
    }
    
    public Lampada(boolean ligada, String t, String tm){
        int watts = 60;
        String tipo = t;
        String tamanho = tm;
        
    }
    
    public String toString(){
        String texto = "Watts: " + watts + "\nTipo: " + tipo + "\nTamanho: " + tamanho;
        return texto;
    }
    
    //construtor que recebe watts da lampada
    
    //construtor que coloca 60 watts como default, caso n seja especificado
}

