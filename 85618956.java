import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int prize;
        
        if (a == b && b == c) { // 3개가 모두 같은 경우
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) { // a가 포함된 2개가 같은 경우
            prize = 1000 + a * 100;
        } else if (b == c) { // b와 c가 같은 경우
            prize = 1000 + b * 100;
        } else { // 모두 다른 경우
            prize = Math.max(Math.max(a, b),c) * 100;
        }
        
        System.out.println(prize);
    }
}