package Questao1.Lista;

import Questao1.Básica.Contato;

public class Celula {
    private Celula proxima; 
    private Contato elemento;
    private Celula anterior;

    public Celula(Celula proxima, Contato elemento, Celula anterior){
        this.proxima = proxima;
        this.elemento = elemento;
        this.anterior = anterior;
    }

    public Celula(Celula proxima, Contato elemento ){
        this.proxima = proxima;
        this.elemento = elemento;
    }

    public Celula(Contato elemento){
        this.elemento = elemento;
    }

    
    public Celula getProxima() {
        return proxima;
    }
    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
    public Contato getElemento() {
        return elemento;
    }
    public void setElemento(Contato elemento) {
        this.elemento = elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }
    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

}
