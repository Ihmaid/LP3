package br.com.primeiralistalp3.lista3ex02;

public class LampadaIncandescente implements Lampada {
    int potencia;
    String tamanho;
    String tipo;
    
    LampadaIncandescente(int p, String t, String tp){
        potencia = p;
        tamanho = t;
        tipo = tp;
    }
    
    public int potencia(){
        return potencia;
    }

    public String tamanho(){
        return tamanho;
    }

    public String tipo(){
        return tipo;
    }
   
    public String toString(){
        String texto ="A lampada eh Incandescente\nPotencia: "+this.potencia+"\nTamanho: "
                +this.tamanho+"\nTipo: "+this.tipo+"\n";
        return texto;
    }
}
