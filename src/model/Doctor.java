package model;

import java.util.Objects;

public class Doctor {
    String name;
    String Specialization;
    int Experience;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Experience == doctor.Experience && Objects.equals(name, doctor.name) && Objects.equals(Specialization, doctor.Specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Specialization, Experience);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public Doctor(String name, String specialization, int experience) {
        this.name = name;
        Specialization = specialization;
        Experience = experience;
    }
}
