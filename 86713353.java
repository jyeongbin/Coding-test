import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();

        int[] firstPositions = new int[26];
        
        for(int i = 0; i < 26; i++){
            firstPositions[i] = -1;
        }

        for(int i = 0; i < S.length(); i++){
            char current = S.charAt(i);
            int index = current - 'a';
        
            if(firstPositions[index] == -1){
                firstPositions[index] = i;
            }
        }

        for(int position : firstPositions){
            System.out.print(position + " ");
        }
    }
}