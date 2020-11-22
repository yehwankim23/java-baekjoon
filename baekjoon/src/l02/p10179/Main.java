package l02.p10179;

// 주소: https://www.acmicpc.net/problem/10179
// 제목: 쿠폰
// 결과: 맞았습니다!!
// 메모리: 14132 KB
// 시간: 104 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("$0.00");
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(df.format(Double.parseDouble(br.readLine()) * 0.8))
                    .append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
