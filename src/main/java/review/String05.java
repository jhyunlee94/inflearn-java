package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String05 {
    // input : a#b!GE*T@S, output : S#T!EG*b@a
    public static void main(String[] args) throws IOException {
        // 문자만 뒤집어서 바꾸기
        // lt(left)          rt(right)
        // 0 1 2 3 4 5 6 7 8 9
        // a # b ! G E * T @ S // 문자 배열이라고 생각하세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        String05 string05 = new String05();
        System.out.println(string05.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        char[] ch = str.toCharArray();
        int lt = 0;
        int rt = str.length() -1;
        while ( lt < rt ) {
            if (!Character.isAlphabetic(ch[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(ch[rt])) {
                rt--;
            } else {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(ch);
        return answer;
    }

//    public String solution(String str) {
//        String answer = "";
//        // 문자 배열 생성
//        char[] s = str.toCharArray();
//        int lt = 0; // left
//        int rt = str.length() -1; // right
//        while ( lt < rt ) { // lt 가 rt 보다 작다 하나씩 확인을 위함
//            if (!Character.isAlphabetic(s[lt])) { // 알파벳인지 아닌지 알기위한 내장 함수
//                // 알파벳이 아닐때 전체가 참이됩니다.
//                lt++;
//            } else if (!Character.isAlphabetic(s[rt])) {
//                rt--;
//            } else {
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;
//            }
//        }
//        // 문자열로 바꿔줌, String으로 바꿔줌
//        answer = String.valueOf(s);
//        return answer;
//    }
}
