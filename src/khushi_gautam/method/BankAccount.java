package khushi_gautam.method;

public class BankAccount {
        // todo    Member function or method -- capabilities
        //todo Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        public void OpenAccount(){
            System.out.println("Open Account");
            long AccountNo= 5643876l ;
            String Name="  Rupa  ";
            String address="  Jamalpur,Aligarh  ";
            long mobileNo=  9888888888l  ;
            System.out.println(AccountNo + Name + address + mobileNo);
        }
        public void CloseAccount(){
            System.out.println("Close Account");
            long AccountNo= 75797237l ;
            String Name="  Rohit  ";
            String address="  Tundla,Firozabad  ";
            long mobileNo=  6666666666l  ;
            System.out.println(AccountNo + Name + address + mobileNo);
        }
        public static void main(String[] args) {
            BankAccount obj = new BankAccount();
            obj.OpenAccount();
            obj.CloseAccount();
        }

}
