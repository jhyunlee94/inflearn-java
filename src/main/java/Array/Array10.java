package Array;

import java.util.Scanner;

public class Array10 {
/**
 * input
 * 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 * output
 * 10
 * */
    // 위, 오른쪽, 아래, 왼쪽
    int[] dx = {-1, 0 ,1 ,0};
    int[] dy = {0, 1, 0 ,-1};
    public int solution(int num, int[][] arr) {
        int answer = 0;
        for(int i = 0; i < num; i++) {
            // i, j 가 정해지는 값이 i, j 임, 즉 격자값
            for(int j = 0; j < num; j++) {
                // 봉우리인지 boolean
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < num && ny >= 0 && ny <num && arr[nx][ny] >= arr[i][j] ) {
                        // 앞에서 경계선이 들어가 있는겁니다.
                        flag = false;
                        break; // 아니라면 볼 이유가 없으니까
                    }
                }
                // flag 가 참이라면
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array10 array10 = new Array10();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(array10.solution(num, arr));
    }
}
