package p01427;

// 주소: https://www.acmicpc.net/problem/1427
// 제목: 소트인사이드
// 결과: 맞았습니다!!
// 메모리: 12996 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String string;
        Integer[] arr;
        
        string = br.readLine();
        br.close();
        arr = new Integer[string.length()];
        
        for (int i = 0; i < string.length(); i++) {
            arr[i] = string.charAt(i) - '0';
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i = 0; i < string.length(); i++) {
            System.out.print(arr[i]);
        }
    }
}
