package khushi_gautam.method;

public class Name_param {
    public String name( String name){
        String massege = name;
        return massege;
    }

    public static void main(String[] args) {
        Name_param obj= new Name_param();
        String answer= obj.name("Harsha is working in Java.");
        System.out.println(answer);
    }
}
