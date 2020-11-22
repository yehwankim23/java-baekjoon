package l01.p02845;

// 주소: https://www.acmicpc.net/problem/2845
// 제목: 파티가 끝나고 난 뒤
// 결과: 맞았습니다!!
// 메모리: 12956 KB
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
        int LP;
        
        st = new StringTokenizer(br.readLine());
        LP = Integer.parseInt(st.nextToken())
                * Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        
        System.out.println((Integer.parseInt(st.nextToken()) - LP) + " "
                + (Integer.parseInt(st.nextToken()) - LP) + " "
                + (Integer.parseInt(st.nextToken()) - LP) + " "
                + (Integer.parseInt(st.nextToken()) - LP) + " "
                + (Integer.parseInt(st.nextToken()) - LP));
    }
}
