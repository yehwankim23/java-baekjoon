package l03.p11921;

// 주소: https://www.acmicpc.net/problem/11921
// 제목: 0.1
// 결과: 0.2점
// 메모리: 11692 KB
// 시간: 84 ms

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        byte[] buffer = new byte[100000];
        System.in.read(buffer, 0, buffer.length);
        int index = 8;
        long sum = 0;
        
        for (int i = 0, n = 0, b; i < 10000; i++, n = 0) {
            while ((b = buffer[index++]) != '\n') {
                n *= 10;
                n += b - '0';
            }
            
            sum += n;
        }
        
        bw.write("10000\n".concat(Long.toString(sum)));
        bw.flush();
    }
}
