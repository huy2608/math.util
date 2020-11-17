/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.util;

/**
 *
 * @author Shi
 */
public class MathUtility {

    //làm hàng fake giống như hàng thật
    //JDK có class java.util.Math, có 1 loại hàm static 
    public static final double PI = 3.14;
    //hàm tính n! = 1.2.3.4..n
    //n! tăng nhanh nên mình chỉ tính đến 20! tối đa, 21! tràn long
    //0! = 1! = 1, quy ước 
    //không có âm giai thừa, nếu tham số giai thừa là âm, ném Exception

    public static long getFactorial(int n) {
        if (n < 0 || n > 21) {
            throw new IllegalArgumentException("n must be between 1..20");

        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //sống sót đến lệnh này tức là n = 2..20
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *=i;
        }
        return result;
    }
}
