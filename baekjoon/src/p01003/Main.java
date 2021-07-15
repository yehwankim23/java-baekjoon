package p01003;

// 주소: https://www.acmicpc.net/problem/1003
// 제목: 피보나치 함수
// 결과: 시간 초과
// 메모리: - KB
// 시간: - ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int zero;
    private static int one;

    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            zero = 0;
            one = 0;

            fibonacci(n);

            sb.append(zero).append(" ").append(one).append("\n");
        }

        br.close();
        System.out.print(sb);
    }

    private static void fibonacci(int n) {
        if (n == 0) {
            zero++;
            return;
        } else if (n == 1) {
            one++;
            return;
        } else {
            fibonacci(n - 1);
            fibonacci(n - 2);
        }
    }
}
