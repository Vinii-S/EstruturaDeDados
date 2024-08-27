package Ex1.Main;

import Ex1.Basica.Processo;
import Ex1.Estrutura.Fila;

public class Principal {
    public static void main(String[] args) {

    Fila f = new Fila();
    Processo p1 = new Processo(1,"Teste1");
    Processo p2 = new Processo(2,"Teste2");
    Processo p3 = new Processo(3,"Teste3");
    f.inserir(p1); 
    f.inserir(p2); 
    f.inserir(p3); 
    
    f.mostrar();
    }
   
    
}
