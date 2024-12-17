import java.util.Scanner;

public class Main {
    // 숫자 뒤집는 메서드
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 수 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // 두 수 뒤집기
        int reversedA = reverseNumber(A);
        int reversedB = reverseNumber(B);
        
        // 더 큰 수 출력
        System.out.println(Math.max(reversedA, reversedB));
        
        scanner.close();
    }
}