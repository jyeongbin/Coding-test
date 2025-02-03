import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 단어 S 입력 받기
        String S = sc.nextLine();
        
        // 정수 i 입력 받기
        int i = sc.nextInt();
        
        // i번째 글자 출력 (문자열은 0부터 시작하므로 i-1)
        System.out.println(S.charAt(i-1));
    }
}