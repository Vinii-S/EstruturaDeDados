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
}
