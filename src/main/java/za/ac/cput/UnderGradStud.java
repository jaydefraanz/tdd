package za.ac.cput;

public class UnderGradStud extends Student implements Payment
{
    String underGradQualification;
    double feeAccount;

    public UnderGradStud(String name, String surname, String studNo, String underGradQualification, double feeAccount)
    {
        super(name, surname, studNo);
        this.underGradQualification = underGradQualification;
        this.feeAccount = feeAccount;
    }

    public String getUnderGradQualification()
    {
        return underGradQualification;
    }

    //An increase for this qualifcation is calculated
    @Override
    public double fees()
    {
        return feeAccount = feeAccount + (feeAccount*0.08);
    }
}
