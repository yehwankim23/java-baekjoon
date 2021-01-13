package p01159;

// 주소: https://www.acmicpc.net/problem/1159
// 제목: 농구 경기
// 결과: 맞았습니다!!
// 메모리: 11572 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        
        while (n-- > 0) {
            arr[br.readLine().charAt(0) - 97]++;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean b = false;
        
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                sb.append((char) (i + 97));
                b = true;
            }
        }
        
        br.close();
        System.out.println(b ? sb : "PREDAJA");
    }
}
