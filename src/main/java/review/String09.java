package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String09 {
    // input : g0en2T0s8eSoft
    // output : 208
    public int solution(String str) {
//        String answer = "";
        StringBuilder answer = new StringBuilder();

        char[] ch = str.toCharArray();

        for ( char x : ch) {
            if(Character.isDigit(x)) {
                answer.append(x);
            }
        }
        return Integer.parseInt(answer.toString());

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String09 string09 = new String09();
        System.out.println(string09.solution(str));
    }
}
