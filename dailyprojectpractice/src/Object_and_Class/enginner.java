package Object_and_Class;

public class enginner {

    String collage;
    String name;
    int marks;
    String place;

    public enginner(String collage, String name, int marks, String place) {
        this.collage = collage;
        this.name = name;
        this.marks = marks;
        this.place = place;
    }
    public static void main(String args[]){

        enginner data = new enginner("IIT Bombay","Rajat",60,"bombay");
          System.out.println("collage:"+data.collage +"name:"+data.name +"marks:"+data.marks +"place:"+data.place );




    }
}
