import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int[] whitePieces = new int[6];
        for (int i = 0; i < 6; i++) {
            whitePieces[i] = scanner.nextInt();
        }

        // 올바른 체스 피스 개수
        int[] correctPieces = {1, 1, 2, 2, 2, 8};

        // 필요한 피스 개수 계산
        int[] diff = new int[6];
        for (int i = 0; i < 6; i++) {
            diff[i] = correctPieces[i] - whitePieces[i];
        }

        // 출력
        for (int i = 0; i < 6; i++) {
            System.out.print(diff[i] + " ");
        }
        System.out.println();
    }
}