package l04.p10808;

// 주소: https://www.acmicpc.net/problem/10808
// 제목: 알파벳 개수
// 결과: 맞았습니다!!
// 메모리: 11500 KB
// 시간: 72 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        int[] arr = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}
