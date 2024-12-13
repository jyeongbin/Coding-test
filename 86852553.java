import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 테스트 케이스 수 입력
        int T = scanner.nextInt();
        
        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            // 반복 횟수와 문자열 입력
            int R = scanner.nextInt();
            String S = scanner.next();
            
            // 결과 문자열 생성
            StringBuilder P = new StringBuilder();
            
            // 각 문자를 R번 반복
            for (char c : S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    P.append(c);
                }
            }
            
            // 결과 출력
            System.out.println(P.toString());
        }
        
        scanner.close();
    }
}