package HospitalManagement;
import java.util.*;
public class Hospital {
    private List<Patient> patients;
    private List<Doctor> doctors;

    public Hospital() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void updatePatientById(int patientId,String name, int age, String diagnosis){
        for(Patient patient:patients){
            if(patient.getPatientID()== patientId){
                patient.setAge(age);
                patient.setDiagnosis(diagnosis);
                patient.setName(name);
                System.out.println("Patient details updated successfully.");
                return;
            }
        }
        System.out.println("Patient with ID " + patientId + " not found.");
    }

    public void updateDoctorById(int doctorId,String name, String Specialazation){
        for(Doctor doctor:doctors){
            if(doctor.getDoctorID()==doctorId){
                doctor.setName(name);
                doctor.setSpecialization(Specialazation);
                System.out.println("Doctor details updated successfully.");
                return;
            }
        }
        System.out.println("Doctor with ID " + doctorId + " not found.");
    }

    public void removePatientById(int patientId){
        for (Patient patient:patients){
            if(patient.getPatientID()==patientId){
                patients.remove(patient);
                System.out.println("Patient with ID " + patientId + " removed successfully.");
                return;
            }
            System.out.println("Patient with ID " + patientId + " not found.");
        }
    }

    public void removeDoctorById(int DoctorId){
        for(Doctor doctor:doctors){
            if(doctor.getDoctorID()== DoctorId){
                doctors.remove(doctor);
                System.out.println("Doctor with ID " + DoctorId + " removed successfully.");
                return;
            }
        }
        System.out.println("Doctor with ID " + DoctorId + " not found.");
    }

    public void displayAllPatients() {
        System.out.println("Patient Details:");
        for (Patient patient : patients) {
            System.out.println("Patient ID: " + patient.getPatientID());
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Diagnosis: " + patient.getDiagnosis());
            System.out.println();
        }
    }

    public void displayAllDoctors() {
        System.out.println("Doctor Details:");
        for (Doctor doctor : doctors) {
            System.out.println("Doctor ID: " + doctor.getDoctorID());
            System.out.println("Name: " + doctor.getName());
            System.out.println("Specialization: " + doctor.getSpecialization());
            System.out.println();
        }
    }
}
