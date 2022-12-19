package Twopointers_Slidingwindow;

import java.util.Scanner;

public class Ts04 {

    public int solution(int n , int m , int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

//        for(int rt = 0; rt < n; rt++) { // 증가
//            sum+= arr[rt]; // 더하고
//            if(sum == m) answer++;// lt ~ rt 값을 확인한거예요
//
//            while(sum >= m) { // 1 1 1 1 5, m = 6 일때를 위한 처리
//                sum -= arr[lt++];
//                if(sum == m) answer++;
//            }
//        }
        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            while (sum > m) {
                sum -= arr[lt++];
            }
            if(sum == m) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ts04 ts04 = new Ts04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(ts04.solution(n,m,arr));
    }
}
