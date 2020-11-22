package l02.p17388;

// 주소: https://www.acmicpc.net/problem/17388
// 제목: 와글와글 숭고한
// 결과: 맞았습니다!!
// 메모리: 12948 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int S = Integer.parseInt(st.nextToken()),
                K = Integer.parseInt(st.nextToken()),
                H = Integer.parseInt(st.nextToken());
        
        if (S + K + H >= 100) {
            System.out.println("OK");
        } else {
            int min = Math.min(Math.min(S, K), H);
            
            if (min == S) {
                System.out.println("Soongsil");
            } else if (min == K) {
                System.out.println("Korea");
            } else if (min == H) {
                System.out.println("Hanyang");
            }
        }
    }
}
