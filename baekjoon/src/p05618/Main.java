package p05618;

// 주소: https://www.acmicpc.net/problem/5618
// 제목: 공약수
// 결과: 맞았습니다!!
// 메모리: 12080 KB
// 시간: 532 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            
            if (temp < min) {
                min = temp;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= min; i++) {
            boolean b = true;
            
            for (int j : arr) {
                if (j % i != 0) {
                    b = false;
                    break;
                }
            }
            
            if (b) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
