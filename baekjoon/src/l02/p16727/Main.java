package l02.p16727;

// 주소: https://www.acmicpc.net/problem/16727
// 제목: ICPC
// 결과: 맞았습니다!!
// 메모리: 12976 KB
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
        int p1 = Integer.parseInt(st.nextToken()),
                s1 = Integer.parseInt(st.nextToken()), s2, p2;
        st = new StringTokenizer(br.readLine());
        br.close();
        s2 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());
        
        System.out.println(p1 + p2 > s1 + s2 ? "Persepolis"
                : p1 + p2 < s1 + s2 ? "Esteghlal" : p2 > s1 ? "Persepolis"
                : p2 < s1 ? "Esteghlal" : "Penalty");
    }
}
