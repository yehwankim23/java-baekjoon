package l03.p04153;

// 주소: https://www.acmicpc.net/problem/4153
// 제목: 직각삼각형
// 결과: 맞았습니다!!
// 메모리: 12928 KB
// 시간: 76 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<Integer>();
        StringTokenizer st;
        int input;
        
        while (true) {
            st = new StringTokenizer(br.readLine());
            input = Integer.parseInt(st.nextToken());
            
            if (input == 0) {
                break;
            }
            
            al.clear();
            al.add(input);
            al.add(Integer.parseInt(st.nextToken()));
            al.add(Integer.parseInt(st.nextToken()));
            al.sort(null);
            
            if (al.get(0) * al.get(0) + al.get(1) * al.get(1)
                    == al.get(2) * al.get(2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        
        br.close();
    }
}
