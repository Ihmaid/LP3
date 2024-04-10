package br.com.primeiralistalp3.lampadaapp;

import java.util.Scanner;

public class LampadaApp {

 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        boolean ligada = false;
        String watts = "", tipo = "", tamanho = "";
        int index = 0;
        System.out.println("A lampada está ligada?\n1- sim/2- nao");
        
        index = scan.nextInt();
        
        if(index == 1){
            ligada = true;
        }else if(index == 2){
            ligada = false;
        }else{
            System.out.println("Resposta não permitida");
        }
        
        Lampada lampada = new Lampada(ligada, 65, "LED", "Grande");
        
        Lampada lampada2 = new Lampada(ligada, "Incandescente", "Pequena");
        
        System.out.println(lampada2.toString());
        
        
    }
}

