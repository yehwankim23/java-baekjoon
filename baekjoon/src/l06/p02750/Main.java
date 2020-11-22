package l06.p02750;

// 주소: https://www.acmicpc.net/problem/2750
// 제목: 수 정렬하기
// 결과: 맞았습니다!!
// 메모리: 13788 KB
// 시간: 100 ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<Integer>();
        int N;
        
        N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        
        br.close();
        al.sort(null);
        
        for (int i = 0; i < N; i++) {
            bw.write(al.get(i) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
