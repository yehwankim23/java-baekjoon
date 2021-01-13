package p10989;

// 주소: https://www.acmicpc.net/problem/10989
// 제목: 수 정렬하기 3
// 결과: 맞았습니다!!
// 메모리: 511032 KB
// 시간: 2268 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int N;
        int[] arr;
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        br.close();
        Arrays.sort(arr);
        
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        
        System.out.print(sb);
    }
}
