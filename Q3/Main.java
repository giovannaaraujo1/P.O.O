//Catálogo de Produtos: Uma loja virtual quer manter um catálogo de seus produtos. 
//Implemente uma classe Produto com atributos para nome, preço e categoria. 
//Adicione três produtos ao catálogo e exiba as informações de cada um.

import java.util.Scanner;

public class Main {
    public static void main (String[]args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        // Cadastrando nome de produto
        produto1.nome = "Geladeira";
        produto2.nome = "Celular";
        produto3.nome = "Mesa de jantar";
        
        //Cadastrando categoria

        produto1.categoria = "Eletrodoméstico";
        produto2.categoria = "Eletroeletrônico";
        produto3.categoria = "Móveis";

        // Cadastrando preço

        produto1.preco = 2500.00;
        produto2.preco = 1800.00;
        produto3.preco = 950.00;

        System.out.println("Informações do produto 1:" + " " + produto1.nome + "," + produto1.categoria + ", " + produto1.preco); 
        System.out.println("Informações do produto 2:" + " " + produto2.nome + ", " + produto2.categoria + " ," + produto2.preco); 
        System.out.println("Informações do produto 3:" + " " + produto3.nome + ", " + produto3.categoria + ", " + produto3.preco); 




    }
}