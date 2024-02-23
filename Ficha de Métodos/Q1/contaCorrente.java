// ▪ transferir(ContaCorrente destino, double valor): transfere valor de
// uma conta para outra.
// ▪ exibirSaldo(): mostra o saldo atual da conta.



public class contaCorrente {
    String numeroConta;
    String nomeTitular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void sacar(double valor) {

        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {System.out.println("Saldo insuficiente!");}
    }

    void exibirSaldo() {
        System.out.println("Seu saldo é: R$" + saldo);
    }



}
