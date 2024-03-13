public abstract class Employee implements Comparable<Employee>
{

    private String name;
    private String title;

    public Employee(String n, String t)
    {

        this.name = n;
        this.title = t;

    }

    public String toString()
    {
        return "";
    }

    public String getName()
    {
        return name;
    }

    public String getTitle()
    {
        return title;
    }

    public abstract int annualSalary();

}
