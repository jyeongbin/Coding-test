import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 행렬의 크기 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        // 행렬 A 입력
        int[][] matrixA = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        
        // 행렬 B 입력
        int[][] matrixB = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        // 행렬 덧셈
        int[][] resultMatrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        // 결과 행렬 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}