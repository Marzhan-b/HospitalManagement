package OOP;

import java.util.Objects;

public class Patient {
    private String name;
    private String lastname;
    private String diagnoses;
    private int age;

    public Patient(String name, String lastname, String diagnoses, int age) {
        this.name = name;
        this.lastname = lastname;
        this.diagnoses = diagnoses;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setDiagnoses(String diagnoses) {
        this.diagnoses = diagnoses;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return name + " " + lastname + ", Age: " + age + ", Diagnoses: " + diagnoses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return age == patient.age && name.equals(patient.name) && lastname.equals(patient.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age);
    }
}
