package p02506;

// 주소: https://www.acmicpc.net/problem/2506
// 제목: 점수계산
// 결과: 맞았습니다!!
// 메모리: 13012 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), sum = 0, count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        while (N-- > 0) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                sum += ++count;
            } else {
                count = 0;
            }
        }
        
        System.out.println(sum);
    }
}
