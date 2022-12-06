package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String str) {
        String answer = "";
        int cnt = 1;
        str = str + ' ';
        for (int i = 0; i < str.length() -1; i++){
            if ( str.charAt(i) == str.charAt(i+1)){
                cnt++;
            } else {
                answer += str.charAt(i);
                if(cnt > 1) {
                    answer += cnt;
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Main main = new Main();
        System.out.println(main.solution(str));

    }
}