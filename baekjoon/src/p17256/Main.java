package p17256;

// 주소: https://www.acmicpc.net/problem/17256
// 제목: 달달함이 넘쳐흘러
// 결과: 맞았습니다!!
// 메모리: 12932 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int ax, ay, az, cx, cy, cz;
        
        st = new StringTokenizer(br.readLine());
        ax = Integer.parseInt(st.nextToken());
        ay = Integer.parseInt(st.nextToken());
        az = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        cx = Integer.parseInt(st.nextToken());
        cy = Integer.parseInt(st.nextToken());
        cz = Integer.parseInt(st.nextToken());
        
        System.out.println((cx - az) + " " + (cy / ay) + " " + (cz - ax));
    }
}
