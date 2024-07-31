import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    lista primeira = new lista();

    Scanner input = new Scanner(System.in);
        primeira.adicionarfim(input.nextLine());
        primeira.adicionarfim(input.nextLine());
        primeira.adicionarfim(input.nextLine());

        primeira.imprimir();
    }
}
