package Array;

import java.util.Scanner;

public class Array05 {
    // input : 20
    // output : 8
    public int solution(int num) {
        int answer = 0;
        // check 할 변수
        int[] ch = new int[num+1];
        for(int i = 2; i<=num; i++){
            if(ch[i]==0){
                answer++;
                for(int j = i; j <=num; j=j+i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Array05 array05 = new Array05();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(array05.solution(num));
    }
}
