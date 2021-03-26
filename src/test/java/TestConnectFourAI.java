import org.junit.Assert;
import org.junit.Test;
import java.awt.Point;

public class TestConnectFourAI {
    connectFourAI c = new connectFourAI(1,1);
    @Test
    public void TestBestMove(){
        int[][] g = {{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1}};
        Assert.assertEquals(new Point(0,5), c.bestMove(g));
        g = new int[7][7];
        Assert.assertEquals(new Point(5,3), c.bestMove(g));
    }

    @Test
    public void TestBlockTwos(){
        int[][] g = {{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1},{1,1,1,1,1,1,1}};
        Assert.assertEquals(new Point(-1,-1), c.blockTwos(g));

    }

    @Test
    public void TestAITwos(){
        int[][] g = {{2,2,2,2,2,2,2},{2,2,2,2,2,2,2},{2,2,2,2,2,2,2},{2,2,2,2,2,2,2},{2,2,2,2,2,2,2},{2,2,2,2,2,2,2},{2,2,2,2,2,2,2},{2,2,2,2,2,2,2}};
        Assert.assertEquals(new Point(-1,-1), c.AITwos(g));

    }

}
