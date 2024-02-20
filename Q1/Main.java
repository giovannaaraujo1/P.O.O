//Gestão de Biblioteca: Imagine que você precisa organizar as informações 
//dos livros em uma biblioteca. Crie uma classe Livro com atributos para armazenar o título,
//autor e ano de publicação. Em seguida, simule a adição de três livros ao sistema, 
//mostrando suas informações.




import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Livro livro1 = new Livro();

        livro1.titulo = "A seleção";
        livro1.nomeAutor = "Kiera Cass";
        livro1.dataLançamento = "2013";

        Livro livro2 = new Livro();

        livro2.titulo = "Misto Quente";
        livro2.nomeAutor = "Charles Bukowski";
        livro2.dataLançamento = "1982";

    
        Livro livro3 = new Livro();

        livro3.titulo = "O lado feio do amor";
        livro3.nomeAutor = "Collen Hoover";
        livro3.dataLançamento = "2014";






    }
}