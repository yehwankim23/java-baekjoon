package l02.p02752;

// 주소: https://www.acmicpc.net/problem/2752
// 제목: 세수정렬
// 결과: 맞았습니다!!
// 메모리: 13000 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[3];
        
        st = new StringTokenizer(br.readLine());
        br.close();
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);
        
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
