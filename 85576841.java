import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        
       int H = sc.nextInt();
       int M = sc.nextInt();
       
        if (M>44){
            M -= 45;
        }
        else {
            M = 60 - (45 - M);
            if(H==0){
                H = 23;
            }
            else{
                H -= 1;
            }
        }
        System.out.print(H + " ");
        System.out.print(M);
    }
}