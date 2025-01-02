import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 공의 번호 수,바구니 번호 수
        int M = Integer.parseInt(st.nextToken()); // 반복 횟수
        
        int[] result = new int[N + 1]; // 1부터 시작하므로 N+1 크기로 배열 생성
        
        // M번 반복하면서 공 넣기
        for(int b = 0; b < M; b++){
            st = new StringTokenizer(br.readLine());
            
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            // i부터 j까지의 바구니에 k번 공을 넣기
            for(int idx = i; idx <= j; idx++) {
                result[idx] = k;
            }
        }
        
        // 결과 출력 (1번부터 N번 바구니까지)
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}