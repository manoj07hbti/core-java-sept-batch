package methods_function;

public class Even_Odd_Number {
    // create method
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
public int evenMethod() {
    int number = 100;
    for (int i = 1; i<=100; i++){
        if(i%2==0) {
            System.out.print(i + "," );
        }

    }
    return 0;
    }

    public int oddMethod() {
        int number = 100;
        for (int i = 1; i<=100; i++){
            if(i%2-1==0) {
                System.out.print( i + ",");
            }

        }
        return 0;
    }


    public static void main(String[] args) {
        // Todo : Create object by the constructor
        // ClassName objectName = new ClassName();
        Even_Odd_Number obj = new Even_Odd_Number();
        int output = obj.evenMethod();
        System.out.println(output);

        Even_Odd_Number obj1 = new Even_Odd_Number();
        int output1 = obj1.oddMethod();
        System.out.println(output1);
    }
}
