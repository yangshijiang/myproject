package javaCode;

import java.util.*;

/**
 * @Author: 杨世江
 * @Description:
 * @Date: 2020/7/27 12:00
 */
public class Testclass {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        System.out.println(line);

        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner scanner=new Scanner(line);
        while(scanner.hasNextInt()){
            list.add(scanner.nextInt());
        }

        System.out.println(list.toString());

    }
}
