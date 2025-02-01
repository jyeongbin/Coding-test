import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++){
            if(i%4!=0){
                continue;
            }
            else {
                System.out.print("long ");
            }
        }
        System.out.print("int");
    }
}