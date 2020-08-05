package javaCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 备考
 * @Date: 2020/8/5 19:10
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int d=scanner.nextInt();
            int sumTime=scanner.nextInt();
            ArrayList<int[]>list=new ArrayList<int[]>();
            for (int i=0;i<d;i++){
                int[] exam=new int[2];
                exam[0]=scanner.nextInt();
                exam[1]=scanner.nextInt();
                exam[1]-=exam[0];
                sumTime-=exam[0];
                list.add(exam);
            }
            int[] time=new int[d];
            int flag=0;
            for (int i=0;i<list.size();i++){
                if(sumTime<0)
                    break;
                if(sumTime>list.get(i)[1]){
                    sumTime-=list.get(i)[1];
                    time[i]=(list.get(i)[1]);
                }
                else if(sumTime<=list.get(i)[1]){
                    time[i]=(sumTime);
                    flag=1;
                    break;
                }
            }
            if(flag==1) {
                System.out.println("Yes");
                for (int i = 0; i < time.length; i++) {
                    System.out.print(time[i]+list.get(i)[0]+" ");
                }
                System.out.print("\n");
            }
            else
                System.out.println("No");

        }

    }
}
