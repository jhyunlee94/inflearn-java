package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//4. 단어 뒤집기(StringBuilder이용법 또는 직접뒤집기)
public class String04 {
    public List<String> solution(int n , String[] str) {
        List<String> answer=new ArrayList<>();
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() -1;
            //이게 거짓이면 다 바껴져있는겁니다.
            while(lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
//        for(String s : str) {
//            String temp = new StringBuilder(s).reverse().toString();
//            answer.add(temp);
//        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String04 string04 = new String04();
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        for(String x : string04.solution(n, str)) {
            System.out.println(x);
        }
    }
}
