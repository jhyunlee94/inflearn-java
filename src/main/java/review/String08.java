package review;

import java.util.Scanner;

public class String08 {
    // input : found7, time: study; Yduts; emit, 7Dnuof
    // output : YES

    public String solution (String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        System.out.println(str);
        String reverseStr = new StringBuilder(str).reverse().toString();
        if ( str.equalsIgnoreCase(reverseStr)) {
            answer = "YES";
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String08 string08 = new String08();
        System.out.println(string08.solution(str));
    }
}
