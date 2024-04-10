package br.com.primeiralistalp3.restaurantecaseiro;

import java.util.Scanner;

public class RestauranteCaseiro {
    //aqui é necessário fazer uma instância da classse MesaDeRestaurante e aqui é onde será o cadastro das mesas
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        int index, nMesa, nPedido = 0;  
        
        MesaDeRestaurante mesa1 = new MesaDeRestaurante();
        MesaDeRestaurante mesa2 = new MesaDeRestaurante();
        MesaDeRestaurante mesa3 = new MesaDeRestaurante();
        
        System.out.println("Mesa do cliente:");
        nMesa = in.nextInt();
        
        switch(nMesa){
            case 1 :{
                System.out.println("Qual prato principal?\n1- File com fritas\n2- Estrogonofe\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa1.adicionaAoPedidoPratoPrincipal(nPedido);
                    System.out.println("Qual prato principal?\n1- File com fritas\n2- Estrogonofe\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                
                System.out.println("Qual a sobremesa?\n1- Mousse de Maracuja\n2-Petit Gateau\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa1.adicionaAoPedidoSobremesa(nPedido);
                    System.out.println("Qual a sobremesa?\n1- Mousse de Maracuja\n2-Petit Gateau\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                
                System.out.println("Qual a bebida?\n1- Coca-Cola\n2- Fanta Maracujá\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa1.adicionaAoPedidoBebida(nPedido);
                    System.out.println("Qual a bebida?\n1- Coca-Cola\n2- Fanta Maracujá\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                break;
            }
            case 2 :{
                System.out.println("Qual prato principal?\n1- File com fritas\n2- Estrogonofe\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa2.adicionaAoPedidoPratoPrincipal(nPedido);
                    System.out.println("Qual prato principal?\n1- File com fritas\n2- Estrogonofe\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                
                System.out.println("Qual a sobremesa?\n1- Mousse de Maracuja\n2-Petit Gateau\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa2.adicionaAoPedidoSobremesa(nPedido);
                    System.out.println("Qual a sobremesa?\n1- Mousse de Maracuja\n2-Petit Gateau\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                
                System.out.println("Qual a bebida?\n1- Coca-Cola\n2- Fanta Maracujá\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa2.adicionaAoPedidoBebida(nPedido);
                    System.out.println("Qual a bebida?\n1- Coca-Cola\n2- Fanta Maracujá\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                break;
            }
            case 3 :{
                System.out.println("Qual prato principal?\n1- File com fritas\n2- Estrogonofe\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa3.adicionaAoPedidoPratoPrincipal(nPedido);
                    System.out.println("Qual prato principal?\n1- File com fritas\n2- Estrogonofe\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                
                System.out.println("Qual a sobremesa?\n1- Mousse de Maracuja\n2-Petit Gateau\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa3.adicionaAoPedidoSobremesa(nPedido);
                    System.out.println("Qual a sobremesa?\n1- Mousse de Maracuja\n2-Petit Gateau\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                
                System.out.println("Qual a bebida?\n1- Coca-Cola\n2- Fanta Maracujá\n0- Ir para o proximo pedido");
                nPedido = in.nextInt();
                while(nPedido != 0){
                    mesa3.adicionaAoPedidoBebida(nPedido);
                    System.out.println("Qual a bebida?\n1- Coca-Cola\n2- Fanta Maracujá\n0- Ir para o proximo pedido");
                    nPedido = in.nextInt();
                }
                break;
            }
        }
        System.out.println("Fechar o pedido de qual mesa?");
        index = in.nextInt();
        
        switch(index){
            case 1: mesa1.fecharPedido(1);
            case 2: mesa2.fecharPedido(2);
            case 3: mesa3.fecharPedido(3);
        }
    }
}
