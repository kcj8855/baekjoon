package Baekjoon.Chapter3;

import java.util.Scanner;

/**
 * Created by CJdesktop on 2017-07-09.
 *
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */
public class Prob3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 1; i < 10 ; i++) {
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
