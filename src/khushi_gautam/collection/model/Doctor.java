package khushi_gautam.collection.model;

public class Doctor {
    String Name;
    String Hospital;
    int experience;
    String Post;

    //todo parameterized constructor
    public Doctor(String name, String hospital, int experience, String post) {
        Name = name;
        Hospital = hospital;
        this.experience = experience;
        Post = post;
    }
    //todo getter and setter method

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String hospital) {
        Hospital = hospital;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }
}
