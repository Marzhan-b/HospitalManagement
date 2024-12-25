package OOP;

public class Doctor
{

    public Doctor(){}


    public Doctor(String name,String lastname, int age, String gender,String qualification,String experience,String email)
    {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.qualification=qualification;
        this.experience=experience;
        this.email=email;
    }

    private String name;
    private String lastname;
    private int age;
    private String gender;
    private String qualification;
    private String experience;
    private String email;



    public String getName()
    {
        return this.name;
    }
    public String getLastname()
    {
        return this.lastname;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getQualification()
    {
        return this.qualification;
    }
    public String  getExperience()
    {
        return this.experience;
    }
    public String getEmail()
    {
        return this.email;
    }


    public void setName(String name)
    {
        this.name = name;
    }
    public void setLastname(String Lastname)
    {
        this.lastname = lastname;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }
    public void setExperience(String experience)
    {
        this.experience = experience;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }



    public void introduce() {
        System.out.println("Hi, I am Dr. " + this.getName() + ", a " + this.qualification + ". I am " + this.age +
                " years old. You can reach me at " + this.email + ".");
    }
    public void checkAgeCategory() {
        if (this.age < 30) {
            System.out.println(this.name + " is a young doctor.");
        } else if (this.age <= 50) {
            System.out.println(this.name + " is an experienced doctor.");
        } else {
            System.out.println(this.name + " is a senior doctor.");
        }
    }



}
