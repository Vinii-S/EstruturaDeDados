public class Main {
    public static void main(String[] args) {
        Estrutura arvore = new Estrutura();

        // Inserindo valores na árvore
        arvore.inserir(10);
        arvore.inserir(20);
        arvore.inserir(30);
        arvore.inserir(40);
        arvore.inserir(50);
        

        System.out.println("Árvore em pré-ordem (raiz, esquerda, direita):");
        arvore.preOrdem();

        System.out.println("\nÁrvore em ordem (esquerda, raiz, direita):");
        arvore.inOrdem();

        System.out.println("\nÁrvore em pós-ordem (esquerda, direita, raiz):");
        arvore.posOrdem();
    }
}