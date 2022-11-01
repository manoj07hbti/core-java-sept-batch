package parameterized_operator;

public class College {


    String name;
    String university;
    int students;

    public College(String name, String university, int students) {
        this.name = name;
        this.university = university;
        this.students = students;
    }

    public static void main(String[] args){

        College clg = new College(" Sharwood", " DBRAU", 1500);
        System.out.println("Name: " +clg.name+ " University: "+clg.university+ " Students: "+1500);
        College clg2 = new College(" AKTU"," Kanpur", 2000);
        System.out.println("Name: "+clg2.name+ " University: "+clg2.university+ " Students: "+2000);
        College clg3 = new College("Doon", "Dehradun", 2500);
        System.out.println("Name: "+clg3.name+ " University: "+clg3.university+ " Students: "+clg3.students);
    }
}

