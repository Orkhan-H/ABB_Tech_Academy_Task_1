package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassicVersionVersionTest {

    @Test
    void testFunction1() {
        int n = 4;
        int k = 3;
        int[] cars = new int[]{6, 2, 12, 7};
        //Array is splited into:
        //[2,6,7] 7-2+1 = 6
        //[6,7,12] 12-6+1=7
        //min length is 6
        Assertions.assertEquals(6, SolutionClassic.carParkingRoof(cars, k));
    }

    @Test
    void testFunction2() {
        int n = 5;
        int k = 2;
        int[] cars = new int[]{6, 2, 12, 7, 19};
        //Array is splited into:
        //[2,6] 6-2 +1 = 5
        //[6,7] 7-6+1 = 2
        //[7,12] 12-7+1 = 6
        //[12,19] 19-12+1 = 8
        //min length is 2
        Assertions.assertEquals(2, SolutionClassic.carParkingRoof(cars, k));
    }

}