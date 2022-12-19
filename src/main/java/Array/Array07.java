package Array;

import java.util.Scanner;

public class Array07 {
    // input 10
    //       1 0 1 1 1 0 0 1 1 0
    // output 10
    public int solution(int num, int[] arr) {
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Array07 array07 = new Array07();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(array07.solution(num, arr));
    }
}
