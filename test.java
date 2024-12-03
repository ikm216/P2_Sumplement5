import org.junit.*;

public class test {
    @Test
    public void test_should_return_Magic_Squares(){
        int [][] magic = {{8, 1, 4}, {3, 3, 5}, {6, 9, 2}};
        Assert.assertTrue(su.magicSquares(magic));
    }
}
