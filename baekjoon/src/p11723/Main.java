package p11723;

// 주소: https://www.acmicpc.net/problem/11723
// 제목: 집합
// 결과: 맞았습니다!!
// 메모리: 281556 KB
// 시간: 992 ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw
                = new BufferedWriter(new OutputStreamWriter(System.out));
        int M;
        StringTokenizer st;
        boolean[] arr = new boolean[20];
        boolean[] all = { true, true, true, true, true, true, true, true, true,
                true, true, true, true, true, true, true, true, true, true,
                true };
        boolean[] empty = { false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false,
                false, false, false, false };
        
        M = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "add":
                    arr[Integer.parseInt(st.nextToken()) - 1] = true;
                    break;
                case "remove":
                    arr[Integer.parseInt(st.nextToken()) - 1] = false;
                    break;
                case "check":
                    if (arr[Integer.parseInt(st.nextToken()) - 1]) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "toggle":
                    int temp = Integer.parseInt(st.nextToken()) - 1;
                    arr[temp] = !arr[temp];
                    break;
                case "all":
                    arr = all;
                    break;
                case "empty":
                    arr = empty;
                    break;
                default:
                    break;
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
