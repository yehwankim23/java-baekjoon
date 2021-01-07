package l03.p11921;

// 주소: https://www.acmicpc.net/problem/11921
// 제목: 0.1
// 결과: 7.5점
// 메모리: 18920 KB
// 시간: 100 ms

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[3750000];
        System.in.read(buffer, 0, 3750000);
        int i = 0, temp = 0, index = 8;
        byte b;
        long sum = 0;
        
        while (i++ < 375000) {
            temp = buffer[index++] - 48;
            
            while ((b = buffer[index++]) != '\n') {
                temp *= 10;
                temp += b - 48;
            }
            
            sum += temp;
        }
        
        buffer[0] = '3';
        buffer[1] = '7';
        buffer[2] = '5';
        buffer[3] = '0';
        buffer[4] = '0';
        buffer[5] = '0';
        buffer[6] = '\n';
        temp = 25;
        
        while (sum > 0) {
            buffer[temp++] = (byte) (sum % 10 + 48);
            sum /= 10;
        }
        
        index = 7;
        
        while (temp-- > 25) {
            buffer[index++] = buffer[temp];
        }
        
        System.out.write(buffer, 0, index);
    }
}
