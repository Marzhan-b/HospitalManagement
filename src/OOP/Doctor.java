package OOP;

import java.util.Objects;

public class Doctor {
    private String name;
    private String lastname;
    private int age;
    private String gender;
    private String specialization;
    private String experience;
    private String email;

    public Doctor(String name, String lastname, int age, String gender, String specialization, String experience, String email) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.specialization = specialization;
        this.experience = experience;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return name + " " + lastname + ", Age: " + age + ", Gender: " + gender + ", Specialization: " + specialization + ", Experience: " + experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && name.equals(doctor.name) && lastname.equals(doctor.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age);
    }
}
