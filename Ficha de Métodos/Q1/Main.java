// Classe ContaCorrente Um banco digital deseja oferecer aos seus clientes uma experiência
// simplificada através de uma conta corrente que permita depósitos, saques, transferências e
// consulta de saldo. Para atender a essa necessidade, você deve criar a classe ContaCorrente
// com os atributos numeroDaConta (String), saldo (double) e nomeDoTitular (String).
// o Métodos:
// ▪ depositar(double valor): aumenta o saldo.
// ▪ sacar(double valor): diminui o saldo, se houver saldo suficiente.
// ▪ transferir(ContaCorrente destino, double valor): transfere valor de
// uma conta para outra.
// ▪ exibirSaldo(): mostra o saldo atual da conta.

public class Main {
    public static void main (String[]args) {
     contaCorrente cc = new contaCorrente();
     cc.nomeTitular = "Giovanna";
     cc.numeroConta = "8584";
     cc.saldo = 56596.00;
     cc.sacar(56597); 
     cc.exibirSaldo();


    }
}


