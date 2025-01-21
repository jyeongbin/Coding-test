import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 문자 하나 입력받기
        char ch = sc.next().charAt(0);
        
        // 문자의 아스키 코드값 출력
        System.out.println((int)ch);
        
        sc.close();
    }
}