package String;

import java.util.Scanner;

//6. 회문 문자열
public class String07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String07 T = new String07();
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        //input : gooG, gooa, stuts
        //output : YES, NO, YES
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
//                answer = "NO";
                return "NO";
            }
        }
        return answer;
    }
}
