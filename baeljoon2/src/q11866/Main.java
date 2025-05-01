package q11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i); // 큐에 1부터 N까지의 사람들을 순서대로 넣음
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        while (!queue.isEmpty()) {
            // K-1번째 사람들을 큐의 뒤로 보냄
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }

            // K번째 사람을 제거하고 결과 문자열에 추가
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result);
    }
}
