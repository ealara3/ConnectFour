import org.junit.Assert;
import org.junit.Test;


public class TestingCurrentPlayerAI {

    currentPlayerAI p = new currentPlayerAI();
    @Test
    public void TestgetPlayer(){
        Assert.assertEquals("Blue", p.getPlayer(new int[7][8]));
    }

    @Test
    public void TestRandom(){
        Assert.assertTrue(p.Random());
    }

    @Test
    public void TestreturnBoard(){Assert.assertArrayEquals(new int[7][6], p.returnBoard());}

}