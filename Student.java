import java.util.ArrayList;

public class Student extends Person
{

    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses;

    public Student(String fName, String lName, int personId, String studentMajor, double studentGpa, int studentCredits)
    {
        super(fName, lName, personId);
        major = studentMajor;
        gpa = studentGpa;
        credits = studentCredits;
        balance = 0;
        enrolledCourses = new ArrayList();
    }

    public String getMajor()
    {
        return major;
    }

    public double getGpa()
    {
        return gpa;
    }

    public int getCredits()
    {
        return credits;
    }

    public boolean isTransfer()
    {
        return transfer;
    }

    public double getBalance()
    {
        return balance;
    }

    public ArrayList<String> getEnrolledCourses()
    {
        return enrolledCourses;
    }

    public void setMajor(String studentMajor)
    {
        major = studentMajor;
    }

    public void setGpa(double studentGpa)
    {
        gpa = studentGpa;
    }

    public void setCredits(int studentCredits)
    {
        credits = studentCredits;
    }

    public void setTransfer(boolean studentTransfer)
    {
        transfer = studentTransfer;
    }

    public void setBalance(double studentBalance)
    {
        balance = studentBalance;
    }

    public void addCourse(String courseName)
    {
        enrolledCourses.add(courseName);
    }

    public boolean dropCourse(String courseName)
    {
        if(enrolledCourses.contains(courseName))
        {
            enrolledCourses.remove(courseName);
            return true;
        }
        else
        {
            return false;
        }
    }
}
