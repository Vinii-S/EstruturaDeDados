package Ex7;
import java.util.Scanner;
public class ImprimeHoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantas horas foram trabalhadas: ");
        int horasTrabalhadas = input.nextInt();

        CalculoHora C = new CalculoHora();
        if(C.calcularTempo(horasTrabalhadas)<50){
            System.out.println("Seu pagamento foi de apenas " + C.calcularTempo(horasTrabalhadas));
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        }else{
        System.out.println("Você irá receber " + C.calcularTempo(horasTrabalhadas) + " reais pelas " + horasTrabalhadas + " horas trabalhadas"); 
        }
        input.close();
    }
}
