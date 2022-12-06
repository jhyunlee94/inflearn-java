package review;

import java.util.Scanner;

public class String10 {
    // input : teachermode e
    // output : 1 0 1 2 1 0 1 2 2 1 0

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i = str.length() -1; i >= 0; i--) {
            if ( str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String10 string10 = new String10();
        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int x : string10.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
