package za.ac.cput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StudentTest
{
    Student stud = new Student("Jack", "Simons","520");

    @Test
    public void getName()
    {
        assertEquals(stud.getName(),"John");
    }

    @Test
    public void getSurname()
    {
        assertEquals(stud.getSurname(),"Simons");
    }

    @Test
    public void getStudNo()
    {
        assertEquals(stud.getStudNo(),"520");
    }
}
