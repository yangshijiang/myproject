package javaCode;
import java.util.*;

/**
 * @Author: 杨世江
 * @Description: 京东集合试题
 * @Date: 2020/8/5 10:20
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line;
        int a, b;

        while (scan.hasNextInt()) {
            HashSet<Integer> hashSet=new HashSet<Integer>();
            a = scan.nextInt();
            b = scan.nextInt();
            for (int i=0;i<a;i++){
                hashSet.add(scan.nextInt());
            }
            for (int i=0;i<b;i++){
                hashSet.add(scan.nextInt());
            }
            Object[] obj=hashSet.toArray();
            int[] values=new int[obj.length];
            for (int i=0;i<obj.length;i++){
                values[i]=(int)obj[i];
            }

            Arrays.sort(values);
            for (int i=0;i<values.length;i++){
                System.out.print(values[i]+" ");
            }
        }

    }
}
