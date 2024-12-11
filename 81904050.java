import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("");
        int a = sc.nextInt();
        
        System.out.print("");
        int b = sc.nextInt();
        
        int fir = b % 10;
        int sec = (b / 10) % 10;
        int thr = b / 100;
        
        int result1 = a * fir;
        int result2 = a * sec;
        int result3 = a * thr;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        int total = result1 + (result2 * 10) + (result3 * 100);
        System.out.println(total);
    }
}