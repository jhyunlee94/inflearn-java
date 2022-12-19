package review;


import java.util.*;

public class Main {
    public String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String temp = str.substring(0, 7).replace("#", "1").replace("*","0");
            int num = Integer.parseInt(temp, 2);
            str = str.substring(7);
            answer += (char)num;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        Main main = new Main();
        System.out.println(main.solution(n, str));
    }
}