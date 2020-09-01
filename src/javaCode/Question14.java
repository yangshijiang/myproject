package javaCode;

import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 数列求和
 * @Date: 2020/8/6 19:37
 */
public class Question14 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        float sum=0;
        for (int i = 1; i <=n; i++) {
            sum+=Double.parseDouble("1")/(5*(2*i-1))-Double.parseDouble("1")/(5*2*i);
        }
        System.out.println(String.format("%.4f",sum));
    }
}
