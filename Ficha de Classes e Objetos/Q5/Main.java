// 5. Sistema de Reservas de Hotel: Um hotel quer um sistema simples para gerenciar 
// reservas. Elabore uma classe Reserva que contenha o nome do hóspede, o tipo de 
// quarto (simples, duplo, suíte) e o número de noites. Crie três reservas diferentes e 
// exiba as informações.

public class Main {
    public static void main (String[]args) {

        Reserva hosp1 = new Reserva();
        Reserva hosp2 = new Reserva();
        Reserva hosp3 = new Reserva();

        hosp1.nome = "Danilo";
        hosp1.tpquarto = "simples";
        hosp1.noites = 3;
        hosp1.reservas();

        hosp2.nome = "Antonio";
        hosp2.tpquarto = "duplo";
        hosp2.noites = 5;
        hosp2.reservas();

        hosp2.nome = "Igor";
        hosp2.tpquarto = "suíte";
        hosp2.noites = 2;
        hosp2.reservas();



    }
}