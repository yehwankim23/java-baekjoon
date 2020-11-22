package l02.p15059;

// 주소: https://www.acmicpc.net/problem/15059
// 제목: Hard choice
// 결과: 맞았습니다!!
// 메모리: 12968 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine()),
                st2 = new StringTokenizer(br.readLine());
        br.close();
        int C = Integer.parseInt(st2.nextToken())
                - Integer.parseInt(st1.nextToken()),
                B = Integer.parseInt(st2.nextToken())
                        - Integer.parseInt(st1.nextToken()),
                P = Integer.parseInt(st2.nextToken())
                        - Integer.parseInt(st1.nextToken());
        
        System.out.println((C > 0 ? Math.abs(C) : 0) + (B > 0 ? Math.abs(B) : 0)
                + (P > 0 ? Math.abs(P) : 0));
    }
}
