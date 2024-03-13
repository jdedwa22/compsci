public abstract class Hourly extends Employee
{

    private double hourlyWage;

    public Hourly(String n, String t, double w)
    {
        super(n, t);
        this.hourlyWage = w;
    }

    public String toString()
    {
        return "";
    }

    public String getHourlyWage()
    {
        return "";
    }

    public int annualSalary()
    {
        return (int) hourlyWage * 2087;
    }
}
