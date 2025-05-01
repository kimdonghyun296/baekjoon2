package q2346;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] ary = new int[num1];
        int[] result = new int[num1];
        boolean[] popped = new boolean[num1];

        for (int i = 0; i < num1; i++) {
            ary[i] = sc.nextInt();
        }
        sc.close();

        int current = 0;
        for (int i = 0; i < num1; i++) {
            result[i] = current + 1;
            popped[current] = true;
            int move = ary[current];

            if (i == num1 - 1) {
                break;
            }

            int count = 0;
            if (move > 0) {
                while (count < move) {
                    current = (current + 1) % num1;
                    if (!popped[current]) {
                        count++;
                    }
                }
            } else {
                while (count < Math.abs(move)) {
                    current = (current - 1 + num1) % num1;
                    if (!popped[current]) {
                        count++;
                    }
                }
            }
        }

        for (int i = 0; i < num1; i++) {
            System.out.printf("%d ", result[i]);
        }
    }
}