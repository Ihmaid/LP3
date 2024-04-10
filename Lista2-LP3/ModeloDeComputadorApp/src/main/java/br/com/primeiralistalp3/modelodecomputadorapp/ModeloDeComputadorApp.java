package br.com.primeiralistalp3.modelodecomputadorapp;

import java.util.Scanner;
        
public class ModeloDeComputadorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        int index = 0, aux = 0;
        
        ModeloDeComputador computador = new ModeloDeComputador();
        
        System.out.println("Qual o processador?\n1- Intel I7\n2- Ryzen 5");
        index = in.nextInt();
        computador.adicionaProcessador(index);
        
        System.out.println("Qual a memória RAM?\n1- 8gb\n2- 16gb");
        index = in.nextInt();
        computador.adicionaRam(index);
        
        System.out.println("Qual o HD?\n1- 500gb\n2- 1tb");
        index = in.nextInt();
        computador.adicionaHd(index);
        
        System.out.println("Deseja monitor?\n1- Sim\n2- Não ");
        aux = in.nextInt();
        if(aux == 1){
            System.out.println("Qual o monitor?\n1- 60hz\n2- 120hz");
            index = in.nextInt();
            computador.desejaMonitor(aux, index);
        }
        
        
        
        System.out.println(computador);
        }
    //APENAS [E NECESSARIO REPETIR O QUE JA FOI FEITO COM O PROCESSADOR PARA CADA COMPONENTE
        
    }

