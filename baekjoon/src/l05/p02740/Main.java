package l05.p02740;

// 주소: https://www.acmicpc.net/problem/2740
// 제목: 행렬 곱셈
// 결과: 맞았습니다!!
// 메모리: 16632 KB
// 시간: 144 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),
                M = Integer.parseInt(st.nextToken()), K, E;
        int[][] A = new int[N][M], B;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        st = new StringTokenizer(br.readLine());
        st.nextToken();
        K = Integer.parseInt(st.nextToken());
        B = new int[M][K];
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < K; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                E = 0;
                
                for (int k = 0; k < M; k++) {
                    E += A[i][k] * B[k][j];
                }
                
                sb.append(E).append(" ");
            }
            
            sb.append("\n");
        }
        
        br.close();
        System.out.print(sb);
    }
}
