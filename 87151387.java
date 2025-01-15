import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 단어 입력 받기
        String word = scanner.nextLine();
        
        // 팰린드롬 여부 확인 및 출력
        System.out.println(isPalindrome(word) ? 1 : 0);
        
        scanner.close();
    }
    
    // 팰린드롬 판별 메서드
    public static boolean isPalindrome(String word) {
        // 문자열의 양 끝에서부터 비교
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            // 양 끝 문자가 다르면 팰린드롬이 아님
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        // 모든 문자 비교 후 팰린드롬
        return true;
    }
}