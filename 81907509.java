import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("");
        String input = sc.nextLine();
        
        String[] values = input.split(" ");
        
        long num1 = Long.parseLong(values[0]);
        long num2 = Long.parseLong(values[1]);
        long num3 = Long.parseLong(values[2]);
        
        long sum = num1 + num2 + num3;
        System.out.println(num1 + num2 + num3);
        }
       
}