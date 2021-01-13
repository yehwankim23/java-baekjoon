package p02902;

// 주소: https://www.acmicpc.net/problem/2902
// 제목: KMP는 왜 KMP일까?
// 결과: 맞았습니다!!
// 메모리: 11600 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(br.readLine().replaceAll("[^A-Z]", ""));
        br.close();
    }
}
