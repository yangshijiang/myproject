package javaCode;

import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 小B最近对破解和程序攻击产生了兴趣，她迷上了病毒，然后可怕的事情就发生了。
 * 不知道什么原因，可能是小B的技术水平还不够高，小B编写的病毒程序在攻击一个服务器时出现了问题。
 * 尽管成功的侵入了服务器，但并没有按照期望的方式发挥作用。  小B的目的很简单:控制服务器的内存区域，
 * 试图在内存中装入从1到n之间的n个自然数，以覆盖内存区域。可能是小B对编程理解上的问题，病毒似乎没有完全成功。
 * 可能是由于保护机制的原因，内存写入只接受二进制的形式，所以十进制表达中除0和1之外的其他值都没有成功写入内存。
 * 小B希望知道，究竟有多少数成功的写入了服务器的内存！
 * @Date: 2020/8/7 11:35
 */
public class Question16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int num=scanner.nextInt();
            String str=String.valueOf(num);
            int sum=0;
            sum+=Math.pow(2,str.length()-1);
            String value="";
            for (int i = 0; i <str.length() ; i++) {
                value+="1";
            }
            int num3= Integer.parseInt(value);
            int num1= (int) (1*Math.pow(10,str.length()-1));
            if (num<=num3)
                num3=num;
            for (int i = num1+1; i <=num3 ; i++) {
                boolean isYes=true;
                int t=i;
                while (t>0){
                    if(t%10>1){
                        isYes=false;
                        break;
                    }
                    t/=10;
                }
                if (isYes==true)
                    sum+=1;
            }
            System.out.println(sum);
        }
    }
}
