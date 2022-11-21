package oops.inheritance;

public class NameOfEngineer extends Engineer {

    public void software_Engineer(){                                     //override

        System.out.println("Name of Software Engineer :   PARTH RAWAT");

    }

    public void nameOf_Engineer(){

        System.out.println("Name of Engineer :  SHIVA RAWAT");
    }

    public static void main(String[] args) {

        NameOfEngineer obj = new NameOfEngineer();

        obj.Mechanical_Engineer();
        obj.Electrical_Engineer();
        obj.Mechanical_Engineer();
        obj.nameOf_Engineer();
    }
}
