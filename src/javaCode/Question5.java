package javaCode;

import java.util.*;

/**
 * @Author: 杨世江
 * @Description: 树的高度
 * @Date: 2020/8/5 17:50
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        for (int i=0;i<size-1;i++){
            int value=scanner.nextInt();
            int key=scanner.nextInt();
            hashMap.put(key,value);
        }
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<size-1;i++){
            if(!hashMap.containsValue(i)){
                int hight=1;
                int rear=i;
                while (true){
                    if(hashMap.get(rear)!=null){
                        rear=hashMap.get(rear);
                        hight++;
                    }
                    else
                        break;
                }
                list.add(hight);
            }
        }
        System.out.println(Collections.max(list));
    }
}
