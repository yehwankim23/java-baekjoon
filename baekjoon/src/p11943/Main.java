package p11943;

// 주소: https://www.acmicpc.net/problem/11943
// 제목: 파일 옮기기
// 결과: 맞았습니다!!
// 메모리: 12972 KB
// 시간: 80 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        B += Integer.parseInt(st.nextToken());
        A += Integer.parseInt(st.nextToken());
        
        System.out.println(Math.min(A, B));
    }
}
