import java.util.Scanner;

public class BruteForceDivideConquer17{
    public int nilai;

    public Faktorial(){
        
    }

    public int faktorialBF(int n){
        int fakto = 1;
        for(int i = 1; i <= n; i++){
            fakto = fakto*i;
        }
        return fakto;
    }

    public faktorialDC(int n){
        if (n==1){
            return 1;
        }
        else{ 
            int fakto = n*faktorialDC(n-1);
            return fakto; 
        }

    }

    




}
