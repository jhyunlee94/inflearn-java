package review;

import java.util.Scanner;

public class String02 {
    // 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
    // 소문자는 대문자로 변환
    public static void main(String[] args) {
        String02 string02 = new String02();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(string02.solution(str));
    }

    public String solution(String str) {
        // 소문자 97 ~ 122
        // 대문자 65 ~ 90
        // 32만큼 차이가 난다
        StringBuilder answer = new StringBuilder();
        char tmp;
//        for ( int i = 0; i < str.length(); i++){
//            tmp = str.charAt(i);
//            if ((65 <= tmp ) && ( tmp <= 90 )){
//                answer.append((char) (tmp + 32));
//            } else if ( (97 <= tmp) && (tmp <= 122)){
//                answer.append((char) (tmp - 32));
//            } else {
//                answer.append((char) tmp);
//            }
//        }

        for (char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer.append(Character.toUpperCase(x));
            } else {
                answer.append(Character.toLowerCase(x));
            }
        }
        return answer.toString();
    }
}
