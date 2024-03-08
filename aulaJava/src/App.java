import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> minhaLista = new ArrayList<>();
        String n1 = "Giovanna";
        String n2 = "Danilo";
        String n3 = "Igor";

        minhaLista.add(n2);
        minhaLista.add(n1);
        minhaLista.add(n3);
        minhaLista.add("Antônio");

        exibirLista(minhaLista);
        minhaLista.remove(1);
        exibirLista(minhaLista);

        System.out.println(minhaLista.get(1));

       
    }

    public static void exibirLista (ArrayList<String> lista){
        for(int i=0; i<lista.size(); i++) {
            System.out.println( lista.get(i));
         }
    }

}
