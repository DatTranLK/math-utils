/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dattt.mathutil.test;

import com.dat.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jike
 */

//biến class chứa code của mình trở thành 1 member/implement
//cái interface Parameterized, tham số hóa, biến data cụ thể
//thành tham số / đặt tên biến, sau đó nhồi từ từ data vào tham số
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //0! -> 1
    //1! -> 1
    //2! -> 2
    //3! -> 6
    // dữ liệu để test/test cáe/test data
    //0,1
    //1,1
    //2,2
    //3,6
    //4,24
    //5,120
    //6,720
    //      [7][2]
    //1. Tạo mảng chứa data. Framework/Tool mà có UnitTest xịn
    //hỗ trợ kết nối với file .csv, table trong DB luôn !!!, Excel 
    //hoặc để mảng trong code đc lun
    
    //trả về mảng 2 chiều, [7][2] , kiểu Object/dùng wrapper class
    //Integer, Double, Long, Float, Chẩcter, Boolen, Short, Byte wrapper class
    @Parameters
    public static Object[][] initData(){
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    @Parameter(value = 0) //gắn biến này với cột 0
    //có bộ data rồi, ta trích từng cặp ra và test như cách xanh đỏ cũ!!!
    public int input; //n, ứng cột 0        map vào mảng ^!
     @Parameter(value = 1)
    public long expected;// ứng cột 1 giá trin của n!   720
    @Test //trích xuất data dc rồi, nhồi vào assert Equals
    public void testFactorialGivenValidArgumentReturnsWell(){
        
        long actual = MathUtil.getFactorial(input);
        
        assertEquals(expected, actual);
        
    }
    
    
}
