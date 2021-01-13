package p14928;

// 주소: https://www.acmicpc.net/problem/14928
// 제목: 큰 수 (BIG)
// 결과: 맞았습니다!!
// 메모리: 21828 KB
// 시간: 176 ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        String N = br.readLine();
        br.close();
        long R = 0;
        
        for (int i = 0; i < N.length(); i++) {
            R = (R * 10 + (N.charAt(i) - '0')) % 20000303;
        }
        
        bw.write(Long.toString(R));
        bw.flush();
        bw.close();
    }
}
