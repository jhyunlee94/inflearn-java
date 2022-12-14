package String;

import java.util.Scanner;

public class String12 {
    //4
    //#****###**#####**#####**##**
    public String solution(int n, String str) {
        String answer = "";
        for(int i = 0; i < n; i++){
            // n개 만큼 돌아야하니까요
            // 그래서 문장속 단어 subString 으로 처리하는거예요
            // 0 ~ 7번 인덱스 전까지
            String tmp = str.substring(0, 7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(tmp, 2); // 2진수를 10진수로 바꾸는겁니다.
            answer += (char) num;
//            System.out.println(tmp +" " + num);
            // 그 다음 값을 변경 시켜 주는겁니다.
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        String12 string12 = new String12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(string12.solution(n, str));

    }
}
