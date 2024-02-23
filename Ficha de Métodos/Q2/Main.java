//  Classe SessaoCinema Um cinema busca melhorar a gestão de suas sessões e ingressos vendidos. A ideia é ter um sistema que permita controlar 
//  a venda e cancelamento de ingressos, além de alterar o horário das sessões e exibir informações relevantes sobre elas. Para isso, implemente 
//  a classe SessaoCinema com atributos filme (String), horario (String), capacidadeTotal (int) e ingressosVendidos (int).
// o Métodos:
// § venderIngresso(): diminui a capacidade total e aumenta os ingressos vendidos, se houver lugares disponíveis.
// § cancelarIngresso(): aumenta a capacidade total e diminui os ingressos vendidos, se possível.
// § exibirInfoSessao(): mostra informações da sessão e quantos lugares ainda estão disponíveis.
// § alterarHorario(String novoHorario): modifica o horário da sessão.
package Q2;
public class Main {
    public static void main(String[] args) {
        
        SessaoCinema infoFilme = new SessaoCinema();

        infoFilme.filme = "Harry Potter 1 ";
        infoFilme.horario = "14:30";
        infoFilme.capacidadeTotal = 150;
        infoFilme.venderIngresso(100);       
        infoFilme.exibirInfoSessao();
        infoFilme.alterarHorario("12:00"); 
        infoFilme.exibirInfoSessao();



    }
}