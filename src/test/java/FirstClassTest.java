
import org.junit.Ignore;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author diallo028450
 */

public class FirstClassTest {
    
    @Test
    @Ignore
    public void testReturn20(){
        int value=40/5;
        Assert.assertEquals(8, value);
    }
    
    @Test
    public void testSameObject(){
        Object obj=new Object();
        Assert.assertSame(obj, obj);
    }
    
}
