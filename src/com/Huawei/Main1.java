//老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩.
package com.Huawei;

import java.util.Scanner;
public class Main1 {
    public static int maxGrade(int[] grades, int a, int b) {
        int left = a;
        int right = b;
        if (left > right) {
            left = b;
            right = a;
        }
        int max = grades[left];
        for (int i = left+1; i <= right ; i++) {
            if (grades[i] > max)
                max = grades[i];
        }
        return max;
    }
    public static void updateGrade(int[] grades, int a, int b) {
        grades[a] = b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] grades = new int[n+1];
            for (int i = 1; i <= n; i++) {
                grades[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                String str = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (str.equals("Q"))
                    System.out.println(maxGrade(grades, a, b));
                else
                    updateGrade(grades, a, b);
            }
        }
    }
}