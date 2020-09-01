package javaCode;

import java.util.*;

/**
 * @Author: 杨世江
 * @Description: 一个字符串S是偶串当且仅当S中的每一个字符都出现了偶数次。如字符串”aabccb”是一个偶串，
 * 因为字符a,b,c都出现了两次。而字符串”abbcc”不是偶串，因为字符a出现了一次。
 * 现在给出一个长度为n的字符串T=t1,t2,t3,…,tn。字符串的子串为其中任意连续一段。
 * T长度为1的子串有n个，长度为2的子串有n-1个，以此类推，T一共有n(n+1)/2个子串。给定T，你能算出它有多少个子串是偶串吗？
 * @Date: 2020/8/7 19:11
 */
public class Question17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char[] str1=str.toCharArray();
        int sum=0;
        for (int i = 2; i <=str1.length ; i+=2) {
            for (int j = 0; j <=str1.length-i; j++) {
                String str2=str.substring(j,j+i);
                HashSet hashSet=new HashSet();
                char[] chr=str2.toCharArray();
                for (char c:chr){
                    hashSet.add(c);
                }
                int flag=0;
                for (Object c:hashSet){
                    int cishu=0;
                    if(flag>=hashSet.size()-1)
                        break;
                    for (int k = 0; k <str2.length() ; k++) {
                        if(chr[k]==(char)c)
                            cishu++;
                    }
                    if(cishu%2!=0) {
                        break;
                    }
                    flag++;
                }
                if(flag==hashSet.size()-1)
                    sum++;
                str2=null;
            }

        }
        System.out.println(sum);
    }
}
