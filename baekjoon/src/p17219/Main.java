package p17219;

// 주소: https://www.acmicpc.net/problem/17219
// 제목: 비밀번호 찾기
// 결과: 맞았습니다!!
// 메모리: 75776 KB
// 시간: 640 ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N, M;
        HashMap<String, String> hm = new HashMap<String, String>();
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            hm.put(st.nextToken(), st.nextToken());
        }
        
        for (int i = 0; i < M; i++) {
            bw.write(hm.get(br.readLine()) + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
