import org.junit.Assert;
import org.junit.Test;
public class TestCheckWinability {
    @Test
    public void Testcheck(){
        checkWinability ca = new checkWinability();
        int[][] c = new int[7][7];
        Assert.assertTrue(ca.check(c));

        int[][] c2 = new int[7][7];
        for(int i=0; i<c2.length; i++){
            for(int j=0; j< c2[i].length; j++){
                c2[i][j] = (int) (Math.random()*100);
                System.out.print(c2[i][j]+" ");
            }
            System.out.println();
        }
        Assert.assertTrue(ca.check(c2));

    }
}
