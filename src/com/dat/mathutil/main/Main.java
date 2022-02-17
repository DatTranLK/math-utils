/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dat.mathutil.core.MathUtil;

/**
 *
 * @author jike
 */
public class Main {
    public static void main(String[] args) {
        // test thử coi hàm tính giai thừa chậy đúng hay không ???
        //kiểm thử là so sánh giữa expected và actual
        //ta phải tưởng tượng xem người dùng/ người khác xài app/code
        // như thế nào , ta dùng trươc họ
        //ta phải tưởng tượng các tình huống họ sài - TEST CASES
        
        //CASE #1: check the getF() with valid argument (n = 0..20)
        //n = 0 => expected = 1 0! thì phải trả về 1  
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        //so sanh giữa expected và actual 
        System.out.println("check 0!; expected: " + expected + 
                "; actual: " + actual);
        
        //CASE #2:
        //n = 6 => expected  = 720, 6! = 720
        expected = 720;
        actual = MathUtil.getFactorial(6);
        
        //so sanh giữa expected và actual 
        System.out.println("check 6!; expected: " + expected + 
                "; actual: " + actual);
        
        //CASE #... 1, 2, ... 20! VALID ARGUMENT
        
        //CASE #X check getF() with invalid argument
        //expected = ??? cái gì đây khi mình muốn tính 5!
        // hy vọng của ta là thấy được ngoại lệ, IllegalArgumentException
        //sure -5! xuất hiện ngoại lệ
        //nếu getF(-5) mà ném ra ngoại lệ, thì hàm chạy đúng
        System.out.println("Check if an exception is thrown!!!");
        MathUtil.getFactorial(-5);
    }
}
