package class_and_object;

public class PersonParameter {
    String religion;
    String language;

    public PersonParameter(String religion, String language) {
        this.religion = religion;
        this.language = language;
    }

    public static void main(String[] args) {
        PersonParameter person=new PersonParameter("Hindu","Hindi");
        System.out.println("Religion="+person.religion+", Language="+person.language);

        PersonParameter person2=new PersonParameter("Muslim","Arbi");
        System.out.println("Religion="+person2.religion+", Language="+person2.language);

        PersonParameter person3=new PersonParameter("Christian","English");
        System.out.println("Religion="+person3.religion+", Language="+person3.language);

        PersonParameter person4=new PersonParameter("Sikkh","Punjabi");
        System.out.println("Religion="+person4.religion+", Language="+person4.language);
    }
}
