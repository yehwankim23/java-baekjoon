package l07.p10828;

// 주소: https://www.acmicpc.net/problem/10828
// 제목: 스택
// 결과: 맞았습니다!!
// 메모리: 18888 KB
// 시간: 272 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        IntStack intStack = new IntStack();
        int N;
        
        N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            switch (st.nextToken()) {
                case "push":
                    intStack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(intStack.pop());
                    break;
                case "size":
                    System.out.println(intStack.getSize());
                    break;
                case "empty":
                    if (intStack.getSize() == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "top":
                    System.out.println(intStack.getTop());
                    break;
                default:
                    break;
            }
        }
    }
}
