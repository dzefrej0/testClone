package pl.michalczukm.isa.java;

import java.util.List;


public class
App
{
    public static void main( String[] args ) {

        PatientService patientService = new PatientService();
        List<Patient> patients = patientService.getAll();

        for (Patient patient : patients) {
            System.out.println(String.format("%1$s %2$s", patient.getFirstName(), patient.getLastName()));
        }
    }
}
