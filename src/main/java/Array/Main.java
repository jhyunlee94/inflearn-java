package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int solution(int num, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= num; i++) {
            int cnt = 0;
            for(int j =1; j <= num; j++) {
                for(int k = 1; k <= 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num+1][6];

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(num, arr));

    }

}
