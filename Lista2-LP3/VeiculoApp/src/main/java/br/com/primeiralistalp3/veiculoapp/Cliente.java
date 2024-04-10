package br.com.primeiralistalp3.veiculoapp;
import java.math.BigInteger;

public class Cliente {
    String nome;
    int idade;
    BigInteger cpf = new BigInteger("0");
    
    Cliente(String n, BigInteger c, int i){
        this.nome = n;
        this.cpf = c;
        this.idade = i;
    }
}
