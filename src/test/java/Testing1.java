import org.junit.Assert;
import org.junit.Test;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Testing1 {
    showWin w = new showWin();
@Test
    public void TestshowWin(){
        Assert.assertEquals("RED WINS!", w.show(new int[5][2],2));
    }

}
