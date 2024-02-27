package Ex9;
import java.util.Scanner;
public class InformaMes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número e saiba qual é o mês: "); 
        int mesNumero = input.nextInt();
        
        ValidaMes V = new ValidaMes();
        V.nomeMes(mesNumero);
    }
    

}
