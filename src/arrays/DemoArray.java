package arrays;

public class DemoArray {

    public static void main(String[] args) {

        String city1= "Agra";
        String city2="Pune";
        String city3="Jaipur";

        //SYNTAX : Datatype varName []= {value1,value2,value3........};

       String cityArray [] =  {"Agra","Pune","Jaipur","Delhi","Mumbai","Goa"};

       //  read or get
       //TODO varName[INDEX];

        System.out.println("Printing index 1 " +cityArray[1]);
        System.out.println("Printing index 3 " +cityArray[3]);
        System.out.println("Printing index 0 " +cityArray[0]);

        for (int i=0; i<cityArray.length; i++ ){

            System.out.println("Printing Array in Loop "+ cityArray[i] );

        }

        //ADVANCED FOR LOOP
        //TODO  for (Datatype varName : Array/Collection){ CODE }

        for(String var : cityArray){

            System.out.println("Printing Advanced  Loop "+var);
        }

 //SYNTAX : Datatype varName []= {value1,value2,value3........};
        int marks []={54,56,32,67,78,46,99,34,65,87,23,78};

        for (int i=0; i< marks.length; i++){

            System.out.println("Printing Marks .."+marks[i]);
        }

        for (int var : marks){

            System.out.println("Printing marks in Advanced loop "+var);
        }


    }
}
