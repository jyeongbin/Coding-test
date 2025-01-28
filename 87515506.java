import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalGradePoints = 0.0;
        double totalCredits = 0.0;
        
        // 총 20줄의 과목 정보 입력 받기
        for (int i = 0; i < 20; i++) {
            String courseName = scanner.next();
            double credit = scanner.nextDouble();
            String grade = scanner.next();
            
            // P 과목은 계산에서 제외
            if (!grade.equals("P")) {
                totalGradePoints += credit * getGradePoint(grade);
                totalCredits += credit;
            }
        }
        
        // 전공평점 계산
        double majorGPA = totalGradePoints / totalCredits;
        
        // 소수점 6자리까지 출력
        System.out.printf("%.6f", majorGPA);
        
        scanner.close();
    }
    
    // 학점을 점수로 변환하는 메서드
    private static double getGradePoint(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F": return 0.0;
            default: return 0.0;
        }
    }
}