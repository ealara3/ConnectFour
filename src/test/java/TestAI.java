import org.junit.Assert;
import org.junit.Test;

public class TestAI {
    @Test
    public void TestMaxMove(){
        AI a = new AI();
        Assert.assertEquals(0,a.maxMove(0,0,0,new int[7][7]));
    }
}
