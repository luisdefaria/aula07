package samples;

import java.util.TreeSet;

public class Sample04 {
    //Arvores
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();
        int [] vetor = {2,4,1,6,3,7,9,5};

        for (int i : vetor) {
            arvore.add(i);            
        }

        for (Integer i : arvore) {
            System.out.println(i+" ");
        }
        
    }


}