public class Estrutura {
    

    private No raiz;

    public void inserir(int valor){
        inserir(this.raiz,valor);
    }

    public void inserir(No no, int valor){

        if(no!=null){
            if(valor<=no.getValor()){
                if(no.getEsquerda() != null){
                    inserir(no.getEsquerda(), valor);
                }else{
                    no.setEsquerda(new No(valor));
                }
            }else{
                if(no.getDireita()!= null){
                    inserir(no.getDireita(), valor);
                }else{
                    no.setDireita(new No(valor));
                }
            }
        }else{
            this.raiz = new No(valor);
        }
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

        private No remover(No no, int valor) throws Exception{
            if(this.raiz == null){
                throw new Exception("Arvore vazia");
            }
            if(valor < no.getValor()){
                no.setEsquerda(remover(no.getEsquerda(),valor));
            }else if(valor>no.getValor()){
                no.setDireita(remover(no.getDireita(),valor));
            }else{
                no = (no.getEsquerda() != null) ? no.getEsquerda() : no.getDireita();
            }
            return no;
        }


    public No removeMinimo() throws Exception{
        return removeMinimo(valorMinimo());
    }

    private No removeMinimo(No no) throws Exception {
        if (this.raiz == null) {
            throw new Exception("Arvore vaziA");
        }else if(no.getEsquerda()!=null){
            no.setEsquerda(removeMinimo(no.getEsquerda()));
            return no;

        }else{
            return no.getDireita();
        }
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
