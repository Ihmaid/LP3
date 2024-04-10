package br.com.primeiralistalp3.concessionaria;

import java.math.BigInteger;

public class Veículo {
    int contador, nSerie, nRodas;
    String tipoComb, marca, modelo, chassi, text;
    int ano;
    BigInteger proprietario = new BigInteger("0");
    
    Veículo(int nRodas, String tpComb, String marca, String modelo, int ano, String chassi){
        this.nRodas = nRodas;
        this.tipoComb = tpComb;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.chassi = chassi;
    }
    
    Veículo(int nRodas, String tpComb, String marca, String modelo, int ano){
        this.nRodas = nRodas;
        this.tipoComb = tpComb;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.chassi = "Não definido";
    }
    
    public void venda(Cliente p){
        this.proprietario = p.cpf;
        this.contador = 0;
        this.contador += 1;
        this.nSerie = contador - 1;
    }
    
    public String toString(){
        text = "VENDA DE CARRO CONCLUÍDA\n\nESPECIFICAÇÕES DO CARRO:\nNúmero de Rodas: "+this.nRodas+
                "\nTipo de Combustivel: "+this.tipoComb+"\nMarca: "+this.marca+"\nModelo: "+this.modelo+
                "\nAno: "+this.ano+"\nChassi: "+this.chassi+"\n\nCPF DO PROPRIETARIO: "+this.proprietario;
        return text;
    }
}
