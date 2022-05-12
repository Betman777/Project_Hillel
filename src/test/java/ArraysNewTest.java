import com.zinchenko.lessons.homework1.HomeWork.homework13.ArraysNew;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArraysNewTest {
    ArraysNew arraysNew = new ArraysNew();
int[][] array = new int[][]{{3, 1, 5}, {5, 8}, {1, 2, 9}};
int[][] array2 = new int[][]{{3, 7, 5}, {5,4, 9}, {1, 9,7}};
    @BeforeEach
    public void setUp(){
        System.out.println("Before");
        arraysNew = new ArraysNew();
    }
    @Test
    public void testAverage() {
        System.out.println("TestAverage");
        Assertions.assertEquals(4.25 ,arraysNew.findAverage(array));
    }
    @Test
    public void testAverage2() {
        System.out.println("TestAverage2");
        Assertions.assertEquals(625 ,arraysNew.findAverage(array2));
    }
    @Test
    public void testIsSquare(){
        System.out.println("TestIsSquare");
        Assertions.assertTrue(arraysNew.isSquare(array));
    }
    @Test
    public void testIsSquare2(){
        System.out.println("TestIsSquare2");
        Assertions.assertTrue(arraysNew.isSquare(array2));
    }

@AfterEach
    public void after(){
    System.out.println("After");
    arraysNew = null;

}
}

