package Ex8;

import java.text.DecimalFormat;

public class CalculaLucro {
    DecimalFormat df = new DecimalFormat("#0.00");
    private double lucro = 0;
    

    public double teveLucro(double precoCusto, double precoVenda){
        
        if(precoVenda==precoCusto){
            System.out.println("Você está equilibrado");
        } else if(precoVenda>precoCusto/2){
            lucro= (precoVenda-precoCusto);
            System.out.println( "Você obteve lucro de: R$ "+ df.format(lucro) + " reais");
        }
        else{
            System.out.println("Você não obteve lucro.");
        }
        return lucro;
    }
}
