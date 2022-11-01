package Object_and_Class;

public class account_number {
     String account="current";
     int balance= 1000000;
     long mobilenumber= 25695230;
     String bank="swiss bank";
     String country="USA";

     public static void main(String args[]){

          account_number details= new account_number();

          System.out.println(""+details.account);
          System.out.println(""+details.balance);
          System.out.println(""+details.mobilenumber);
          System.out.println(""+details.bank);
          System.out.println(""+details.country);
     }

}
