package Ex6;

public class CalculoHora {
    private double valorHora = 12.25;
    private double salario;
    
    public double calcularTempo(int horas){
        salario = horas *  valorHora;
        return salario;

    }
}
