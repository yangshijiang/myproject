package javaCode;

import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 分堆
 * @Date: 2020/8/5 21:45
 */
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int num=n/k;
        int a=n%k;
        while(true){
            if(n<k)
                break;
            if(num/2<a) {
                if(num%2==0){
                    if((a-num/2)>k+1)
                        System.out.println(num+1);
                    else
                        System.out.println(num);
                }
                else
                    if((a-num/2)>k)
                        System.out.println(num+1);
                    else
                        System.out.println(num);
                break;
            }
            else {
               num--;
               a+=k;
            }
        }
    }
}
