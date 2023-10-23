package HospitalManagement;

import java.util.*;

public class HospitalUtil {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hospital Management System Menu:");
            System.out.println("1. Add patient");
            System.out.println("2. Add doctor");
            System.out.println("3. Display all patients");
            System.out.println("4. Display all doctors");
            System.out.println("5. Update patient by ID");
            System.out.println("6. Remove patient by ID");
            System.out.println("7. Update Doctor by ID");
            System.out.println("8. Remove Doctor by ID");
            System.out.println("9. Exit");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int patientID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Diagnosis: ");
                    String diagnosis = scanner.nextLine();
                    Patient patient = new Patient(patientID, name, age, diagnosis);
                    hospital.addPatient(patient);
                    System.out.println("Patient added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Doctor ID: ");
                    int doctorID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();
                    Doctor doctor = new Doctor(doctorID, doctorName, specialization);
                    hospital.addDoctor(doctor);
                    System.out.println("Doctor added successfully.");
                    break;
                case 3:
                    hospital.displayAllPatients();
                    break;
                case 4:
                    hospital.displayAllDoctors();
                    break;
                case 5:
                    System.out.print("Enter Patient ID to update: ");
                    int patientIDToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Diagnosis: ");
                    String newDiagnosis = scanner.nextLine();
                    hospital.updatePatientById(patientIDToUpdate, newName, newAge, newDiagnosis);
                    break;
                case 6:
                    System.out.print("Enter Patient ID to remove: ");
                    int patientIDToRemove = scanner.nextInt();
                    hospital.removePatientById(patientIDToRemove);
                    break;
                case 7:
                    System.out.print("Enter Patient ID to update: ");
                    int doctorIDToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter DoctorNew Name: ");
                    String newDoctorName = scanner.nextLine();
                    System.out.print("Enter New Specelizaton: ");
                    String NewSpecelization = scanner.nextLine();
                    hospital.updateDoctorById(doctorIDToUpdate,newDoctorName,NewSpecelization);
                    break;
                case 8:
                    System.out.print("Enter Doctor ID to remove: ");
                    int doctorIDToRemove = scanner.nextInt();
                    hospital.removePatientById(doctorIDToRemove);
                    break;
                case 9:
                    System.out.println("Exiting Hospital Management System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
