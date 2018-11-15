package Samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Katsiaryna Stalchanka
 * @since
 */
public class SampleTest {

    @Test(groups = {"1"} )
    public void first(){
        System.out.println("1");
        Assert.assertEquals("2", "1");
    }
    @Test (groups = {"2"})
    public void second(){
        System.out.println("2");
    }
}
