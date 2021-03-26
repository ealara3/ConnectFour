import org.junit.Assert;
import org.junit.Test;

public class TestBoard {
    @Test
    public void TestBoard(){
        Board b = new Board();
        int[] v = new int[7];
        Assert.assertArrayEquals(v, b.yPoly2);
    }
}
