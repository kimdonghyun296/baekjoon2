package q2941;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;

        sc.close();

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length()) { // 다음 문자 존재 여부 확인
                if (str.charAt(i) == 'c' && (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
                    count++;
                    i++; // 2개 문자 처리했으므로 i 증가
                    continue;
                }
                if (str.charAt(i) == 'd') {
                    if (str.charAt(i + 1) == '-') {
                        count++;
                        i++;
                        continue;
                    } else if (i + 2 < str.length() && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                        count++;
                        i += 2; // "dz="를 하나로 처리했으므로 i를 2 증가
                        continue;
                    }
                }
                if ((str.charAt(i) == 'l' || str.charAt(i) == 'n') && str.charAt(i + 1) == 'j') {
                    count++;
                    i++;
                    continue;
                }
                if ((str.charAt(i) == 's' || str.charAt(i) == 'z') && str.charAt(i + 1) == '=') {
                    count++;
                    i++;
                    continue;
                }
            }
            count++; // 위 조건에 해당하지 않는 문자라면 그냥 카운트
        }

        System.out.println(count);
    }
}
