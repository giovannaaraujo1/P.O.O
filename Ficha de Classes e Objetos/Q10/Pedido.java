public class Pedido {
    
    int pedido;
    String descrição;
    double valorTotal;

    void infoPedidos () {
        System.out.println("Pedido recebido:");
        System.out.println("N° do pedido: " + pedido);
        System.out.println("Descrição: " + descrição);
        System.out.println("Valor do pedido: " + valorTotal);
    }


}
