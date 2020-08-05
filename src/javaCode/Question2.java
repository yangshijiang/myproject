package javaCode;

import java.util.*;


public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceNum,goodNum;
        while (scanner.hasNextInt()){
            priceNum=scanner.nextInt();
            goodNum=scanner.nextInt();
            int[] prices=new int[priceNum];
            for (int i=0;i<priceNum;i++){
                prices[i]=scanner.nextInt();
            }
            Arrays.sort(prices);

            HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
            for (int i=0;i<goodNum;i++){
                String good=scanner.next();
                if(hashMap.containsKey(good)){
                    int num=hashMap.get(good);
                    hashMap.put(good,num+1);
                }
                else
                    hashMap.put(good,1);
            }

            Set set=hashMap.keySet();
            int[] goodEach=new int[set.size()];
            Iterator iterator=set.iterator();
            int flag=0;
            while (iterator.hasNext()){
                goodEach[flag]=hashMap.get(iterator.next());
                flag++;
            }
            Arrays.sort(goodEach);

            int min=0;
            int j=0;
            for (int i=goodEach.length-1;i>=0;i--){
                min+=goodEach[i]*prices[j];
                j++;
            }
            System.out.print(min+" ");
            int max=0;
            j=prices.length-1;
            for (int i=goodEach.length-1;i>=0;i--){
                max+=goodEach[i]*prices[j];
                j--;
            }
            System.out.println(max+"\n");
        }
    }

}

