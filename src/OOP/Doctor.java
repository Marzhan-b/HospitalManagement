package OOP;

public class Doctor
{
    /// default constructor
    public Doctor(){}

    public Doctor(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private String name;
    private int age;
    private String gender;

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
