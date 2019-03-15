package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostGradStudTest {

    PostGradStud postStud = new PostGradStud(new Student("Jeff","Newman","574"),"Multimedia",1700);

    @Test
    public void getStudent()
    {
        assertTrue(postStud.equals(new Student()));
    }

    @Test
    public void getPostGradQual()
    {
        assertEquals(postStud.getPostGradQual(),"Multimedia");
    }

    @Test
    public void fees()
    {
        Assert.assertEquals(postStud.fees(),1905,0);
    }
}