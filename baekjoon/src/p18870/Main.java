package p18870;

// 주소: https://www.acmicpc.net/problem/18870
// 제목: 좌표 압축
// 결과: 시간 초과
// 메모리: - KB
// 시간: - ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int[] arr = new int[n];
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            arr[i] = x;

            if (!al.contains(x)) {
                al.add(x);
            }
        }

        al.sort(null);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(al.indexOf(arr[i]) + " ");
        }

        System.out.println(sb);
    }
}
