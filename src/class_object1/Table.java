package class_object1;

public class Table {
    // Todo : properties


    String colour = "Black";
    int chair  = 4;
    double cost = 15000.50;


    // Todo : capabilities
    // sit
    // eat food
    // stand


    public static void main(String[] args) {

        // Todo : Create a object by the constructor method

        //Todo Syntax : ClassName objectName = new ClassName();
                        Table tab = new Table()
                                ;
        System.out.println("Table colour  is : " + tab.colour);
        System.out.println("Total number of chair  : " +  tab.chair);
        System.out.println("Printing the Table cost  : " + tab.cost);

        System.out.println("Printing the Table  details : " + tab.colour +":" + tab.chair +":"+ tab.cost );

    }
}
