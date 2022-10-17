package String;

import java.util.Scanner;

//6. 중복문자제거
public class String06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String06 string06 = new String06();
        String str = sc.next();
        System.out.println(string06.solution(str));
    }

    private String solution(String str) {
        //input : ksekkset
        //output : kset
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i)+ " " + i+ " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}
