package Exercicio0701;

import java.util.Scanner;
import java.util.Stack;

import sun.awt.AWTAccessor.SystemTrayAccessor;
import sun.security.util.Length;

public class Main {
    public static void main(String[] args) {
        String frase;
        Stack<Character> pilha = new Stack<>();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite uma Frase: ");
        frase=in.nextLine();

        for (int i=0;i < frase.length();i++){
            pilha.push(frase.charAt(i));
        }

        while(!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }

           
        in.close();
        
    }
    
}