import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // HashSet을 사용하여 서로 다른 나머지 값들을 저장
        Set<Integer> remainders = new HashSet<>();
        
        // 10개의 숫자를 입력받아 처리
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            // 42로 나눈 나머지를 HashSet에 추가
            remainders.add(number % 42);
        }
        
        // HashSet의 크기가 서로 다른 나머지의 개수
        System.out.println(remainders.size());
        
        scanner.close();
    }
}