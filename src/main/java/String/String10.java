package String;

import java.util.Scanner;

public class String10 {
    // input : teachermode e
    // output : 1 0 1 2 1 0 1 2 2 1 0
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;

        // str 길이만큼 돌면서
        // 이러면 왼쪽에서 처리한 값이  나옴
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        // 오른쪽
        p = 1000;
        for (int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String10 string10 = new String10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열 읽고
        char c = sc.next().charAt(0); // 문자 하나 읽고

        for ( int x : string10.solution(str, c)){
            System.out.print(x+ " ");
        }
    }


}
