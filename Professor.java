import java.util.ArrayList;

public class Professor extends Person
{

    private String department;
    private double salary;
    private ArrayList<Student> advisees;

    public Professor(String fName, String lName, int personId, String professorDepartment, double professorSalary)
    {
        super(fName, lName, personId);
        department = professorDepartment;
        salary = professorSalary;
        advisees = new ArrayList();
    }

    public String getDepartment()
    {
        return department;
    }

    public double getSalary()
    {
        return salary;
    }

    public ArrayList<Student> getAdvisees()
    {
        return advisees;
    }

    public void setDepartment(String professorDepartment)
    {
        department = professorDepartment;
    }

    public void setSalary(double professorSalary)
    {
        salary = professorSalary;
    }

    public void addAdvisee(Student s)
    {
        advisees.add(s);
    }

    public boolean removeAdvisee(int studentId)
    {
        for (Student s : advisees)
        {
            if (s.getId() == studentId)
            {
                advisees.remove(s);
                return true;
            }
        }
        return false;
    }

}
