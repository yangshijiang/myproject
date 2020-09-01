package javaCode;

import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 回文素数
 * @Date: 2020/8/6 19:50
 */
public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int sum = 0;
        for (int i = N; i <= M; i++) {
            if (i < 10)
                continue;
            String s = String.valueOf(i);
            String[] s1 = s.split("");
            String value =new String("");
            for (int j = 0; j < s1.length; j++) {
                String t=s1[j];
                s1[j] = "#";
                int flag=0;
                for (int k = 0; k < s1.length; k++) {
                    if (!s1[k].equals("#")) {
                        if(s1[k].equals("0")&&flag==1)
                             value += s1[k];
                        if(!s1[k].equals("0")){
                            value += s1[k];
                            flag=1;
                        }
                    }
                }
                if (!value.equals("")) {
                    int value1 = Integer.parseInt(value);
                    if (iscfm(value1)){
                        System.out.println(i+" "+(sum+1));
                        sum++;
                        break;
                    }

                }
                s1[j]=t;
                value="";
            }

        }
        System.out.println(sum);

    }

    public static boolean iscfm(int i) {
        if (i > 5) {
            if (i%2==0)
                return false;
            else {
                int isPrime=1;
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if (i%j==0){
                        isPrime=0;
                        break;
                    }
                }
                if (isPrime==1){
                    String sOld = String.valueOf(i);
                    String[] s = sOld.split("");
                    for (int j = 0; j < s.length / 2; j++) {
                        if (!(s[j].equals(s[s.length - j - 1]))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } else if (i != 4||i!=1) {
            return true;
        }
        return false;
    }
}