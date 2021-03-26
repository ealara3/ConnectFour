import org.junit.Assert;
import org.junit.Test;

public class TestCheck {
    @Test
    public void checkWin(){
        checkWin c = new checkWin();
        int[][] g = new int[7][7];
        Assert.assertEquals(0, c.checkWin(g));

        for(int i=0; i<g.length; i++){
            for(int j=0; j<g.length; j++){
                g[i][j] = 1;
            }
        }
        Assert.assertEquals(0, c.checkWin(g));
    }
    @Test
    public void TestUpdate(){
        Check c = new Check();
        int[][] g = new int[7][7];
        Assert.assertTrue(c.Update(g));

    }
    @Test
    public void TestreturnTotal(){
        Check c = new Check();
        Assert.assertEquals(0,c.returnTotal());
    }
}
