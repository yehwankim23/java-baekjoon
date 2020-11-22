package l03.p06378;

// 주소: https://www.acmicpc.net/problem/6378
// 제목: 디지털 루트
// 결과: 맞았습니다!!
// 메모리: 11376 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String n;
        StringBuilder sb = new StringBuilder();
        
        while (!(n = br.readLine()).equals("0")) {
            int l = n.length(), sum = 0;
            
            for (int i = 0; i < l; i++) {
                sum += n.charAt(i) - '0';
            }
            
            while (sum > 9) {
                n = Integer.toString(sum);
                l = n.length();
                sum = 0;
                
                for (int i = 0; i < l; i++) {
                    sum += n.charAt(i) - '0';
                }
            }
            
            sb.append(sum).append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
