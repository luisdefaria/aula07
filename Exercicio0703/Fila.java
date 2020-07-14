package Exercicio0703;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    Queue<Pessoa> filaNormal;
    Queue<Pessoa> filaProp;
    int ultimo=0;
        
    
    public Fila() {
		this.filaNormal = new LinkedList<>();
		this.filaProp = new LinkedList<>();
    }

    public void adicionarFila(String nome, String senha){
        Pessoa p = new Pessoa(nome,senha);
        if (senha.charAt(0)=='N'){
            filaNormal.add(p);
        }else{
            filaProp.add(p);
        }

    
       
    }

    public void atenderPessoa (){
       
        if ((!filaNormal.isEmpty()||!filaProp.isEmpty())){
            if (filaProp.size()>0 && ultimo < 2){
                System.out.println((String)"*P*"+filaProp.remove().getNome());
                ultimo++;
            }else{
                System.out.println(">N>"+filaNormal.remove().getNome());
                ultimo = 0;
            }
        }
        }


    public int tamanhoFila(){
        return (filaProp.size() + filaNormal.size());
    }

        

    public void atenderFila (){
        while ((!filaNormal.isEmpty())||(!filaProp.isEmpty())){
            if (filaProp.size()>1){
                System.out.println((String)">P>"+filaProp.remove().getNome());
                System.out.println(">P>"+filaProp.remove().getNome());                
            }else if(filaProp.size()==1){
                System.out.println(">P*>"+filaProp.remove().getNome());
            }
            if (filaNormal.size()>1){
            System.out.println(">N>"+filaNormal.remove().getNome());
            }else if(filaNormal.size()==1){
                System.out.println(">N*>"+filaNormal.remove().getNome());
            }
        }
        }
    }