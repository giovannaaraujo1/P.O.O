import java.util.Scanner;

public class Main {
    public static void main (String[]args) {

        Funcionarios fun1 = new Funcionarios();
        Funcionarios fun2 = new Funcionarios();
        Funcionarios fun3 = new Funcionarios();

        // Inserindo nome dos funcionários
        fun1.nome = "Danilo";
        fun2.nome = "Antonio";
        fun3.nome = "Igor";

        // Inserindo departamento

        fun1.departamento= "T.I";
        fun2.departamento= "Engenharia";
        fun3.departamento= "Administração";

        // Inserindo valor de salário

        fun1.salario= 10000.00;
        fun2.salario= 7800.00;
        fun3.salario= 3500.00;

        // Exibindo dados

        System.out.println("Dados do funcionário 1:" + fun1.nome  + "," +  fun1.departamento + "," + fun1.salario);
        System.out.println("Dados do funcionário 2:" + fun2.nome  + "," +  fun2.departamento + "," + fun2.salario);
        System.out.println("Dados do funcionário 3:" + fun3.nome  + "," +  fun3.departamento + "," + fun3.salario);

        

    }
}