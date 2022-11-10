package model;

public class Doctor {
    String name;
    String Specialization;
    int Experience;

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
