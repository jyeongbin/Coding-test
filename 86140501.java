import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N+1];

        for(int i = 1; i<= N; i++){
            basket[i] = i; // N=5일때, 1 2 3 4 5가 들어감
        }
         
        for(int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
// 바구니 i,j가 입력될 때 각 바구니에 있는 공을 교체해라
            int tmp = basket[i];
            basket[i] = basket[j];
            basket[j] = tmp;
           
        }
        for(int i = 1; i <= N; i++){
            System.out.print(basket[i] + " ");
        }
    }
}