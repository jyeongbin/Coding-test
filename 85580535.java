import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 현재 시각 입력
        int A = sc.nextInt(); // 시
        int B = sc.nextInt(); // 분
        // 요리하는 데 필요한 시간 입력
        int C = sc.nextInt(); // 분
        
        // 총 분으로 변환
        int totalMinutes = A * 60 + B + C;
        
        // 종료되는 시각 계산
        int endHour = (totalMinutes / 60) % 24; // 24시간 형식으로 조정
        int endMinute = totalMinutes % 60; // 분 계산
        
        // 결과 출력
        System.out.print(endHour + " " + endMinute);
    }
}