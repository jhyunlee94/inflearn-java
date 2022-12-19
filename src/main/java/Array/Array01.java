package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array01 {
    //1. 큰수 출력하기
    //input : 6
    //        7 3 9 5 6 12
    //output : 7 9 6 12
    public List<Integer> solution(int num, int[] arr) {

        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i = 1; i < num; i++){
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Array01 array01 = new Array01();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : array01.solution(num, arr)){
            System.out.print(x + " ");
        }
    }


}
