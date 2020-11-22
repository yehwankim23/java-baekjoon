package l03.p01085;

// 주소: https://www.acmicpc.net/problem/1085
// 제목: 직사각형에서 탈출
// 결과: 맞았습니다!!
// 메모리: 13060 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int x, y, w, h;
        
        st = new StringTokenizer(br.readLine());
        br.close();
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        
        bw.write(Math.min(Math.min(x, y), Math.min(w - x, h - y)) + "\n");
        bw.flush();
        bw.close();
    }
}
