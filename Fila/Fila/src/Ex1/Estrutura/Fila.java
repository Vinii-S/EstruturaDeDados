package Ex1.Estrutura;
import java.util.LinkedList;
import java.util.Queue;

import Ex1.Basica.Processo;

public class Fila {
    
    Queue<Processo> fila = new LinkedList<Processo>();

    public void inserir(Processo proc){
        fila.add(proc);
    }
    public Object remover(){
        return fila.poll();
    }

    public boolean verifica(){
        return fila.isEmpty();
    }

    public void mostrar(){
        Processo proc = new Processo();
        proc.toString();
    }


}
