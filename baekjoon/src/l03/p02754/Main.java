package l03.p02754;

// 주소: https://www.acmicpc.net/problem/2754
// 제목: 학점계산
// 결과: 맞았습니다!!
// 메모리: 13052 KB
// 시간: 88 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine();
        br.close();
        
        switch (grade) {
            case "A+":
                System.out.println(4.3);
                break;
            case "A0":
                System.out.println(4.0);
                break;
            case "A-":
                System.out.println(3.7);
                break;
            case "B+":
                System.out.println(3.3);
                break;
            case "B0":
                System.out.println(3.0);
                break;
            case "B-":
                System.out.println(2.7);
                break;
            case "C+":
                System.out.println(2.3);
                break;
            case "C0":
                System.out.println(2.0);
                break;
            case "C-":
                System.out.println(1.7);
                break;
            case "D+":
                System.out.println(1.3);
                break;
            case "D0":
                System.out.println(1.0);
                break;
            case "D-":
                System.out.println(0.7);
                break;
            default:
                System.out.println(0.0);
                break;
        }
    }
}
