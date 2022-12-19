package Array;

import java.util.Scanner;

public class Array04 {
    // 10
    // 1 1 2 3 5 8 13 21 34 55
    // 피보나치는 a(n) = a(n-1) + a(n-2)
//    public int[] solution(int num) {
//        int[] answer = new int[num];
//        answer[0] = 1;
//        answer[1] = 1;
//
//        for (int i = 2; i < num; i++) {
//            answer[i] = answer[i-1] + answer[i-2];
//        }
//        return answer;
//    }


    // 배열 안쓰는 방법
    public void solution(int num) {
        int a = 1, b =1, c;
        System.out.print(a + " " +b +" ");
        for(int i = 2; i < num; i++){
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array04 array04 = new Array04();
        int num = sc.nextInt();

//        for(int x : array04.solution(num)) {
//            System.out.print(x + " ");
//        }

        array04.solution(num);
    }
}
