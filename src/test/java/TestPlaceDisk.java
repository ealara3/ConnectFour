import org.junit.Assert;
import org.junit.Test;
import java.awt.Point;

public class TestPlaceDisk {
    PlaceDisk p = new PlaceDisk();
    @Test
    public void TestPlaceDisk(){
    int[][] TestPositionValues = new int[7][7];
    int[][] comparingTest = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{1,0,0,0,0,0,0},{0,0,0,0,0,0,0}};

    Assert.assertArrayEquals(comparingTest, p.place(new Point(200,200),1,TestPositionValues));


    }
@Test
    public void TestAIPlace(){
        int[][] TestPositionValues = new int[7][7];
        int[][] comparingTest = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{1,0,0,0,0,0,0},{0,0,0,0,0,0,0}};

        Assert.assertEquals(comparingTest[5][0],p.AIPlace(new Point(2,2), 2, TestPositionValues)[5][0]);
    }

}
