package br.com.primeiralistalp3.veiculoapp;
import java.math.BigInteger;

public class VeiculoApp {

    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("19793392797");
        Cliente cliente = new Cliente("Gabriel", b1, 20);
        
        Veiculo carro = new Veiculo(5, "Gasolina", "Ford", "Ranger", 2024);
        
        carro.venda(cliente);
        
        System.out.println(carro);
    }
}
