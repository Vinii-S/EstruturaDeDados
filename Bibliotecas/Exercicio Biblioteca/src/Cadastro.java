import java.util.ArrayList;
import java.util.List;

public class Cadastro<T> {
   // private Object[] contas = new Object[5];
    private int tamanho = 0;

    private List<T> contas1 = new ArrayList<T>();

    public void adicionarPorPosicao(T c, int posicao) {
		
		/*if(!verificaPosicaoAdicionar(posicao)) {
			throw new IllegalArgumentException("Fora de posicao!!!");
		}
		for(int cont = this.tamanho-1;cont>=posicao;cont--) {
			
			this.contas[cont+1]= this.contas[cont];
			
		}
		
		
		this.tamanho++;
		*/
        this.contas1.add(posicao,c);
	}

    public void adicionar(T c){
        this.contas1.add(c);
    }

    public void listar(){
        for(T c: contas1){
            System.out.println(c);
        }
    }
}
