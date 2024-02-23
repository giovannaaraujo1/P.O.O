//Gerenciamento de Pacientes em uma Clínica: Uma clínica médica precisa de um sistema para manter registros de pacientes. 
//Desenvolva uma classe Paciente com atributos para nome, idade e diagnóstico. Registre três pacientes e mostre suas informações.

public class Main {
    public static void main (String[]args){

        Paciente p1 = new Paciente();
        p1.nome = "Giovanna Araújo";
        p1.idade = 21;
        p1.diagnostico = "Amigdalite";
        p1.infoPaciente();

        Paciente p2 = new Paciente();
        p2.nome = "Elvis Oliveira";
        p2.idade = 25;
        p2.diagnostico = "Dermatite";
        p2.infoPaciente();

        Paciente p3 = new Paciente();
        p3.nome = "Igor Daniel";
        p3.idade = 19;
        p3.diagnostico = "Enxaqueca";
        p3.infoPaciente();

    }
}