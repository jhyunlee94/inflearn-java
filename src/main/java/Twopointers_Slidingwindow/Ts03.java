package Twopointers_Slidingwindow;

import java.util.Scanner;

public class Ts03 {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < m; i++){
            sum += arr[i];
        }
        answer = sum;
        for(int i = m; i < n; i++) {
            sum = sum + arr[i] - arr[i - m];
//            if(answer < sum) {
//                answer = sum;
//            }
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Ts03 ts03 = new Ts03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(ts03.solution(n,m,arr));
    }
}
