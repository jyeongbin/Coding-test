import java.util.Scanner;

public class Main {
    // 알파벳에 대응되는 숫자를 매핑하는 메서드
    public static int getDialNumber(char alphabet) {
        String[] dialMap = {
            "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"
        };
        
        for (int i = 0; i < dialMap.length; i++) {
            if (dialMap[i].contains(String.valueOf(alphabet))) {
                return i + 2; // 2부터 시작하므로 +2
            }
        }
        return -1; // 매핑되지 않는 경우
    }
    
    // 다이얼을 돌리는 데 걸리는 시간을 계산하는 메서드
    public static int calculateDialTime(String word) {
        int totalTime = 0;
        
        for (char c : word.toCharArray()) {
            int number = getDialNumber(c);
            
            // 1을 걸때 기본 2초, 다른 숫자는 한 칸당 1초 추가
            totalTime += 2 + (number - 1);
        }
        
        return totalTime;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력받기
        String word = scanner.nextLine().toUpperCase();
        
        // 다이얼 시간 계산 및 출력
        int result = calculateDialTime(word);
        System.out.println(result);
        
        scanner.close();
    }
}