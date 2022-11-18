package khushi_gautam.oops_abstraction.inheritance;

public class District extends State_District {
    public void block(){
        String T="Tappal";
        String C="Chandaus";
        String K="Khair";
        String J="Jawan";
        System.out.println("Aligarh district");
        System.out.println("Block:- " + T +"," + C + ","+ K +","+ J );
        System.out.println("******************************************************");
    }
    public void Goa_State(){
        System.out.println("I am a state");
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        District obj= new District();
        obj.block();
        obj.UP_State();
        obj.Maharashtra_State();
        obj.Goa_State();
        obj.India();
    }
}
