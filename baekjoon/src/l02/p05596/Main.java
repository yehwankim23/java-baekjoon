package l02.p05596;

// 주소: https://www.acmicpc.net/problem/5596
// 제목: 시험 점수
// 결과: 맞았습니다!!
// 메모리: 12940 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        br.close();
        
        System.out.println(Math.max(
                Integer.parseInt(st1.nextToken())
                        + Integer.parseInt(st1.nextToken())
                        + Integer.parseInt(st1.nextToken())
                        + Integer.parseInt(st1.nextToken()),
                Integer.parseInt(st2.nextToken())
                        + Integer.parseInt(st2.nextToken())
                        + Integer.parseInt(st2.nextToken())
                        + Integer.parseInt(st2.nextToken())));
    }
}
