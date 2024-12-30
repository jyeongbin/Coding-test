import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 5줄의 입력을 저장할 배열
        String[] words = new String[5];
        
        // 가장 긴 단어의 길이를 저장할 변수
        int maxLength = 0;
        
        // 입력 받기
        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
            maxLength = Math.max(maxLength, words[i].length());
        }
        
        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();
        
        // 세로로 읽기
        for (int col = 0; col < maxLength; col++) {
            for (int row = 0; row < 5; row++) {
                // 현재 행의 길이가 열 인덱스보다 길 때만 문자를 추가
                if (col < words[row].length()) {
                    result.append(words[row].charAt(col));
                }
            }
        }
        
        // 결과 출력
        System.out.println(result.toString());
    }
}