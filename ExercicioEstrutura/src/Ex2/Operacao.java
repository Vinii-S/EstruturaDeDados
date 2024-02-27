package Ex2;

public class Operacao {
    

    public String contaOperacao(int num1, int num2,String op){
        int result=0;
        
        switch (op) {
            case "*":
                result = num1 * num2;
                System.out.println("Resultado da Operação " + num1 + "*" + num2 + " é igual a: " + result);
                break;
            case "+":
                result = num1 + num2;
                System.out.println("Resultado da Operação " + num1 + "+" + num2 + " é igual a: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Resultado da Operação " + num1 + "-" + num2 + " é igual a: " + result);
                break;
            
            case "/":
                result = num1 / num2;
                System.out.println("Resultado da Operação " + num1 + "/" + num2 + " é igual a: " + result);
                break;

            default:
                System.out.println("Opção Invalida");
                break;
        }
        
        return op;

    }
}
