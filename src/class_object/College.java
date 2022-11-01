package class_object;

public class College {

    String name;
    String address;
    int emp_number;

    public College(String name, String address, int emp_number) {
        this.name = name;
        this.address = address;
        this.emp_number = emp_number;
    }

    public static void main(String[] args) {

        College college=new College("NIC","Shikohabad",58);
        System.out.println(" College Name : " +college.name+ " College Address : " +college.address+ " Employees Number : " +college.emp_number);
    }
}
