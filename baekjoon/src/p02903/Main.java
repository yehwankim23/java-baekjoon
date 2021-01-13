package p02903;

// 주소: https://www.acmicpc.net/problem/2903
// 제목: 중앙 이동 알고리즘
// 결과: 맞았습니다!!
// 메모리: 12844 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println((int) Math.pow(Math.pow(2, N) + 1, 2));
    }
}
