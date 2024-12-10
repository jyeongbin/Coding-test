import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[9];
        for(int i = 0; i < 9; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        int max = num[0];
        int maxIndex = 0;
        for(int i = 1; i < 9; i++){
            if(max < num[i]){
                max = num[i];
                maxIndex = i;
                
            }
        }
        System.out.println(max);
        System.out.println(maxIndex + 1);

    }
}