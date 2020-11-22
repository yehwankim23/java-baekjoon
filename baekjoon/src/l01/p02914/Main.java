package l01.p02914;

// 주소: https://www.acmicpc.net/problem/2914
// 제목: 저작권
// 결과: 맞았습니다!!
// 메모리: 12916 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        br.close();
        
        System.out.println(Integer.parseInt(st.nextToken())
                * (Integer.parseInt(st.nextToken()) - 1) + 1);
    }
}
