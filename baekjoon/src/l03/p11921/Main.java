package l03.p11921;

// 주소: https://www.acmicpc.net/problem/11921
// 제목: 0.1
// 결과: 틀렸습니다
// 메모리: - KB
// 시간: - ms

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    private static BufferedInputStream bis = new BufferedInputStream(System.in);
    private static BufferedWriter bw
            = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        readInt();
        int n = 7500;
        long sum = 0;
        
        // FIXME - 0.1
        for (int i = 0; i < n; i++) {
            sum += readInt();
        }
        
        bw.write(Integer.toString(n));
        bw.newLine();
        bw.write(Long.toString(sum));
        bw.flush();
    }
    
    private static int readInt() throws IOException {
        int value = 0;
        
        for (int data = bis.read(); data > 47; data = bis.read()) {
            value = value * 10 + data - 48;
        }
        
        bis.read();
        return value;
    }
}
