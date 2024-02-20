import java.util.Scanner;

    public class Main {
        public static void main (String[]args){

            Pessoa pessoa1 = new Pessoa();
            // Pessoa: classe da entidade ao qual quero criar o objeto.
            // pessoa1: nome do objeto.
            // new: construindo um novo objeto ou construindo uma nova instância da classe pessoa.

            pessoa1.nome="Igor";
            pessoa1.idade = 19;
            pessoa1.altura = 1.80;
            pessoa1.corDoCabelo = "Castanho escuro";
            pessoa1.nomeDaMae = "Ciclana";
            pessoa1.dataDeNasc = "19/03/2004";
            pessoa1.cpf = "111.222.333-44";

            // Criando o segundo objeto

            Pessoa pessoa2 = new Pessoa ();

            pessoa2.nome = "Antonio Guedes";
            pessoa2.idade = 22;
            pessoa2.altura = 1.78;
            pessoa2.cordoCabelo = "Preto";
            pessoa2.nomeDaMae = "Beltrana";
            pessoa2.dataDeNasc = "26/03/2001";
            pessoa2.cpf = "444.333.222-11";

            System.out.println("Nome da pessoa:"+ pessoa1.nome);



        }
    }