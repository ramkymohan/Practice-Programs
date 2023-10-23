package HospitalManagement;

public class Patient {
    private int patientID;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int patientID, String name, int age, String diagnosis) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
