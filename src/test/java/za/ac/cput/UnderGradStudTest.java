package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnderGradStudTest {

    UnderGradStud underGrad = new UnderGradStud("John","King","502","Photography", 15000 );

    @Test
    public void getUnderGradQualification()
    {
        assertEquals("Verifying the qualification", underGrad.getUnderGradQualification(), "Photography");
    }

    @Test
    public void fees()
    {
        Assert.assertEquals(underGrad.fees(),16200,0);
    }
}