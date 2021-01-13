package p15873;

// 주소: https://www.acmicpc.net/problem/15873
// 제목: 공백 없는 A+B
// 결과: 맞았습니다!!
// 메모리: 12952 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String ab = br.readLine();
        br.close();
        
        System.out.println(
                ab.length() == 2 ? ab.charAt(0) - '0' + ab.charAt(1) - '0'
                        : ab.length() == 3
                                ? ab.charAt(1) == '0' ? ab.charAt(2) - '0' + 10
                                        : ab.charAt(0) - '0' + 10
                        : 20);
    }
}
