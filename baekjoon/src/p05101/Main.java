package p05101;

// 주소: https://www.acmicpc.net/problem/5101
// 제목: Sequences
// 결과: 맞았습니다!!
// 메모리: 12996 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()),
                diff = Integer.parseInt(st.nextToken()),
                value = Integer.parseInt(st.nextToken());
        
        while (!(start == 0 && diff == 0 && value == 0)) {
            System.out.println(start <= value && (value - start) % diff == 0
                    ? (value - start) / diff + 1 : "X");
            
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            diff = Integer.parseInt(st.nextToken());
            value = Integer.parseInt(st.nextToken());
        }
        br.close();
    }
}
