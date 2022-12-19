package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Array11 {

    public int solution(int num, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE; // 최대값을 구해야하니까 max 가 필요합니다.

        for(int i = 1; i <= num; i++){
            int cnt = 0;
            for(int j = 1; j <= num; j++) {
//                if(i != j)
                for(int k=1; k<=5; k++){
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args)  {
        Array11 array11 = new Array11();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num+1][6];

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(array11.solution(num, arr));
    }
}
