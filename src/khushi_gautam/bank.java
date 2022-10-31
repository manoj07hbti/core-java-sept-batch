package khushi_gautam;

public class bank {
    String name= "Punjab National Bank";
    String chairman ="Atul Kumar Goel";
    String manager = "Jitendra kumar";
    String cashier = "Rahul vijay";
    String po = "Sarita singh";
    String peon =" Goopee Dube";
    int totalemploye = 12;

    public static void main(String[] args) {
        //todo classname obj = new obj.classname();
        bank obj= new bank();
        //todo objname.propertyname
        System.out.println("Name: "+obj.name);
        System.out.println("Chairman :"+obj.chairman);
        System.out.println("Manager :"+obj.manager);
        System.out.println("Cashier :"+obj.cashier);
        System.out.println("P.O. :"+obj.po);
        System.out.println("Peon :"+obj.peon);
        System.out.println("Total Employee :"+ obj.totalemploye);

    }
}
