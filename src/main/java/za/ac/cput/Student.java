package za.ac.cput;

/**
 * Hello world!
 *
 */
public class Student
{
    private String name;
    private String surname;
    private String studNo;

    public Student()
    {
    }

    public Student(String name, String surname, String studNo)
    {
        this.name = name;
        this.surname = surname;
        this.studNo = studNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setStudNo(String studNo) {
        this.studNo = studNo;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getStudNo()
    {
        return studNo;
    }

}
