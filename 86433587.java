import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = Integer.MIN_VALUE;
        int N = sc.nextInt();
        double[] arr = new double[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        } // 배열에 점수 초기화

        double sum = 0;
        for(int i = 0; i < N; i++){
            arr[i] = arr[i] / max * 100;
            sum += arr[i];
        }     
        System.out.println(sum/N);
    }
}