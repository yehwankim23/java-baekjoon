package l03.p11921;

// 주소: https://www.acmicpc.net/problem/11921
// 제목: 0.1
// 결과: 5점
// 메모리: 15500 KB
// 시간: 100 ms

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[2000000];
        System.in.read(buffer, 0, 2000000);
        int index = 8;
        long sum = 0;
        
        for (int i = 0, n = 0, b; i < 250000; i++, n = 0) {
            while ((b = buffer[index++]) != 10) {
                n *= 10;
                n += b - 48;
            }
            
            sum += n;
        }
        
        buffer[0] = '2';
        buffer[1] = '5';
        buffer[2] = '0';
        buffer[3] = '0';
        buffer[4] = '0';
        buffer[5] = '0';
        buffer[6] = '\n';
        index = 0;
        
        while (sum > 0) {
            buffer[20 + index++] = (byte) (sum % 10 + 48);
            sum /= 10;
        }
        
        for (int i = 0; i < index; i++) {
            buffer[7 + i] = buffer[19 + index - i];
        }
        
        System.out.write(buffer, 0, 7 + index);
    }
}
