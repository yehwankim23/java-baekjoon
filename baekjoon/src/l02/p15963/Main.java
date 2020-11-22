package l02.p15963;

// 주소: https://www.acmicpc.net/problem/15963
// 제목: CASIO
// 결과: 맞았습니다!!
// 메모리: 12952 KB
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
        br.close();
        
        System.out.println(st.nextToken().equals(st.nextToken()) ? 1 : 0);
    }
}
