package Array;

import java.util.Scanner;

public class Array08 {

    // input : 5
    //         87 89 92 100 76
    // output : 4 3 2 1 5
    public int[] solution(int num, int[] arr) {
        int[] answer = new int[num];

        for(int i = 0; i < num; i++) {
            int cnt = 1;
            for(int j = 0; j < num; j++) {
                if(arr[j] > arr[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Array08 array08 = new Array08();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        for (int x : array08.solution(num, arr)) {
            System.out.print(x + " ");
        }
    }


}
