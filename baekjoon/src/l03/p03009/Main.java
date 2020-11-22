package l03.p03009;

// 주소: https://www.acmicpc.net/problem/3009
// 제목: 네 번째 점
// 결과: 맞았습니다!!
// 메모리: 13004 KB
// 시간: 80 ms

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
        int x1, x2, x3, y1, y2, y3;
        
        st = new StringTokenizer(br.readLine());
        x1 = Integer.parseInt(st.nextToken());
        y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        x2 = Integer.parseInt(st.nextToken());
        y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        x3 = Integer.parseInt(st.nextToken());
        y3 = Integer.parseInt(st.nextToken());
        
        if (x1 == x2) {
            x1 = x3;
        } else if (x1 == x3) {
            x1 = x2;
        }
        
        if (y1 == y2) {
            y1 = y3;
        } else if (y1 == y3) {
            y1 = y2;
        }
        
        bw.write(x1 + " " + y1 + "\n");
        bw.flush();
        bw.close();
    }
}
