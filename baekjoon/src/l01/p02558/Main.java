package l01.p02558;

// 주소: https://www.acmicpc.net/problem/2558
// 제목: A+B - 2
// 결과: 맞았습니다!!
// 메모리: 12940 KB
// 시간: 88 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(Integer.parseInt(br.readLine())
                + Integer.parseInt(br.readLine()));
        br.close();
    }
}
