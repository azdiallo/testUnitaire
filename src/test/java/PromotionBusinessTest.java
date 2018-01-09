
import com.snt.formationtestunitaire.PromotionBusiness;
import com.snt.impl.PromoCalculatorServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diallo028450
 */
public class PromotionBusinessTest {
    
    static PromotionBusiness pb;

    @BeforeClass
    public static void setUp() {
        pb = new PromotionBusiness(new PromoCalculatorServiceImpl());
    }

    @Test
    public void shouldApplyRemise() {
        Assert.assertEquals(new Double(0), pb.evaluerRemise(100, "CREME"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException() {
        Assert.assertEquals(new Double(0), pb.evaluerRemise(100, null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIFProductIsEmpty() {
        Assert.assertEquals(new Double(0), pb.evaluerRemise(100, ""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWherePriceIsLessThan0() {
        Assert.assertEquals(new Double(0), pb.evaluerRemise(-100, "GATEAU"));
    }

    @Test
    public void shouldApply15PurcentPromoWhenProductBeginningWithA() {
        Assert.assertEquals(new Double(15.0), pb.evaluerRemise(100, "ARME"));
    }

    @Test
    public void shouldApply15PurcentPromoWhenProductBeginningWithAAndGreaterThan500() {
        Assert.assertEquals(new Double(17.0), pb.evaluerRemise(1000, "ARME"));
    }

    @Test
    public void shouldApply5PurcentPromoWhenProductBeginningWithB() {
        Assert.assertEquals(new Double(5), pb.evaluerRemise(100, "BONBON"));
    }

    @Test
    public void shouldApply5PurcentPromoWhenProductBeginningWithBAndGreaterThan500() {
        Assert.assertEquals(new Double(7), pb.evaluerRemise(10000, "BONBON"));
    }

    @Test
    public void shouldApply2PurcentPromoWhenProductGreaterThan500() {
        Assert.assertEquals(new Double(2.0), pb.evaluerRemise(1500, "OMO"));
    }
}
