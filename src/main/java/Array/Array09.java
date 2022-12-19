package Array;

import java.util.Scanner;

public class Array09 {
/**
 * input : 5
 *         10 13 10 12 15
 *         12 39 30 23 11
 *         11 25 50 53 15
 *         19 27 29 37 27
 *         19 13 30 13 19
 * output : 155
 * */
    public int solution(int num, int[][] arr) {
        // 가장 큰 값 저장 할려고해서 가장 작은 값 저장해 놓은거임
        int answer = Integer.MIN_VALUE;
        // 행 열 대각선 값을 더해서 구해주면 되는거죠?
        // sum1 행, sum2 열
        int sum1, sum2;
        // sum3 왼쪽대각, sum4 오른쪽 대각
        int sum3 = 0, sum4 = 0;
        for(int i = 0; i < num; i++) {
            sum1 = sum2 = 0;
            for(int j = 0; j < num; j++) {
                // 행 번호 고정
                sum1 += arr[i][j];
                // 열 번호 고정
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        for (int i = 0; i < num; i++) {
            sum3 += arr[i][i];
            sum4 += arr[i][num-1-i];
        }
        answer = Math.max(answer, sum3);
        answer = Math.max(answer, sum4);

        return answer;
    }

    public static void main(String[] args) {
        Array09 array09 = new Array09();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(array09.solution(num, arr));
    }
}
