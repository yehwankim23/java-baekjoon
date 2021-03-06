package p13866;

// 주소: https://www.acmicpc.net/problem/13866
// 제목: 팀 나누기
// 결과: 맞았습니다!!
// 메모리: 13032 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] arr = { Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()) };
        
        Arrays.sort(arr);
        System.out.println(Math.abs(arr[0] - arr[1] - arr[2] + arr[3]));
    }
}
