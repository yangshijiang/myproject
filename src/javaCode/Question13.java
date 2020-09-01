package javaCode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: 杨世江
 * @Description: 战队
 * @Date: 2020/8/6 17:50
 */
public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] queue = scanner.next().toCharArray();
        scanner.close();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < queue.length; i++) {
            if(queue[i]!='X'&&queue[i]!='#'){
                for (int j = 1; j <=Integer.parseInt(String.valueOf(queue[i])) ; j++) {
                    if(!(i-j<0)&&queue[i-j]=='X') {
                        if(!list.contains(i-j))
                            list.add(i-j);
                    }
                    if(!(i+j>queue.length-1)&&queue[i+j]=='X') {
                        if(!list.contains(i+j))
                            list.add(i+j);
                    }
                }
            }
        }
        System.out.println(list.size());
    }

}
