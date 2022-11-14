package khushi_gautam.array;

public class table {
    String name = "Table";
    String company = "Harkut";
    int countity = 18;
    String address =" B-15, Sai Bihar Aligarh";

    public static void main(String[] args) {
//TODO SYNTAX :  ClassName objName= new ClassName();

        table obj= new table(); // obj object created

        System.out.println("Printing object "+obj);
//TODO objName.propertyname

        System.out.println(" name :"+obj.name);
        System.out.println("company :"+obj.company);
        System.out.println("countity :"+obj.countity);
        System.out.println("address :"+ obj.address);

    }
}
