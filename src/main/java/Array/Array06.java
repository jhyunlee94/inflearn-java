package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array06 {
    // 32 -> 23 , 23 은 소수
    // 910 -> 19 , 첫자리 0은 무시한다.
    // 100 -> 1 , 1은 소수 아님
//        9
//        32 55 62 20 250 370 200 30 100

    public boolean isPrime(int num) {
        // 소수인지 확인하는 함수
        if (num == 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                // 이게 참이라면 i 는 num 에 약수라는겁니다.
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        // 뒤집어서 소수면 ArrayList 에 담아서 보낼게요
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp%10;
                res = res * 10 +t; // 뒤집어진 수
                tmp = tmp/10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array06 array06 = new Array06();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for (int x : array06.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
