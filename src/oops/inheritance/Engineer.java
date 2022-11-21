package oops.inheritance;

public class Engineer {

    public void software_Engineer(){

        System.out.println("I am a Software Engineer ");

    }

    public void Electrical_Engineer(){

        System.out.println("I am a Electrical Engineer ");

    }

    public void Mechanical_Engineer(){

        System.out.println("I am a Mechanical Engineer ");

    }



    public static void main(String[] args) {

        Engineer obj = new Engineer();

        obj.software_Engineer();
        obj.Mechanical_Engineer();
        obj.Electrical_Engineer();

    }
}
