// § venderIngresso(): diminui a capacidade total e aumenta os ingressos vendidos, se houver lugares disponíveis.
// § cancelarIngresso(): aumenta a capacidade total e diminui os ingressos vendidos, se possível.
// § exibirInfoSessao(): mostra informações da sessão e quantos lugares ainda estão disponíveis.
// § alterarHorario(String novoHorario): modifica o horário da sessão.



package Q2;

public class SessaoCinema {
    String filme;
    String horario;
    int capacidadeTotal;
    int ingressosVendidos;

    void venderIngresso (int numero) {
        if (capacidadeTotal >= numero) {
            capacidadeTotal = capacidadeTotal - numero;
            ingressosVendidos = ingressosVendidos + numero;
            System.out.println("Ingresso vendido com sucesso!");
            
        }
        
        }

    void cancelarIngresso () {
        ingressosVendidos -= 1;
        capacidadeTotal += 1;
        System.out.println("Ingresso cancelado!");
    }

    void exibirInfoSessao () {
        System.out.println("O filme " + filme + " será exibido às: " + horario + "." + " A sessão possui apenas " 
        + capacidadeTotal + " lugares diponíveis.");
    }

    void alterarHorario(String novoHorario){
        horario = novoHorario;

    }

    }

    
    

