package model;

public class Employee {

    int Empid;

    String EmpName;

    String EmpDept;

    public Employee(int empid, String empName, String empDept) {
        Empid = empid;
        EmpName = empName;
        EmpDept = empDept;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpDept() {
        return EmpDept;
    }

    public void setEmpDept(String empDept) {
        EmpDept = empDept;
    }
}
