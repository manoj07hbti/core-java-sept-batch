package my_class_and_object;

import java.util.Scanner;

public class Table {
 String table_Brand;
 int table_price;

 public void table_data(){

  System.out.println("Enter Your Table Brand :");
  table_Brand = new Scanner(System.in).nextLine();
  System.out.println("Enter Your Table Price :");
  table_price = new Scanner(System.in).nextInt();

 }

 public static void main(String args[]) {
  Table obj = new Table();
  obj.table_data();
  System.out.println(" "+obj.table_Brand);
  System.out.println(" "+obj.table_price);

}

}
