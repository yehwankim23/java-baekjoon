package p15964;

// 주소: https://www.acmicpc.net/problem/15964
// 제목: 이상한 기호
// 결과: 100점
// 메모리: 12996 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        long A, B;
        
        st = new StringTokenizer(br.readLine());
        br.close();
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        
        System.out.println((A + B) * (A - B));
    }
}
