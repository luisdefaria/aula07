package Exercicio0703;


public class GerFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
       


        fila.adicionarFila("Marcos","N001");
        fila.adicionarFila("Cafu","N002");
        fila.adicionarFila("Roque Jr","N003");
        fila.adicionarFila("Edmilson","N004");
        fila.adicionarFila("Zagalo","P001");
        fila.adicionarFila("Lucio","N005");
        fila.adicionarFila("Roberto Carlos","N006");
        fila.adicionarFila("Parreira","P002");
        fila.adicionarFila("Scolari","P003");
        fila.adicionarFila("Kleberson","N007");
        fila.adicionarFila("Gilberto Silva","N008");
        fila.adicionarFila("Galvao Bueno","P004");
        fila.adicionarFila("Ronaldinho Gaucho","N009");
        fila.adicionarFila("Rivaldo","N0010");
        fila.adicionarFila("Zico","P005");
        fila.adicionarFila("Ronaldo","N0011");
        fila.adicionarFila("Pele","P006");
        fila.adicionarFila("Taffarel","P012");


       
        int tamanho = fila.tamanhoFila();
        for (int i=0;i<tamanho;i++){
            System.out.print("Proxima Pessoa: ");
            fila.atenderPessoa ();
        }
    }
        
   
}