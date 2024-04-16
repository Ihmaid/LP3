package br.com.primeiralistalp3.lista3ex02;

public class Lista3Ex02 {

    public static void main(String[] args) {
        LampadaIncandescente lampada1 = new LampadaIncandescente(60, "Grande", "Incandescente");
        LampadaDeNatal lampada2 = new LampadaDeNatal(15, "Pequena", "LED", "Verde");
        System.out.println(lampada1);
        System.out.println(lampada2);
    }
}
