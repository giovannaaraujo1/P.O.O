//Sistema de Controle de Alunos: Uma escola precisa de um sistema para gerenciar 
//informações sobre seus alunos. Desenvolva uma classe Aluno com atributos para o 
//nome, idade e série. Crie objetos para representar três alunos diferentes e mostre 
//seus dados.

import java.util.Scanner;
public class Main {
    public static void main (String[]args) {
        Scanner dado = new Scanner (System.in);

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Antônio";
        aluno1.idade = 22;
        aluno1.serie = "3ª A";

        System.out.println("Os dados do primeiro aluno são:" + aluno1.nome +  " " +  aluno1.idade + " " + aluno1.serie);

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Igor";
        aluno2.idade = 19;
        aluno2.serie = "3º B";

        System.out.println("Os dados do segundo aluno são:" + aluno2.nome +  " " +  aluno2.idade + " " + aluno2.serie);

        Aluno aluno3 = new Aluno();

        aluno3.nome = "Danilo";
        aluno3.idade = 21;
        aluno3.serie = "3º C";

        System.out.println("Os dados do terceiro aluno são:" +  aluno3.nome +  " " +  aluno3.idade + " " + aluno3.serie);
        dado.close();
    }
}
