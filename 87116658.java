import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력받을 높이 N
        int N = scanner.nextInt();
        
        // 상단 삼각형 (포함 상단부 삼각형)
        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // 줄 바꿈
            System.out.println();
        }
        
        // 하단 삼각형 (하단부 삼각형)
        for (int i = N - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // 줄 바꿈
            System.out.println();
        }
        
        scanner.close();
    }
}