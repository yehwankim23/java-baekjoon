package p10845;

// 주소: https://www.acmicpc.net/problem/10845
// 제목: 큐
// 결과: 맞았습니다!!
// 메모리: 18932 KB
// 시간: 256 ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        IntQueue intQueue = new IntQueue();
        int N;
        
        N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            switch (st.nextToken()) {
                case "push":
                    intQueue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(intQueue.pop());
                    break;
                case "size":
                    System.out.println(intQueue.getSize());
                    break;
                case "empty":
                    if (intQueue.getSize() == 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                    break;
                case "front":
                    System.out.println(intQueue.getFront());
                    break;
                case "back":
                    System.out.println(intQueue.getBack());
                    break;
                default:
                    break;
            }
        }
    }
}
