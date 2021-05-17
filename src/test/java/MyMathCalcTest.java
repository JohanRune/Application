import com.example.springdocker.model.MyMathCalc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by Johan Rune
 * Date: 2021-05-14
 * Time: 14:39
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class MyMathCalcTest {


    @DisplayName("Ett test om add fungerar")
    @Test
    void add (){
        MyMathCalc myMath = new MyMathCalc();

        int expected = 3;

        int actual = myMath.add(1, 2);
        assertEquals(expected, actual);

    }

    @Test
    void multiply (){

        MyMathCalc my = new MyMathCalc();


        int expected = 10;

        int actual = my.multiply(5, 2);
        assertEquals(expected, actual);

    }

    @DisplayName("Ett test om divide fungerar")
    @Test
    void divide (){

        MyMathCalc my = new MyMathCalc();


        int expected = 3;

        double actual = my.divide(9, 3);
        assertEquals(expected, actual);

    }


    @Test
    void calc_throws(){

        MyMathCalc my = new MyMathCalc();

        List<Integer> testList = Arrays.asList(-1, -10, -100, -1000);

        for (int n : testList){
            assertThrows(ArithmeticException.class, () -> my.divide(n, 0));

            
        }

    }



}
