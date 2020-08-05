package Main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description:
 * @Date: 2020/7/31 13:51
 */
public class Main {
    public static int sum=0;
    public static void main(String[] args) {
        int[] value = new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            value[i] = scanner.nextInt();
        }
        int pay=scanner.nextInt();
        int i=getSum(value,pay);
        if(i==0){
            System.out.println(-1);
        }
        else
            System.out.println(sum);

    }
    public static int getSum(int[] money,int pay){
        int num=0;
        int balance=0;
        num=pay/100;
        if(num>money[4]){
            balance=pay%100+(num-money[4])*100;
            sum+=money[4];
        }
        else{
            sum+=pay/100;
            balance=pay%100;
        }
        num=balance/50;
        if(num>money[3]){
            balance=pay%50+(num-money[3])*50;
            sum+=money[3];
        }
        else{
            sum+=balance/50;
            balance=balance%50;
        }
        num=balance/10;
        if(num>money[2]){
            balance=pay%10+(num-money[2])*10;
            sum+=money[2];
        }
        else{
            sum+=balance/10;
            balance=balance%10;
        }
        num=balance/5;
        if(num>money[1]){
            balance=pay%5+(num-money[1])*5;
            sum+=money[1];
        }
        else{
            sum+=balance/5;
            balance=balance%5;
        }
        num=balance/1;
        if(num>money[0]){
           return 0;
        }
        else{
            sum+=num;
            return 1;
        }
    }
}
