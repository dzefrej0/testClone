package pl.michalczukm.isa.java;

import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private final List<Patient> patients;

    public PatientService() {
        patients = new ArrayList<>();

        patients.add(new Patient("Jan", "Kowalski"));
        patients.add(new Patient("Adam", "Nowak"));
        patients.add(new Patient("Piotr", "Szulc"));
        patients.add( new Patient("Michał", "Piechota"));
        patients.add( new Patient("jola", "Doe"));
        patients.add( new Patient("John", "Peck"));
    }

    public List<Patient> getAll() {
        return patients;
    }

    public void Add(Patient patient) {
        patients.add(patient);
    }
}
