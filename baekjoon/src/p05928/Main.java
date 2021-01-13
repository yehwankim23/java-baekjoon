package p05928;

// 주소: https://www.acmicpc.net/problem/5928
// 제목: Contest Timing
// 결과: 맞았습니다!!
// 메모리: 12944 KB
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
        int startTime = (11 * 24 + 11) * 60 + 11,
                endTime = (Integer.parseInt(st.nextToken()) * 24
                        + Integer.parseInt(st.nextToken())) * 60
                        + Integer.parseInt(st.nextToken());
        
        System.out.println(endTime < startTime ? -1 : endTime - startTime);
    }
}
