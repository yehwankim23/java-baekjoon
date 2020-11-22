package l06.p02751;

// 주소: https://www.acmicpc.net/problem/2751
// 제목: 수 정렬하기 2
// 결과: 맞았습니다!!
// 메모리: 215760 KB
// 시간: 1384 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        br.close();
        
        al.sort(null);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(al.get(i)).append("\n");
        }
        
        System.out.print(sb);
    }
}
