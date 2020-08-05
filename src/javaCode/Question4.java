package javaCode;

import jdk.nashorn.api.tree.WhileLoopTree;

import java.util.*;

/**
 * @Author: 杨世江
 * @Description: 交易清单
 * @Date: 2020/8/5 13:54
 */
public class Question4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            HashMap<Integer,Integer> B=new HashMap<Integer,Integer>();
            HashMap<Integer,Integer> S=new HashMap<Integer,Integer>();
            int weituoshu=scanner.nextInt();
            int s=scanner.nextInt();
            for (int i=0;i<weituoshu;i++) {
                String status = scanner.next();
                int price = scanner.nextInt();
                int num = scanner.nextInt();
                if(status.equals("B")){
                    if(B.containsKey(price)){
                        B.put(price,B.get(price)+num);
                    }
                    else
                        B.put(price,num);
                }
                else{
                    if(S.containsKey(price)){
                        S.put(price,S.get(price)+num);
                    }
                    else
                        S.put(price,num);
                }
            }
            Set bKey=B.keySet();
            Set sKey=S.keySet();
            Object[] Bs=bKey.toArray();
            Object[] Ss=sKey.toArray();
            Arrays.sort(Bs);
            Arrays.sort(Ss);
            int sNum=1;
            for(int i=Ss.length-1;i>=0;i--){
                if(sNum>2*s)
                    break;
                int sVal=(int)Ss[i];
                System.out.println("S "+sVal+" "+S.get(sVal));
                sNum++;
            }
            for(int i=Bs.length-1;i>=0;i--){
                if(sNum>2*s)
                    break;
                int bVal=(int)Bs[i];
                System.out.println("B "+bVal+" "+B.get(bVal));
                sNum++;
            }
        }
    }
}

