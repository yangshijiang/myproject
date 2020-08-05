package javaCode;

/**
 * @Author: 杨世江
 * @Description: 进制均值
 * @Date: 2020/8/5 13:44
 */
import java.util.Scanner;

public class Question3 {
    public static int getGongYueShu(int a, int b) {// 求两个数的最大公约数
        int t = 0;
        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
        int c = a % b;
        if (c == 0) {
            return b;
        } else {
            return getGongYueShu(b, c);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            int sum = 0;
            for (int i = 2; i < num; i++) {
                int sum_ = getSum(num, i);// 将num转换成指定进制数然后各个位求和
                sum += sum_;
            }
            int gongYueShu = getGongYueShu(sum, num - 2);
            System.out.println(sum / gongYueShu + "/" + (num - 2) / gongYueShu);
        }
    }

    private static int getSum(int num, int i) {
        int sum = 0;
        while (num != 0) {
            int wei = num % i;
            sum += wei;
            num = num / i;
        }
        return sum;
    }
}
