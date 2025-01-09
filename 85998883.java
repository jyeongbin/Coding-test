import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer는 한번 사용하면 토큰을 모두 소비
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
 
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
            if(A[i] < X){
                System.out.print(A[i] + " ");
            }
        }
    }
}