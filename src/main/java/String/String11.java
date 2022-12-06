package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String11 {
    // input : KKHSSSSSSSE   , KSTTTSEEKFKKKDJJGG
    // output : K2HS7E    , KST3SE2KFK3DJ2G2
    public String solution(String str){
        String answer = "";
        str = str + ' ';
        int cnt = 1;

        for(int i = 0; i < str.length() -1; i++){
            // 빈문자 했기때문에 -1 까지만 해야합니다.
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if(cnt>1) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        String11 string11 = new String11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(string11.solution(str));
    }


}
