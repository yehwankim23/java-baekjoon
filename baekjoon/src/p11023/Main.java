package p11023;

// 주소: https://www.acmicpc.net/problem/11023
// 제목: 더하기 3
// 결과: 맞았습니다!!
// 메모리: 13044 KB
// 시간: 84 ms

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
        int sum = 0;
        
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        
        System.out.println(sum);
    }
}
