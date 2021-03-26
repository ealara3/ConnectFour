import org.junit.Assert;
import org.junit.Test;

public class TestCurrentPlayer {
    currentPlayer c = new currentPlayer();
    @Test
    public void TestGetPlayer(){
        Assert.assertEquals(1, c.getPlayer());
    }

    @Test
    public void TestRandom(){
        Assert.assertTrue(c.Random());
    }
}
