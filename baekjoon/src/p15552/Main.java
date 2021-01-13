package p15552;

// 주소: https://www.acmicpc.net/problem/15552
// 제목: 빠른 A+B
// 결과: 맞았습니다!!
// 메모리: 260600 KB
// 시간: 756 ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringTokenizer stringTokenizer;
        OutputStreamWriter outputStreamWriter
                = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        int T, sum;
        String input;
        
        T = Integer.parseInt(bufferedReader.readLine());
        sum = 0;
        
        for (int i = 0; i < T; i++, sum = 0) {
            input = bufferedReader.readLine();
            stringTokenizer = new StringTokenizer(input);
            
            sum += Integer.parseInt(stringTokenizer.nextToken());
            sum += Integer.parseInt(stringTokenizer.nextToken());
            
            bufferedWriter.write(sum + "\n");
        }
        
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
