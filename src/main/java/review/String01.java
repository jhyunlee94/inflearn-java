package review;

import java.util.Scanner;

public class String01 {

    // Character , c 입력받아서 c가 몇개인지 출력
    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for ( char x : str.toCharArray()) {
            if ( x == c) {
                answer++;
            }
        }




        return answer;
    }

    public static void main(String[] args) {
        String01 string01 = new String01();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(string01.solution(str, c));
    }
}
