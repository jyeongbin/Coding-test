import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에서 N과 M을 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 바구니 배열 초기화 (1부터 N까지)
        int[] baskets = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        // M번 동안 구간을 입력받아 역순으로 만듦
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            // i부터 j까지의 구간을 역순으로 만듦
            reverseOrder(baskets, i, j);
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(baskets[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    // 배열의 특정 구간을 역순으로 만드는 메소드
    private static void reverseOrder(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}