package br.com.primeiralistalp3.restaurantecaseiro;

public class MesaDeRestaurante {
    int pratoPrincipal = 0;
    double valor = 0 , somaValores = 0;
    void adicionaAoPedidoPratoPrincipal(int index){
        
        if(index != 1 && index != 2 && index != 0 ){
            System.out.println("Produto não cadastrado");
        }else{
            switch(index){
                case 1 : valor = 12.90;
                    break;
                case 2 : valor = 15.90;
                    break;
                default : System.out.println("Prato não cadastrado");
            }
            somaValores += valor;
            System.out.println(somaValores);
        }       
    }
    
        void adicionaAoPedidoSobremesa(int index){
        
            if(index != 1 && index != 2 && index != 0 ){
                System.out.println("Produto não cadastrado");
            }else{
                switch(index){
                    case 1 : valor = 5.90;
                        break;
                    case 2 : valor = 9.90;
                        break;
                    default : System.out.println("Prato não cadastrado");
                }
                somaValores += valor;
                System.out.println(somaValores);
            }       
        }
        
        void adicionaAoPedidoBebida(int index){
        
            if(index != 1 && index != 2 && index != 0 ){
                System.out.println("Produto não cadastrado");
            }else{
                switch(index){
                    case 1 : valor = 4.90;
                        break;
                    case 2 : valor = 3.90;
                        break;
                    default : System.out.println("Bebida não cadastrado");
                }
                somaValores += valor;
                System.out.println(somaValores);
            }       
        }        
        
        void fecharPedido(int nMesa){
            switch(nMesa){
                case 1:{
                    System.out.println("Total da mesa "+nMesa+": R$"+this.somaValores);
                }
            }
        }
    /*
    int calculaTotal(int mesa, float valor){
        // Este método deverá pegar o array de valores e somá-los para definir o total que o cliente
        // deverá pagar
    }

    int zeraPedidos(int pedido){
        // Este método apaga todos os registros feitos pelo cliente para liberar o número da mesa
    }
    */
}