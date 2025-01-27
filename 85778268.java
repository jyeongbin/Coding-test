import java.io.*;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
       // BufferedReader와 BufferedWriter 객체 생성
       // System.in을 통해 입력을 받고, System.out으로 출력
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
       // 첫 번째 줄에서 테스트 케이스의 개수를 읽음
       // readLine()으로 한 줄을 읽어서 Integer로 변환
       int T = Integer.parseInt(br.readLine());
       
       // 테스트 케이스 수만큼 반복
       for(int i = 0; i < T; i++) {
           // StringTokenizer를 사용해 공백으로 구분된 두 수를 분리
           // br.readLine()으로 한 줄을 읽어옴
           StringTokenizer st = new StringTokenizer(br.readLine());
           
           // nextToken()으로 분리된 토큰을 하나씩 읽어서 정수로 변환
           int A = Integer.parseInt(st.nextToken()); // 첫 번째 숫자
           int B = Integer.parseInt(st.nextToken()); // 두 번째 숫자
           
           // A+B 결과를 String으로 변환하여 버퍼에 기록
           bw.write(String.valueOf(A + B));
           // 줄바꿈 문자를 버퍼에 기록
           bw.newLine();
       }
       
       // 사용한 자원 정리
       br.close();    // BufferedReader 닫기
       bw.flush();    // 버퍼의 남은 데이터를 모두 출력
       bw.close();    // BufferedWriter 닫기
   }
}