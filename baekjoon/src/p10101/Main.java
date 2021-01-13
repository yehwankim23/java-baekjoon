package p10101;

// 주소: https://www.acmicpc.net/problem/10101
// 제목: 시험 점수
// 결과: 맞았습니다!!
// 메모리: 12780 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();
        
        if (A + B + C == 180) {
            if (A == 60 && B == 60 && C == 60) {
                System.out.println("Equilateral");
            } else if (A == B || A == C || B == C) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
