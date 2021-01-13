package p11650;

// 주소: https://www.acmicpc.net/problem/11650
// 제목: 좌표 정렬하기
// 결과: 맞았습니다!!
// 메모리: 78072 KB
// 시간: 740 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), xi, yi;
        StringTokenizer st;
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        Object[] keySet;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            xi = Integer.parseInt(st.nextToken());
            yi = Integer.parseInt(st.nextToken());
            
            if (!hm.containsKey(xi)) {
                hm.put(xi, new ArrayList<Integer>());
            }
            
            hm.get(xi).add(yi);
        }
        br.close();
        keySet = hm.keySet().toArray();
        Arrays.sort(keySet);
        for (Object i : keySet) {
            hm.get(i).sort(null);
            
            for (int j : hm.get(i)) {
                sb.append(i).append(" ").append(j).append("\n");
            }
        }
        System.out.print(sb);
    }
}
