import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스 개수 T 입력받기
        int T = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        
        // T개의 테스트 케이스 처리
        for(int i = 0; i < T; i++) {
            String str = sc.nextLine();
            // 첫 글자와 마지막 글자 출력
            System.out.print(str.charAt(0)); // 첫 글자
            System.out.println(str.charAt(str.length()-1)); // 마지막 글자
        }
        
        sc.close();
    }
}