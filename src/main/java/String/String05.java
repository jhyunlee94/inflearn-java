package String;

import java.util.Scanner;

//5. 특정 문자 뒤집기(toCharArray())
public class String05 {


    public static void main(String[] args) {
        //input : a#b!GE*T@S
        //output : S#T!EG*b@a
        String05 T = new String05();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        //String 기반으로한 문자 배열 생성
        char[] s = str.toCharArray();
        int lt = 0;
        //0번 인덱스부터 들어갔으니까
        int rt = str.length() -1;

        while(lt < rt){
            //알파벳인지 아는 방법, 알파벳이면 참, 알파벳이 아니니까 ! 넣어준다
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            } else if (!Character.isAlphabetic(s[rt])){
                rt--;
            } else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }
}
