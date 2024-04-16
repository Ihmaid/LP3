package br.com.primeiralistalp3.lista3ex02;
import java.util.Scanner;

public class LampadaDeNatal implements Lampada, Cor {
    Scanner scan = new Scanner(System.in);
    int potencia;
    String tamanho;
    String tipo;
    static String cor;

    LampadaDeNatal(int p, String t, String tp, String c){
        potencia = p;
        tamanho = t;
        tipo = tp;
        cor = c;
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
    
    public static void escolhaCor(){
        switch(cor){
            case "Azul": cor = AZUL; break;
            case "Verde": cor = VERDE; break;
            case "Vermelho": cor = VERMELHO; break;
        }
    }
   
    public String toString(){
        String texto ="A lampada eh de Natal\nPotencia: "+this.potencia+"\nTamanho: "
                +this.tamanho+"\nTipo: "+this.tipo+"\nCor: "+this.cor+"\n";
        return texto;
    }
}
