public class Estrutura {
    private No raiz;
    
    private int fatorBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return altura(no.getEsquerda()) - altura(no.getDireita());
    }
    
    private No balancear(No no) {
        int fatorB = fatorBalanceamento(no);
    
        // Rotação à direita (caso Esquerda-Esquerda)
        if (fatorB > 1 && fatorBalanceamento(no.getEsquerda()) >= 0) {
            return rotacaoDireita(no); // Chamando o método de rotação já existente
        }
    
        // Rotação à esquerda (caso Direita-Direita)
        if (fatorB < -1 && fatorBalanceamento(no.getDireita()) <= 0) {
            return rotacaoEsquerda(no); // Chamando o método de rotação já existente
        }
    
        // Rotação dupla à direita (caso Esquerda-Direita)
        if (fatorB > 1 && fatorBalanceamento(no.getEsquerda()) < 0) {
            rotacaoDuplaDireita(no); // Usando o método de rotação dupla que você criou
            return no;
        }
    
        // Rotação dupla à esquerda (caso Direita-Esquerda)
        if (fatorB < -1 && fatorBalanceamento(no.getDireita()) > 0) {
            rotacaoDuplaEsquerda(no); // Usando o método de rotação dupla que você criou
            return no;
        }
    
        return no; // Se não houver desbalanceamento, apenas retorna o nó.
    }

    public No rotacaoDireita(No raiz){
        No novaRaiz = raiz.getEsquerda();
        raiz.setEsquerda(novaRaiz.getDireita());
        novaRaiz.setDireita(raiz);
        raiz = novaRaiz;
        return novaRaiz;
    }
    public No rotacaoEsquerda(No raiz){
        No novaRaiz = raiz.getDireita();
        raiz.setDireita(novaRaiz.getEsquerda());
        novaRaiz.setEsquerda(raiz);
        raiz = novaRaiz;
        return novaRaiz;
    }
    public No rotacaoDuplaDireita(No raiz) {
        raiz.setDireita(rotacaoDireita(raiz.getDireita())); // Primeira rotação: direita na subárvore direita
        return rotacaoEsquerda(raiz); // Segunda rotação: esquerda na raiz
    }
    public No rotacaoDuplaEsquerda(No raiz) {
        raiz.setEsquerda(rotacaoEsquerda(raiz.getEsquerda())); // Primeira rotação: esquerda na subárvore esquerda
        return rotacaoDireita(raiz); // Segunda rotação: direita na raiz
    }

    public void inserir(int valor) {
        this.raiz = inserir(this.raiz, valor); // Atualiza a raiz com o valor retornado
    }
    

    private No inserir(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
    
        if (valor < no.getValor()) {
            no.setEsquerda(inserir(no.getEsquerda(), valor));
        } else if (valor > no.getValor()) {
            no.setDireita(inserir(no.getDireita(), valor));
        } else {
            // Valores duplicados não são permitidos
            return no;
        }
    
        // Atualizar o balanceamento
        return balancear(no);
    }

    public void preOrdem(){
        preOrdem(this.raiz);
    }   

    public void preOrdem(No no){
        if(no != null){
            System.out.print(no.getValor() + " ");
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    public void posOrdem(){
        posOrdem(this.raiz);
    }
    public void posOrdem(No no){
        if(no!=null){
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.print(no.getValor() + " ");
        }
    }

    public void inOrdem(){
        inOrdem(this.raiz);
    }

    public void inOrdem(No no){
        if(no!=null){
            inOrdem(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            inOrdem(no.getDireita());
        }
    }

    public No valorMinimo(){
        return valorMinimo(this.raiz);
    }


    public No valorMinimo(No no){
        if(no.getEsquerda() != null){
            no = valorMinimo(no.getEsquerda());
        }
        return no;
    }

    public No valorMaximo() {
		
		return valorMaximo(this.raiz);
		
	}
	
	private No valorMaximo(No no) {
		
		if(no.getDireita()!=null) {		
			no = valorMaximo(no.getDireita());	
		}
		
		return no;
		
	}

        public No remover(int valor) throws Exception{
            return remover(this.raiz, valor);
        }

        private No remover(No no, int valor) throws Exception {
            if (no == null) {
                throw new Exception("Valor não encontrado na árvore");
            }
        
            if (valor < no.getValor()) {
                no.setEsquerda(remover(no.getEsquerda(), valor));
            } else if (valor > no.getValor()) {
                no.setDireita(remover(no.getDireita(), valor));
            } else {
                if (no.getEsquerda() == null || no.getDireita() == null) {
                    no = (no.getEsquerda() != null) ? no.getEsquerda() : no.getDireita();
                } else {
                    No substituto = valorMinimo(no.getDireita());
                    no.setValor(substituto.getValor());
                    no.setDireita(remover(no.getDireita(), substituto.getValor()));
                }
            }
        
            if (no == null) {
                return no;
            }
        
            return balancear(no);
        }
        


    public No removeMinimo(){
        return removeMinimo(valorMinimo());
    }

    private No removeMinimo(No minimo) {
        if (minimo.getEsquerda() == null) {
            return minimo.getDireita(); 
        }
        minimo.setEsquerda(removeMinimo(minimo.getEsquerda())); 
        return minimo;
    }

    public int altura(){
        return altura(this.raiz);
    }
    private int altura(No no){
        if(no == null){
            return -1;
        }else{
            int alturaEsquerda = altura(no.getEsquerda());
            int alturaDireita = altura(no.getDireita());

            return 1 + Math.max(alturaEsquerda, alturaDireita);
        }
    }
}
