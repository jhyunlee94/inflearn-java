package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array02 {
    // input : 8
    //        130 135 148 140 145 150 150 153
    // output: 5
//    public int solution(int[] array) {
//        List<Integer> list = new ArrayList<>();
//        int max = array[0];
//        list.add(array[0]);
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] > max) {
//                list.add(array[i]);
//                max = array[i];
//            }
//        }
//        return list.size();
//    }
    public int solution(int[] array) {
        int cnt = 1;
        int max = array[0];
        int len = array.length;
        for(int i = 1; i< len; i++){
            if(array[i] > max) {
                cnt++;
                max = array[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Array02 array02 = new Array02();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(array02.solution(array));
    }


}
