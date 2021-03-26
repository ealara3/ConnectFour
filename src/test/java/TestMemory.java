import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestMemory {
@Test
public void TestsaveGame()throws IOException{
    Memory m = new Memory();
    Assert.assertNull(m.saveGame(new int[7][6]));
}
    @Test
    public void TestloadGame()throws IOException {
        Memory m = new Memory();
        int[][] savedPositions = new int[7][6];

        Assert.assertArrayEquals(savedPositions, m.loadGame());
    }

}
