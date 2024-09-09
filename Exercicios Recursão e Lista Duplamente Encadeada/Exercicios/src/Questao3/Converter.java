package Questao3;

public class Converter {
    

    public static int converterBi(String num){
        return converterBi(num,0);
    }

    private static int converterBi(String binario, int i){
        if(i==binario.length()){
            return 0;
        }
        int digito = binario.charAt(i) - '0';
        return digito * (int) Math.pow(2, binario.length() - 1 - i) + converterBi(binario, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(converterBi("111"));
    }
}
