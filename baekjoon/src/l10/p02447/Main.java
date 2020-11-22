package l10.p02447;

// 주소: https://www.acmicpc.net/problem/2447
// 제목: 별 찍기 - 10
// 결과: 맞았습니다!!
// 메모리: 69988 KB
// 시간: 284 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        char[][] arr = new char[n][n];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }
        
        arr = drawStar(n, 0, 0, arr);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]);
            }
            
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
    
    private static char[][] drawStar(int n, int i, int j, char[][] arr) {
        if (n == 1) {
            arr[i][j] = '*';
        } else {
            n /= 3;
            
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    if (r != 1 || c != 1) {
                        arr = drawStar(n, i + n * r, j + n * c, arr);
                    }
                }
            }
        }
        
        return arr;
    }
}
