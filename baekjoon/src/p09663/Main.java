package p09663;

// 주소: https://www.acmicpc.net/problem/9663
// 제목: N-Queen
// 결과: 메모리 초과
// 메모리: - KB
// 시간: - ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
        long start = System.nanoTime();
        
        // FIXME - N-Queen
        System.out.println(backtrack(new boolean[n][n], 0, 1));
        
        long end = System.nanoTime();
        System.out.println((end - start) / 1000000 + " ms");
    }
    
    private static int backtrack(boolean[][] board, int index, int queen) {
        int count = 0;
        
        for (int i = index; i < n * n; i++) {
            int row = i / n, column = i % n;
            
            if (!board[row][column]) {
                if (queen == n) {
                    count++;
                } else {
                    boolean[][] copy = new boolean[n][n];
                    
                    for (int j = 0; j < n; j++) {
                        copy[j] = Arrays.copyOf(board[j], n);
                    }
                    
                    for (int j = 0; j < n; j++) {
                        copy[row][j] = true;
                        copy[j][column] = true;
                        
                        try {
                            copy[row - column + j][j] = true;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            //
                        }
                        
                        try {
                            copy[j][column + row - j] = true;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            //
                        }
                    }
                    
                    count += backtrack(copy, i + 1, queen + 1);
                }
            }
        }
        
        return count;
    }
}
