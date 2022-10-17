package String;

import java.util.*;

//2. 대소문자 변환
public class String02 {
    public String solution(String str) {
        String answer="";

//        for(int i = 0; i < str.length(); i++){
//            temp = str.charAt(i);
//            대문자
//            if((65<= temp) && (temp <= 90)){
//                answer += (char)(temp +32);
//            소문자
//            } else if((97 <= temp) && (temp <= 122)){
//                answer += (char)(temp -32);
//            } else {
//                answer += (char)temp;
//            }
//        }
        for(char x : str.toCharArray()) {
            //소문자냐 물어보는거
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }

        return answer;
    }
    public static void main(String[] args){
        String02 T = new String02();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }


}
