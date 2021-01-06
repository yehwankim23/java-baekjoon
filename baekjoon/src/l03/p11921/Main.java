package l03.p11921;

// 주소: https://www.acmicpc.net/problem/11921
// 제목: 0.1
// 결과: 시간 초과
// 메모리: - KB
// 시간: - ms

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// FIXME - 0.1
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        byte[] buffer = new byte[10000000];
        System.in.read(buffer, 0, buffer.length);
        int index = 8;
        long sum = 0;
        
        for (int i = 0, n = 0, b; i < 1000000; i++, n = 0) {
            while ((b = buffer[index++]) != '\n') {
                n *= 10;
                n += b - '0';
            }
            
            sum += n;
        }
        
        bw.write("1000000\n".concat(Long.toString(sum)));
        bw.flush();
    }
}
