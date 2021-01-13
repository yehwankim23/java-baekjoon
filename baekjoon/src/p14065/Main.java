package p14065;

// 주소: https://www.acmicpc.net/problem/14065
// 제목: Gorivo
// 결과: 맞았습니다!!
// 메모리: 13076 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(100
                / (Double.parseDouble(br.readLine()) * 1.609344 / 3.785411784));
        br.close();
    }
}
