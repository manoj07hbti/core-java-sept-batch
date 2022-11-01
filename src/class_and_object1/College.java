package class_and_object1;

public class College {
    String name="S.R.R. College";
    int teacher=15;
    int rooms=34;
    int students=355;

    public College(String name, int teacher, int rooms, int students) {
        this.name = name;
        this.teacher = teacher;
        this.rooms = rooms;
        this.students = students;
    }

    public static void main(String[] args) {
        College obj =new College("S.R.R. College",15,34,355);
        System.out.println("Name: "+obj.name+" Teacher: "+obj.teacher+" Students: "+obj.students+" Students: "+obj.rooms);
    }
}
