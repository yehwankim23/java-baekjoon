package p11283;

// 주소: https://www.acmicpc.net/problem/11283
// 제목: 한글 2
// 결과: 맞았습니다!!
// 메모리: 12952 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println((int) br.readLine().charAt(0) - 44031);
        br.close();
    }
}
