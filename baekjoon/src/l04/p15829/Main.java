package l04.p15829;

// 주소: https://www.acmicpc.net/problem/15829
// 제목: Hashing
// 결과: 100점
// 메모리: 13156 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int L;
        BigInteger hash, r, M;
        
        L = Integer.parseInt(br.readLine());
        hash = new BigInteger("0");
        r = new BigInteger("31");
        M = new BigInteger("1234567891");
        
        for (int i = 0; i < L; i++) {
            hash = hash.add(new BigInteger(Integer.toString(br.read() - '`'))
                    .multiply(r.pow(i)));
        }
        
        br.close();
        System.out.println(hash.mod(M));
        
    }
}
