package Array;

import java.util.Scanner;

public class Array12 {

    public int solution(int people, int problem, int[][] arr) {
        int answer = 0;

        for(int i = 1; i <= people; i++) { // 멘토
            for (int j = 1; j <= people; j++) { // 멘티
                int cnt = 0;
                for (int k = 0; k < problem; k++) { // 테스트 번호
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < people; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == problem) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array12 array12 = new Array12();
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int problem = sc.nextInt();
        int[][] arr = new int[people][problem];
        for(int i = 0; i < problem; i++) {
            for(int j = 0; j < people; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(array12.solution(people, problem, arr));
    }
}
