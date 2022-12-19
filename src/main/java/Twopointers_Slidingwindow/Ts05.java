package Twopointers_Slidingwindow;

import java.util.Scanner;

public class Ts05 {

    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = n / 2 + 1; // 연속된 자연수의 가장 큰 숫자
                           // 즉, 7 + 8 인데 15 / 2 = 7인데 여기서 7 + 8 까지 등장하겠죠?

        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for(int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if(sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Ts05 ts05 = new Ts05();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ts05.solution(n));
    }
}
