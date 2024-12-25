package OOP;
import  OOP.Doctor;
import OOP.Hospital;
import OOP.Patient;


public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital", "apt 69");

        System.out.println("Hospital Name: " + hospital.getName());
        System.out.println("Hospital Address: " + hospital.getAddress());


        hospital.updateDetails("Central Hospital", "Springfield");
        System.out.println("Updated Hospital Name: " + hospital.getName());
        System.out.println("Updated Hospital Address: " + hospital.getAddress());


        Doctor doctor = new Doctor("John", "Miller", 45, "Male", "Cardiologist", "20 years", "john.miller@example.com");

        doctor.introduce();
        doctor.checkAgeCategory();


        doctor.setName("Egor");
        System.out.println("Updated Doctor's Name: " + doctor.getName());
    }
}
