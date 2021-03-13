package p20499;

// 주소: https://www.acmicpc.net/problem/20499
// 제목: Darius님 한타 안 함?
// 결과: 맞았습니다!!
// 메모리: 11512 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "/");
        br.close();
        int K = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        
        System.out.println(K + A < D || D == 0 ? "hasu" : "gosu");
    }
}
