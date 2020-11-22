package l03.p03053;

// 주소: https://www.acmicpc.net/problem/3053
// 제목: 택시 기하학
// 결과: 맞았습니다!!
// 메모리: 14108 KB
// 시간: 104 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.000000");
        int R;
        
        R = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(df.format(Math.PI * R * R));
        System.out.println(df.format(2 * R * R));
    }
}
