package OOP;

public class Main {
    public static void main(String[] args) {
        // Создание больницы
        Hospital hospital = new Hospital("City Hospital", "Apt 69");

        // Создание врачей
        Doctor doctor1 = new Doctor("John", "Miller", 45, "Male", "Cardiologist", "20 years", "john.miller@example.com");
        Doctor doctor2 = new Doctor("Anna", "Brown", 38, "Female", "Therapist", "12 years", "anna.brown@example.com");

        // Добавление врачей в больницу
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Создание пациентов и назначение им врачей
        Patient patient1 = new Patient("Alice", "Smith", "Flu", 30);
        Patient patient2 = new Patient("Bob", "Johnson", "Heart Disease", 60);
        Patient patient3 = new Patient("Charlie", "Davis", "Routine Checkup", 25);

        // Добавление пациентов в больницу
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        // Вывод информации о больнице
        System.out.println(hospital);

        // Вывод врачей
        System.out.println("\nDoctors:");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println(doctor);
        }

        // Вывод пациентов
        System.out.println("\nPatients:");
        for (Patient patient : hospital.getPatients()) {
            System.out.println(patient);
        }

        // Сортировка пациентов по возрасту
        System.out.println("\nPatients sorted by age:");
        hospital.sortPatientsByAge();
        for (Patient patient : hospital.getPatients()) {
            System.out.println(patient);
        }

        // Фильтрация взрослых пациентов
        System.out.println("\nAdult Patients:");
        for (Patient patient : hospital.getPatients()) {
            if (patient.isAdult()) {
                System.out.println(patient);
            }
        }

        // Поиск пациента по имени
        String searchName = "Alice";
        System.out.println("\nSearching for patient: " + searchName);
        for (Patient patient : hospital.getPatients()) {
            if (patient.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + patient);
            }
        }
    }
}
