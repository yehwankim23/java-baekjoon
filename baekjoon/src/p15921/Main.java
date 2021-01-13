package p15921;

// 주소: https://www.acmicpc.net/problem/15921
// 제목: 수찬은 마린보이야!!
// 결과: 맞았습니다!!
// 메모리: 12916 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(Integer.parseInt(br.readLine()) == 0
                ? "divide by zero" : "1.00");
        br.close();
    }
}
