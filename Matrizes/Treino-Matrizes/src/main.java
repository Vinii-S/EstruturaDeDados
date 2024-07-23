import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;
        int [][] matriz = new int[linhas][colunas];

        Scanner input = new Scanner(System.in);
        for(int i =0;i<linhas;i++){
            for(int j = 0;j<colunas;j++){
                System.out.println("Digite o valor da posição ["+ i +"]["+ j +"]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("Imprimindo valores digitados: ");
        for(int i =0;i<linhas;i++){
            System.out.print("| ");
            for(int j = 0;j<colunas;j++){
                
                System.out.print(matriz[i][j] + " ");
               
            }
            System.out.println("|");
        }
    }       
}
