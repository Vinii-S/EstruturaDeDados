package Ex4;

public class MultPar {
    private int num=1;
    private Long result = (long) 1;

    
    public void MultiplicaPar(){

        while(num<=30){
            if (num%2==0){
                result = result * num;
            }
            num++;
        }
        System.out.println(result);
    }
}
