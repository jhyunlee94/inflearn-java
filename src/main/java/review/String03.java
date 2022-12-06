package review;

import java.util.Scanner;

public class String03 {
    // 문장 속 제일 긴 단어 찾기
    // It is time to study , study
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String03 T = new String03();

        // 문장일때는 nextLine 으로
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;

        String[] temp = str.split(" ");
        for (String x : temp) {
            int len = x.length();
            if ( len > m ) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }
}
