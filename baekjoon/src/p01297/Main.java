package p01297;

// 주소: https://www.acmicpc.net/problem/1297
// 제목: TV 크기
// 결과: 맞았습니다!!
// 메모리: 13032 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        double x = Integer.parseInt(st.nextToken());
        double h = Integer.parseInt(st.nextToken());
        double w = Integer.parseInt(st.nextToken());
        
        x = Math.sqrt((x * x) / (h * h + w * w));
        
        System.out.println((int) (h * x) + " " + (int) (w * x));
    }
}
