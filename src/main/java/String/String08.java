package String;

import java.util.Scanner;

//8. 팰린드롬(앞으로 읽을때나 뒤로 읽을 때나 같은 문자열)
//단 회문을 검사할때 알파벳만 가지고 회문을 검사하여, 대소문자를 구분하지 않습니다.
//알파벳 이외의 문자들을 무시합니다.
public class String08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String08 T = new String08();
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        //input : found7, time: study; Yduts; emit, 7Dnuof
        String answer = "NO";
        //replace 는 정규식 못쓰고
        //replaceAll은 정규식 가능
        //^는 부정 대문자가 아닌것들 빈문자 시켜라
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        System.out.println(str);

        String temp = new StringBuilder(str).reverse().toString();
        if(str.equals(temp)){
            answer = "YES";
        }
        return answer;
    }
}
