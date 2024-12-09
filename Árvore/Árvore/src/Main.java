
public class Main {
       public static void main(String[] args) throws Exception {
              Estrutura e = new Estrutura();
             No n = new No() ;
             No n2 = new No();

              e.inserir(4);
              e.inserir(2);
              e.inserir(3);
              e.inserir(1);
              e.inserir(6);
              e.inserir(5);
              e.inserir(7);
              e.inserir(8);
              e.inserir(-1);

              e.preOrdem();

              System.out.println();
              e.posOrdem();

              System.out.println();
              e.inOrdem();

              n = e.valorMinimo();

              System.out.println("Valor mínimo: " +n.getValor());
              n2 = e.valorMaximo();
  
              System.out.println("Valor máximo: " + n2.getValor());

              System.out.println();
              e.removeMinimo();
              e.inOrdem();
              System.out.println();

              System.out.println("A altura da arvore é: " + e.altura());
              

       }

}
