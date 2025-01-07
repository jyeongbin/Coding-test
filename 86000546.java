import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int min = Integer.MAX_VALUE;  // 최솟값 초기화
        int max = Integer.MIN_VALUE;  // 최댓값 초기화
        
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(min, num);  // 최솟값 갱신
            max = Math.max(max, num);  // 최댓값 갱신
        }
        
        System.out.println(min + " " + max);
    }
}