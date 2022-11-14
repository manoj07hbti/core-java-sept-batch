package khushi_gautam.array;

public class Para_Engineers {
    String name;
    long joining;
    int retire;
    String division;
    String department;
    // todo parameterized
    public Para_Engineers(String name, long joining, int retire, String division, String department) {
        this.name = name;
        this.joining = joining;
        this.retire = retire;
        this.division = division;
        this.department = department;
    }

    public static void main(String[] args) {
        Para_Engineers obj = new Para_Engineers("Mukesh",1930,1990,"Lucknow division","Electrical Department");
        System.out.println(obj.name +","+ obj.joining+","+ obj.retire+"," +obj.division+"," + obj.department);
    }
}
