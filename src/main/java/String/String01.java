package String;

import java.util.Locale;
import java.util.Scanner;
//1. 문자 찾기
public class String01 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        System.out.println(str + " " + t);

        //1. 기본 for 방식
//        for(int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == t){
////                charAt(i) : 인덱스로 접근
//                answer++;
//            }
//        }
        for(char x : str.toCharArray()){
            //string 을 배열로 만들어주는거는 toCharArray() 입니다.
            if( x == t){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String01 T = new String01();
        Scanner kb = new Scanner(System.in);

        // kb.next 는 문자열 콘솔에서 하나 읽은거임
        String str = kb.next();
        // next는 문자열이니까 하나만 가져와야하니까
        char c = kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
