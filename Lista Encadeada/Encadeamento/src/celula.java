public class celula {
    public celula proxima; 
    public Object elemento;

    public celula(celula proxima, Object elemento){
        this.proxima = proxima;
        this.elemento = elemento;
    }
    public celula(Object elemento){
        this.elemento = elemento;
    }

    
    public celula getProxima() {
        return proxima;
    }
    public void setProxima(celula proxima) {
        this.proxima = proxima;
    }
    public Object getElemento() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
