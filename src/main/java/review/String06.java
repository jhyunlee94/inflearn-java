package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class String06 {
    // input : ksekkset, output : kset
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String06 string06 = new String06();
        System.out.println(string06.solution(str));
    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        List<Character> list = new ArrayList<>();
        for ( char ch : str.toCharArray()) {
            if(!list.contains(ch)) {
                list.add(ch);
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
