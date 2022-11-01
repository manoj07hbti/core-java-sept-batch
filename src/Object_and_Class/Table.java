package Object_and_Class;

public class Table {

     String name="Dinning table";
     int chairs=6;
     String company="godrej";

     public static void main(String args[]){
          //TODO SYNTAX :  ClassName objName= new ClassName();

          Table person = new Table ();
          System.out.println("" +person);

           // objName.propertyname

          System.out.println(""+person.name);
          System.out.println(""+person.chairs);
          System.out.println(""+person.company);


     }
}
