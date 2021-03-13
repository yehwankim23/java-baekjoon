package p20492;

// 주소: https://www.acmicpc.net/problem/20492
// 제목: 세금
// 결과: 맞았습니다!!
// 메모리: 11508 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println((int) (n * 0.78) + " " + (int) (n * 0.956));
    }
}
