//小易的英语软件
package com.wangyi;
import java.util.Scanner;
public class Main1 {
    public static double percent(int[] pre, int[] grades, int id) {
        int grade = grades[id];
        int count = pre[grade];
        double numOfstu = grades.length;
        double per = (count-1) / numOfstu *100;
        return per;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int q;
        while (sc.hasNextLine()) {
            n = sc.nextInt();
            int[] grades = new int[n];
            int[] bucket = new int[151];
            int[] pre = new int[151];
            for (int i = 0; i < n; i++) {
                grades[i] = sc.nextInt();
                bucket[grades[i]] += 1;
            }
            q = sc.nextInt();
            pre[0] = bucket[0];
            for (int i = 1; i < 151; i++) {
                pre[i] = pre[i-1] + bucket[i];
            }
            for (int i = 0; i < q; i++) {
                int id = sc.nextInt();
                System.out.printf("%.6f%n", percent(pre, grades, id-1));
            }
        }
    }
}
