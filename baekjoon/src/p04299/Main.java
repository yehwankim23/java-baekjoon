package p04299;

// 주소: https://www.acmicpc.net/problem/4299
// 제목: AFC 윔블던
// 결과: 맞았습니다!!
// 메모리: 12936 KB
// 시간: 76 ms

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
        int s = Integer.parseInt(st.nextToken()),
                d = s - Integer.parseInt(st.nextToken());
        
        System.out.println(d >= 0 && d % 2 == 0 ? s - d / 2 + " " + d / 2 : -1);
    }
}
