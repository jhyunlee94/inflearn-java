package Twopointers_Slidingwindow;

import java.util.*;

public class Ts01 {

    public List<Integer> solution(int num1, int num2, int[] arr1, int[] arr2){
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0; // two pointer
        while (p1 < num1 && p2 < num2) {
            // 둘중하나가 num1, num2 가 되면 거짓이 됩니다.
            // 그래서 멈춥니다.
            if(arr1[p1] < arr2[p2]) {
                // ++ 이 뒤에있으면 p1을 add 하고 p1이 1 증가합니다.
                answer.add(arr1[p1]);
                p1++;
            } else {
                answer.add(arr2[p2]);
                p2++;
            }
        }
        while(p1 < num1) {
            answer.add(arr1[p1++]);
        }
        while(p2 < num2) {
            answer.add(arr2[p2++]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Ts01 ts01 = new Ts01();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];

        for(int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for(int i = 0; i < num2; i++){
            arr2[i] = sc.nextInt();
        }

        for(int x : ts01.solution(num1,num2,arr1,arr2)){
            System.out.print(x + " ");
        }

    }
}
