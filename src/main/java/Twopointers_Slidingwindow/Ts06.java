package Twopointers_Slidingwindow;

import java.util.Scanner;

public class Ts06 {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0; // 0을 1로 바꾼 cnt
        int lt = 0;

        for(int rt = 0; rt < n; rt++){
            if(arr[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if(arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            // 기존 answer 에서 rt-lt+1 중에 큰거
            answer = Math.max(answer, rt-lt+1);
        }



        return answer;
    }

    public static void main(String[] args) {
        Ts06 ts06 = new Ts06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(ts06.solution(n,k,arr));
    }
}
