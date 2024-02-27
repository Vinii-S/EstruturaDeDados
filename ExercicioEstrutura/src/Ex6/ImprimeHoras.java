package Ex6;
import java.util.Scanner;
public class ImprimeHoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantas horas foram trabalhadas: ");
        int horasTrabalhadas = input.nextInt();

        CalculoHora C = new CalculoHora();
        System.out.println("Você irá receber " + C.calcularTempo(horasTrabalhadas) + " reais pelas " + horasTrabalhadas + " horas trabalhadas"); 
        input.close();
    }
}
