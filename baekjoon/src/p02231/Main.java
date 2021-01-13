package p02231;

// 주소: https://www.acmicpc.net/problem/2231
// 제목: 분해합
// 결과: 맞았습니다!!
// 메모리: 13008 KB
// 시간: 96 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N, M, sum;
        boolean isFound;
        
        N = Integer.parseInt(br.readLine());
        br.close();
        isFound = true;
        
        for (int i = 1; i <= N; i++) {
            M = i;
            sum = M;
            isFound = false;
            
            while (M > 0) {
                sum += M % 10;
                M /= 10;
            }
            
            if (sum == N) {
                isFound = true;
                System.out.println(i);
                break;
            }
        }
        
        if (!isFound) {
            System.out.println("0");
        }
    }
}
