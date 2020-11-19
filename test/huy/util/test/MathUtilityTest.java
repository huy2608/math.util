/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.util.test;

import huy.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shi
 */
public class MathUtilityTest {

    @Test
    //kí hiệu của JUnit đưa ra, biến hàm ngay sau đây thành 
    //public static void main(), app có nhiều main
    //f6 chạy main mặc định, Shift f6 là chạy main() ở Test
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(240, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //hàm đã đúng thì đúng hết, tương đương xanh
    //còn sai 1 trường hợp coi như sai, tương đương đỏ
    //Viết code để test code chính MathUtility
    //Viết code dùng thư viện JUnit, NUnit, xUnit, Jasmine,....để test
    //xem code chính chạy ổn không trước khi đem qua bên QC/ khách hàng
    //và thư viện này cung cấp cái cơ chế báo đúng sai qua màu sắc xanh đỏ
    //mắt chỉ nhìn 2 màu là đủ, khổi cần so sánh expected và actual
    
}
