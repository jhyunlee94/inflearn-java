package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String07 string07 = new String07();
        System.out.println(string07.solution(str));
    }

    public String solution(String str) {
        String answer = "YES";

        int len = str.length();
        str = str.toUpperCase();
        for (int i = 0; i < len/2; i++){
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return answer = "NO";
            }
        }
        return answer;
    }

//    public String solution(String str) {
//        String answer = "";
//
//        str = str.toUpperCase();
//        String temp = new StringBuilder(str).reverse().toString();
//        if( str.equals(temp)) {
//            answer = "YES";
//        } else answer = "NO";
//        return answer;
//    }
}
