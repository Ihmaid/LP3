package br.com.primeiralistalp3.numerocomplexoapp;

public class NumeroComplexo {
    String numCom;
    
    //inicializaNumero -> recebe a parte real e imaginária 
    public void inicializaNum(int real, int imag){
        numCom = real+"+"+imag+"i";
    }
    
    //imprimeNumero -> imprime o num complexo a + bi
    public String imprimeNum(){
        return numCom;
    }

    //éIgual -> recebe uma instancia de NumeroComplexo com outras partes reais e imaginaria e verifica 
        // se é igual
    /*
    public String eIgual(NumeroComplexo numero1, NumeroComplexo numero2){
        if(numero1.real == numero2.real)&&(numero1.imag == numero2.imag){
     
    Como eu faco para o metodo receber uma nova instancia da mesma classe, para usar da forma acima?
    */
    
    }
    


