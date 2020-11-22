package l08.p15652;

// 주소: https://www.acmicpc.net/problem/15652
// 제목: N과 M (4)
// 결과: 맞았습니다!!
// 메모리: 20032 KB
// 시간: 232 ms

import java.io.IOException;

public class Main {
    private static StringBuilder sb;
    private static int[] arr;
    
    public static void main(String[] args) throws IOException {
        int n = System.in.read() - 48;
        System.in.read();
        int m = System.in.read() - 48;
        
        sb = new StringBuilder();
        arr = new int[m];
        
        backtrack(n, m, 0);
        System.out.print(sb);
    }
    
    private static void backtrack(int n, int m, int index) {
        for (int i = 1; i <= n; i++) {
            boolean valid = true;
            
            for (int j = 0; j < index; j++) {
                if (i < arr[j]) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                arr[index] = i;
                
                if (index == m - 1) {
                    for (int j : arr) {
                        sb.append(Integer.toString(j).concat(" "));
                    }
                    
                    sb.append("\n");
                } else {
                    backtrack(n, m, index + 1);
                }
            }
        }
    }
}
