import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 문자열 입력 받기
        String input = scanner.nextLine();
        
        // 단어 개수 세기
        int wordCount = countWords(input);
        
        // 결과 출력
        System.out.println(wordCount);
        
        scanner.close();
    }
    
    // 단어 개수를 세는 메서드
    public static int countWords(String str) {
        // 문자열이 비어있다면 0 반환
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        
        // 문자열의 앞뒤 공백 제거
        str = str.trim();
        
        // 공백을 기준으로 분리
        String[] words = str.split("\\s+");
        
        // 단어 배열의 길이 반환
        return words.length;
    }
}