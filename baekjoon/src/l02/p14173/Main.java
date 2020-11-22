package l02.p14173;

// 주소: https://www.acmicpc.net/problem/14173
// 제목: Square Pasture
// 결과: 맞았습니다!!
// 메모리: 12968 KB
// 시간: 72 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()),
                y1 = Integer.parseInt(st.nextToken()),
                x2 = Integer.parseInt(st.nextToken()),
                y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        x1 = Math.min(x1, Integer.parseInt(st.nextToken()));
        y1 = Math.min(y1, Integer.parseInt(st.nextToken()));
        x2 = Math.max(x2, Integer.parseInt(st.nextToken()));
        y2 = Math.max(y2, Integer.parseInt(st.nextToken()));
        
        System.out.println((int) Math.pow(Math.max(x2 - x1, y2 - y1), 2));
    }
}
