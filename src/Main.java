import OOP.Doctor;

public class Main
{
    public static void main(String[] args)
    {
        Doctor doctor = new Doctor("John", 28, "Male");
        System.out.println(doctor.getName());
        doctor.setName("Egor");
        System.out.println(doctor.getName());
    }
}