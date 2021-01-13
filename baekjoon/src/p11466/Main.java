package p11466;

// 주소: https://www.acmicpc.net/problem/11466
// 제목: Alex Origami Squares
// 결과: 맞았습니다!!
// 메모리: 13044 KB
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
        double h = Integer.parseInt(st.nextToken()),
                w = Integer.parseInt(st.nextToken());
        
        if (h > w) {
            double temp = h;
            h = w;
            w = temp;
        }
        
        System.out.println(h <= w / 3 ? h : h / 2 <= w / 3 ? w / 3 : h / 2);
    }
}
