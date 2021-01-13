package p05063;

// 주소: https://www.acmicpc.net/problem/5063
// 제목: TGN
// 결과: 맞았습니다!!
// 메모리: 12852 KB
// 시간: 72 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), r, e, c;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            
            sb.append(r < e - c ? "advertise" : r > e - c ? "do not advertise"
                    : "does not matter").append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
