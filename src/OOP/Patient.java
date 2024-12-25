package OOP;

public class Patient {

    public Patient() {}


    public Patient(String name, String lastname,String diagnoses,int age )
    {
        this.name=name;
        this.lastname=lastname;
        this.diagnoses=diagnoses;
        this.age=age;
    }

    private String name;
    private String lastname;
    private String diagnoses;
    private int age;


    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getDiagnoses() {
        return diagnoses;
    }
    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setDiagnoses(String diagnoses) {
        this.diagnoses = diagnoses;
    }
    public void setAge(int age) {
        this.age = age;
    }




    public boolean isAdult() {
        return age >= 18;
    }
    public void displayInfo() {
        System.out.println("Patient Name: " + name + " " + lastname);
        System.out.println("Diagnoses: " + diagnoses);
        System.out.println("Age: " + age);
    }



}
