package l02.p17863;

// 주소: https://www.acmicpc.net/problem/17863
// 제목: FYI
// 결과: 맞았습니다!!
// 메모리: 12872 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(
                Integer.parseInt(br.readLine()) / 10000 == 555 ? "YES" : "NO");
        br.close();
    }
}
