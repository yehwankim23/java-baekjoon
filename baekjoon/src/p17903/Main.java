package p17903;

// 주소: https://www.acmicpc.net/problem/17903
// 제목: Counting Clauses
// 결과: 맞았습니다!!
// 메모리: 12968 KB
// 시간: 88 ms

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
        int m = Integer.parseInt(st.nextToken());
        
        System.out.println(m >= 8 ? "satisfactory" : "unsatisfactory");
    }
}
