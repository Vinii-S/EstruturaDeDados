package Ex1;
public class Tabu {

   
    public int Tabuada(int num){
        int a = 1;
      
        while(a<=10){
            int conta = num * a;
            System.out.println(num + " X " + a + " = " + conta);
            a++;
        }
        return 0;

    }    
    
    

}