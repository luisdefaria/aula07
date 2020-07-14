package samples;

import java.util.TreeSet;

public class Sample05 {
    //Arvores
    public static void main(String[] args) {
        TreeSet<String> arvore = new TreeSet<>();
        String [] vetor = {"Mazda","Toyota","Renault","Fiat","Toyota"};

        for (String i : vetor) {
            System.out.println(arvore.add(i) ? "Coisô" : "Nao Coiso");
        }

        for (String i : arvore) {
            System.out.println(i+" ");
        }
        
    }


}