// 6. Registro de Veículos: Um departamento de trânsito precisa de um sistema para 
// registrar veículos. Desenvolva uma classe Veiculo com atributos para a placa, marca 
// e ano. Registre três veículos diferentes e apresente seus dados.

public class Main{
    public static void main(String[] args) {
       
        Veiculo v1 = new Veiculo();
        v1.placa = "SNU750";
        v1.marca = "Honda";
        v1.ano = 2024;
        v1.infoveiculo();

        Veiculo v2 = new Veiculo();
        v2.placa = "KJP921";
        v2.marca = "Fiat";
        v2.ano = 2008;
        v2.infoveiculo();

        Veiculo v3 = new Veiculo();
        v3.placa = "PCC133";
        v3.marca = "Chevrolet";
        v3.ano = 2013;
        v3.infoveiculo();

        





    }
}