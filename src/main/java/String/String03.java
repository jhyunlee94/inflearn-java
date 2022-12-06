package String;

import java.util.Scanner;
//3. 문장 속 단어
public class String03 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos; // 가장 작은값으로 초기화
        // ' ' 를 만나면 해당 인덱스 값을 반환
        // substring으로 0번째부터 ' ' 반환한 인덱스까지
//        while((pos = str.indexOf(' ')) != -1){
//            String tmp = str.substring(0, pos);
//            int len = tmp.length();
//            if(len > m) {
//                m = len;
//                answer = tmp;
//            }
//            str = str.substring(pos+1);
//        }
//        // indexOf, substring 했을때는 마지막 단어 무조건 처리해줘야합니다.
//        if(str.length()>m) answer = str;

        String[] temp = str.split(" ");
        for(String x : temp) {
            int len = x.length();
            if(len > m){
                m = len;
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String03 T = new String03();

        // 문장일때는 nextLine 으로
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
