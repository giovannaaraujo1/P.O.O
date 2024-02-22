//Controle de Eventos: Uma organização que promove eventos quer um sistema para 
//gerenciar informações sobre eles. Crie uma classe Evento com atributos para nome 
//do evento, data e local. Organize três eventos diferentes e exiba as informações.{
	
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        
        Evento evento1 = new Evento ();
        evento1.nomeEvento = "Workshop de Gestão Empresarial";
        evento1.dataEvento = "20/06/2024";
        evento1.localEvento = "Av. Dantas Barreto, 784.";
        evento1.infoEvento();
        
        Evento evento2 = new Evento ();
        evento2.nomeEvento = "Workshop de Métodos Ágeis";
        evento2.dataEvento = "14/04/2024";
        evento2.localEvento = "Av. Águas Claras, 123.";
        evento2.infoEvento();
        
        Evento evento3 = new Evento ();
        evento3.nomeEvento = "Workshop de Empreendedorismo";
        evento3.dataEvento = "15/08/2024";
        evento3.localEvento = "Rua do Riachuelo, 369.";
        evento3.infoEvento();
        
        
        
    }
}
