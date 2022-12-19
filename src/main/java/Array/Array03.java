package Array;

import java.util.Scanner;

public class Array03 {

    //    public char[] solution(int num, int[] arrA, int[] arrB){
//        char[] answer = new char[num];
//
//        for (int i = 0; i < num; i++) {
//
//
//            if ( arrA[i] == 1 && arrB[i] == 2) {
//                answer[i] = 'B';
//            } else if ( arrA[i] == 1 && arrB[i] == 3){
//                answer[i] = 'A';
//            } else if ( arrA[i] == 2 && arrB[i] == 1){
//                answer[i] = 'A';
//            } else if ( arrA[i] == 2 && arrB[i] == 3){
//                answer[i] = 'B';
//            } else if ( arrA[i] == 3 && arrB[i] == 1){
//                answer[i] = 'B';
//            } else if(arrA[i] == arrB[i]) {
//                answer[i] = 'D';
//            }else {
//                answer[i] = 'A';
//            }
//        }
//
//        return answer;
//    }
    public String solution(int num, int[] arrA, int[] arrB){
        String answer = "";

        for (int i = 0; i < num; i++) {
            if(arrA[i] == arrB[i]) {
                answer += "D";
            } else if (arrA[i] ==1 && arrB[i]==3) {
                answer += "A";
            } else if (arrA[i] ==2 && arrB[i]==1) {
                answer += "A";
            } else if (arrA[i] ==3 && arrB[i]==2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Array03 array03 = new Array03();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arrA = new int[num];
        int[] arrB = new int[num];
        for (int i = 0; i < num; i++){
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++){
            arrB[i] = sc.nextInt();
        }

//        for(char x : array03.solution(num, arrA, arrB)){
//            System.out.println(x);
//        }

        for(char x : array03.solution(num, arrA, arrB).toCharArray()) {
            System.out.println(x);
        }

    }
}
