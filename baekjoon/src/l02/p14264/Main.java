package l02.p14264;

// 주소: https://www.acmicpc.net/problem/14264
// 제목: 정육각형과 삼각형
// 결과: 맞았습니다!!
// 메모리: 13076 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(Math.pow(Double.parseDouble(br.readLine()), 2)
                * Math.sin(Math.toRadians(120)) / 2);
        br.close();
    }
}
