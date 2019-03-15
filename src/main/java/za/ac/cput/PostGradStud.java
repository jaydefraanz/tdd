package za.ac.cput;

public class PostGradStud implements Payment
{
    private Student student;
    private String postGradQual;
    private double totalFees;

    public PostGradStud()
    {
        this.student = new Student();
        student.setName("Pete");
        student.setSurname("Hugh");
        student.setStudNo("201");
    }

    public PostGradStud(Student student, String postGradQual, double totalFees) {
        this.student = student;
        this.postGradQual = postGradQual;
        this.totalFees = totalFees;
    }

    public Student getStudent() {
        return student;
    }

    public String getPostGradQual() {
        return postGradQual;
    }

    //increase in fees
    @Override
    public double fees() {
        return totalFees = totalFees + (totalFees*0.12);
    }
}
