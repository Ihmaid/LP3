package br.com.primeiralistalp3.concessionaria;
import java.math.BigInteger;

public class Concessionaria {

    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("19793392797");
        Cliente cliente1 = new Cliente("Gabriel", b1, 20);
        BigInteger b2 = new BigInteger("91652830700");
        Cliente cliente2 = new Cliente("Samira", b2, 56);

        
        Veículo carro1 = new Veículo(5, "Diesel", "Ford", "Ranger 4x4", 2024);
        Veículo carro2 = new Veículo(5, "Gasolina", "Hyundai", "Elantra", 2022);
        
        carro1.venda(cliente1);
        carro2.venda(cliente2);
        
        System.out.println(carro1);
        System.out.println(carro2);
    }
}
