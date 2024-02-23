//Sistema de Pedidos de Restaurante: Um restaurante deseja um sistema para gerenciar pedidos. 
//Implemente uma classe Pedido que contenha o número do pedido, a descrição dos itens pedidos e o valor total. 
//Crie três pedidos diferentes e apresente os detalhes.

public class Main {
    public static void main (String[]args) {
        
        Pedido p1 = new Pedido();

        p1.pedido = 56389;
        p1.descrição = "Yakisoba";
        p1.valorTotal = 19.00;
        p1.infoPedidos();

        Pedido p2 = new Pedido();

        p2.pedido = 56390;
        p2.descrição = "Parmegiana de frango";
        p2.valorTotal = 17.00;
        p2.infoPedidos();

        Pedido p3 = new Pedido();

        p3.pedido = 56391;
        p3.descrição = "Hamburguer tradicional";
        p3.valorTotal = 14.00;
        p3.infoPedidos();
    }
}