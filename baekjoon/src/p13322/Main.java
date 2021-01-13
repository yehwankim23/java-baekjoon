package p13322;

// 주소: https://www.acmicpc.net/problem/13322
// 제목: 접두사 배열
// 결과: 맞았습니다!!
// 메모리: 19700 KB
// 시간: 204 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        br.close();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < S.length(); i++) {
            sb.append(i).append("\n");
        }
        
        System.out.print(sb);
    }
}
