package pl.edu.pjatk.tau;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class AppTest {
    Add a;

    @Before
    public void Init(){
        a = new Add();
    }

    @Test
    public void SumCheck(){

        Assert.assertEquals(4,a.sum());
    }

    @Test
    public void LoopSumCheck(){
        Assert.assertEquals(1.0, a.loopSum(), 0.0001
        );
    }
}