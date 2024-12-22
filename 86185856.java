import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        boolean[] student = new boolean[31];
        
        for(int i = 0; i < 28; i++){
            int n = Integer.parseInt(br.readLine());
            student[n] = true; // student 배열에을 n의 입력으로 총 29개 초기화
        }
            for(int i = 1; i <= 30; i++) { // i가 반복될때 studnet[i]에 있는 값을 j에 비교
                if(!student[i]){
                    System.out.println(i);
            }
        } // student[i]에 j의 값이 없을때만 값을 출력
    }// 이걸 28번 반복했을때 j의 값에 해당되지 않는 수를 출력해라
}        // 두 수 중 작은 수를 먼저 출력하라 
