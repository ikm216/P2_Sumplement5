import org.junit.*;

public class test {
    @Test
    public void test_should_return_Magic_Squares(){
        int [][] magic = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}
        };
        Assert.assertTrue(su.magicSquares(magic));
    }
    @Test
    public void test_should_return_sum_of_array(){
        
    }
}
