package l01.p11654;

// 주소: https://www.acmicpc.net/problem/11654
// 제목: 아스키 코드
// 결과: 맞았습니다!!
// 메모리: 12640 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println((int) br.readLine().charAt(0));
    }
}
