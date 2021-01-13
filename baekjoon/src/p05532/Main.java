package p05532;

// 주소: https://www.acmicpc.net/problem/5532
// 제목: 방학 숙제
// 결과: 맞았습니다!!
// 메모리: 12908 KB
// 시간: 84 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        br.close();
        
        System.out.println(
                Math.min(L - ((A + C - 1) / C), L - ((B + D - 1) / D)));
    }
}
