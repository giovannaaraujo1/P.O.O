public class Paciente {

    String nome;
    String diagnostico;
    int idade;

    void infoPaciente () {
        System.out.println("Registro do paciente:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Diagnóstico: " + diagnostico);
    }
    
}
