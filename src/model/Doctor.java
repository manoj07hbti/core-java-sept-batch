package model;

import java.util.Objects;

public class Doctor {

    String name ;
    String place;
    int age;
    String patient;
    String Disease;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && name.equals(doctor.name) && place.equals(doctor.place) && patient.equals(doctor.patient) && Disease.equals(doctor.Disease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, place, age, patient, Disease);
    }

    public Doctor(String name, String place, int age, String patient, String disease) {
        this.name = name;
        this.place = place;
        this.age = age;
        this.patient = patient;
        Disease = disease;
    }

    // getter and setter ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String disease) {
        Disease = disease;
    }
}
