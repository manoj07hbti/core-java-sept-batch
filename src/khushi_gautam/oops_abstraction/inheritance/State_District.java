package khushi_gautam.oops_abstraction.inheritance;

public class State_District {
    public void UP_State(){
        String a = "Aligarh";
        String a1= "Agra";
        String g = "Gaziabad";
        String b = "Bulandshahr";
        System.out.println("UP State");
        System.out.println( "District:- "+a +","+ a1 +","+ g +","+ b);
        System.out.println("  ");
    }

    public void Maharashtra_State(){
        String n = "Nashik";
        String j = "Jalgaon";
        String t = "Thane";
        String d = "Dhule";
        System.out.println("Maharashtra State");
        System.out.println("District:- "+ n +","+ j +","+ t +","+ d);
        System.out.println("  ");
    }
    public void Goa_State(){
        String c = "Canacona";
        String q = "Quepem";
        String p = "Ponda";
        String s = "Satari";
        System.out.println("Goa State");
        System.out.println("District:- "+ c +","+ q +","+ p +","+ s);
        System.out.println("  ");
    }
    protected void India(){
        System.out.println("This is our india ");
    }

    public static void main(String[] args) {
        State_District obj = new State_District();
        obj.UP_State();
        obj.Maharashtra_State();
        obj.Goa_State();
        obj.India();
    }
}
