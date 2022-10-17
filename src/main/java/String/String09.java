package String;

//9. 숫자만 출력
//tge0a1h205er에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수로 만들면 1205가 됩니다.

import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String09 T = new String09();
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    public int solution(String s) {
        //input : g0en2T0s8eSoft
        String answer = "";
        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)){
              //igDigit : 숫자냐 문자냐 숫자면 true
              answer += x;
            }
        }
        //숫자로 바꾸는법
        //String은 0208 -> Integer.parseInt써서 208로 바꾸는법
        return Integer.parseInt(answer);
    }


//    public int solution(String s) {
//        //input : g0en2T0s8eSoft
//        int answer = 0;
//        for(char x : s.toCharArray()) {
//            if(Character.isDigit(x)){
//              //igDigit : 숫자냐 문자냐 숫자면 true
//              answer += x;
//            }
//            if(x >= 48 && x <= 57){
//                answer = answer * 10 + (x-48);
//            }
//        }
//        return answer;
//    }
}
