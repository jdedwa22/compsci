public class Person
{

    private String firstName;
    private String lastName;
    private int id;

    public Person(String fName, String lName, int personId)
    {

        firstName = fName;
        lastName = lName;
        id = personId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getId()
    {
        return id;
    }

    public void display()
    {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID: " + id);
    }

}
