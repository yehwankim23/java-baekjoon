package p08723;

// 주소: https://www.acmicpc.net/problem/8723
// 제목: Patyki
// 결과: 맞았습니다!!
// 메모리: 20140 KB
// 시간: 260 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().split("\\s")).map(String::trim)
                .mapToInt(Integer::parseInt).toArray();
        br.close();
        
        Arrays.sort(a);
        
        System.out.println(a[0] == a[1] && a[0] == a[2] ? 2
                : a[0] * a[0] + a[1] * a[1] == a[2] * a[2] ? 1 : 0);
    }
}
