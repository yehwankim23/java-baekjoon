package l02.p16693;

// 주소: https://www.acmicpc.net/problem/16693
// 제목: Pizza Deal
// 결과: 맞았습니다!!
// 메모리: 13044 KB
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
        
        System.out.println(Double.parseDouble(st1.nextToken())
                / Double.parseDouble(st1.nextToken())
                < Math.PI * Math.pow(Double.parseDouble(st2.nextToken()), 2)
                        / Double.parseDouble(st2.nextToken()) ? "Whole pizza"
                                : "Slice of pizza");
    }
}
