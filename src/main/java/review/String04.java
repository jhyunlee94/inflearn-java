package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String04 {
    //4. 단어 뒤집기(StringBuilder이용법 또는 직접뒤집기)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String04 string04 = new String04();
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }

        for(String x : string04.solution(n, str)){
            System.out.println(x);
        }
    }

    public List<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for ( String x : str ) {
            // 단어를 가지는게 문자 배열화 됨
            char[] ch = x.toCharArray();
            // lt : 왼쪽 끝
            // rt : 오른쪽 끝
            int lt = 0;
            int rt = x.length() - 1;
            while ( lt < rt) {
                // 이게 거짓되면 문자들이 다 뒤집어져 있는겁니다.
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(ch);
            answer.add(tmp);
        }
        return answer;
    }

//    public List<String> solution(int n, String[] str) {
//        List<String> answer = new ArrayList<>();
//        for(String s : str) {
//            // String 은 불변이기에 문자열 변경할수 없기에
//            // 새로운 객체를 만들어서 해야하기에 자꾸 객체가 만들어짐
//            // 그래서 가변인 StringBuilder 로 한다
//            String temp = new StringBuilder(s).reverse().toString();
//            answer.add(temp);
//        }
//        return answer;
//    }


}
