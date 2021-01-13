package p11282;

// 주소: https://www.acmicpc.net/problem/11282
// 제목: 한글
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
        
        System.out.println((char) (Integer.parseInt(br.readLine()) + 44031));
        br.close();
    }
}
