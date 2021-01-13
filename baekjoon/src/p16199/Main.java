package p16199;

// 주소: https://www.acmicpc.net/problem/16199
// 제목: 나이 계산하기
// 결과: 맞았습니다!!
// 메모리: 12992 KB
// 시간: 76 ms

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
        int y1 = Integer.parseInt(st1.nextToken()),
                m1 = Integer.parseInt(st1.nextToken()),
                d1 = Integer.parseInt(st1.nextToken()),
                y2 = Integer.parseInt(st2.nextToken()),
                m2 = Integer.parseInt(st2.nextToken()),
                d2 = Integer.parseInt(st2.nextToken());
        
        System.out.println(
                (m1 > m2 ? y2 - y1 - 1 : m1 == m2 && d1 > d2 ? y2 - y1 - 1
                        : y2 - y1) + "\n" + (y2 - y1 + 1) + "\n" + (y2 - y1));
    }
}
