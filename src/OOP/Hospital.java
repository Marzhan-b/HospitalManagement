package OOP;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void sortPatientsByAge() {
        patients.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
    }

    @Override
    public String toString() {
        return "Hospital: " + name + ", Address: " + address + ", Doctors: " + doctors.size() + ", Patients: " + patients.size();
    }
}
