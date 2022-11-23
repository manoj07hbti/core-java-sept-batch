package khushi_gautam.oops.polymorphism;

public class Country extends IndiaOverriding {
    public void parliamentMembers() {
        String president = "Mrs.Dropati Murmu";
        String VicePresident = " Jagdeep Dhankar";
        String primeMinister = "Mr.Narendra Modi";
        String chiefMinister = "Yogi Aditya Nath";
        System.out.println("This is parliament members list");
        System.out.println("--------------------------------");
        System.out.println("president: " +president );
        System.out.println("VicePresident: "+VicePresident);
        System.out.println("primeMinister: "+primeMinister);
        System.out.println("chiefMinister: "+chiefMinister);
        System.out.println("   ");
    }
    public void parliamentMembers(String COM){
        String a="Narendra Modi";
        String b="Shri Ram Hath singh";
        String c="shri Amit Shah";
        String d="Shri Nitin Jairam";
        System.out.println(" councilOfMinisters");
        System.out.println("---------------------");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println("  ");
    }
    public void parliamentMembers(String S,String n){
        String UP="Yogi Aditya Nath";
        String Uttrakhand="Pushkar Singh Dhami";
        String Delhi="Arvind Kejriwal";
        String Rajisthan="Ashok Gehlot";
        System.out.println("State bias Chief Ministers");
        System.out.println("------------------------------");
        System.out.println("Up: "+UP);
        System.out.println("Uttrakhand: "+ Uttrakhand);
        System.out.println("Delhi: "+Delhi);
        System.out.println("Rajisthan: "+Rajisthan);
        System.out.println("  ");
    }
    public  void parliamentMembers(int n, String s){
        String G1="Anandiben Patel";
        String G2="Rm Naik";
        String G3="Dr.Aziz Qureshi";
        String G4="Banwari lal Joshi";
        String G5=" T.V.Rajeshwar";
        System.out.println("Governors list");
        System.out.println("-------------------");
        System.out.println("1: "+G1);
        System.out.println("2: "+G2);
        System.out.println("3: "+G3);
        System.out.println("4: "+G4);
        System.out.println("5: "+G5);
        System.out.println("  ");
    }

    public static void main(String[] args) {
        Country obj= new Country();
        obj.parliamentMembers();
        obj.parliamentMembers(5,"list");
        obj.parliamentMembers("c");
        obj.parliamentMembers("state","name");
        obj.india();
    }

}
