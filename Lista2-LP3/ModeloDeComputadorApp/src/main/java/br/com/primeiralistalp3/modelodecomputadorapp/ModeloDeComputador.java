package br.com.primeiralistalp3.modelodecomputadorapp;

public class ModeloDeComputador{
    double valor = 0;
    String processador, ram, hd, monitor;
    
    public void adicionaProcessador(int x){
        switch(x){
            case 1:{
                processador = "Intel I7";
                this.valor += 500;
                break;
            }
            case 2:{
                processador = "Ryzen 5";
                this.valor += 450;
                break;
            }
        }   
    }
    public void adicionaRam(int x){
        switch(x){
            case 1:{
                ram = "8gb";
                this.valor += 150;
                break;
            }
            case 2:{
                ram = "16gb";
                this.valor += 250;
                break;
            }
        }   
    }
    public void adicionaHd(int x){
        switch(x){
            case 1:{
                hd = "500gb";
                this.valor += 150;
                break;
            }
            case 2:{
                hd = "1tb";
                this.valor += 250;
                break;
            }
        }   
    }
    public void desejaMonitor(int x, int modelo){
        if(x != 1){
            monitor = "Nenhum monitor selecionado";
        }else {
            switch(modelo){
                case 1 :{
                    monitor = "60hz";
                    this.valor += 450;
                    break;
                }
                case 2:{
                    monitor = "120hz";
                    this.valor += 1000;
                    break;
                }
            }
        }
    }

    
    @Override
    public String toString(){
        String text = "Processador: "+processador+"\nMemória Ram: "+ram+"\nHD: "+hd+"\nMonitor: "+monitor+"\nVALOR TOTAL DO PC: R$"+valor;
        return text;
    }
    
}
    