package p01934;

// 주소: https://www.acmicpc.net/problem/1934
// 제목: 최소공배수
// 결과: 맞았습니다!!
// 메모리: 14548 KB
// 시간: 152 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int ab = a * b;

            if (a < b) {
                int temp = a;
                a = b;
                b = temp;
            }

            for (int r = a % b; r > 0; r = a % b) {
                a = b;
                b = r;
            }

            sb.append(ab / b).append("\n");
        }

        br.close();
        System.out.print(sb);
    }
}
