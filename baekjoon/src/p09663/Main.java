package p09663;

// 주소: https://www.acmicpc.net/problem/9663
// 제목: N-Queen
// 결과: 맞았습니다!!
// 메모리: 12116 KB
// 시간: 5916 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int n;
    private static int[] board;
    private static int count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        board = new int[n];
        count = 0;
        
        backtrack(0);
        
        System.out.println(count);
    }
    
    private static void backtrack(int queen) {
        if (queen == n) {
            count++;
        } else {
            for (int column = 0; column < n; column++) {
                boolean valid = true;
                
                for (int row = 0; row < queen; row++) {
                    if (board[row] == column || Math.abs(queen - row)
                            == Math.abs(column - board[row])) {
                        valid = false;
                        break;
                    }
                }
                
                if (valid) {
                    board[queen] = column;
                    backtrack(queen + 1);
                }
            }
        }
    }
}
