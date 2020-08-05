package javaCode;

import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 异或
 * @Date: 2020/8/5 21:12
 */
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String a=scanner.next();
        String b=scanner.next();
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        for (int i=0;i<num;i++){
            if(a1[i]!=b1[i])
                a1[i]='1';
            else
                a1[i]='0';
        }
        int sum=0;
        for (int i=0;i<a1.length;i++){
            int now=Integer.parseInt(String.valueOf(a1[i]));
            sum+=Math.pow(2,num-1)*now;
            num--;
        }
        System.out.println(sum);
    }
}
