package javaCode;

import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 句子反转
 * @Date: 2020/8/5 18:40
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String line=scanner.nextLine();
            String[] list=line.split(" ");
            for (int i=list.length-1;i>=0;i--){
                System.out.print(list[i]+" ");
            }
            System.out.println("\n");
        }
    }


}
