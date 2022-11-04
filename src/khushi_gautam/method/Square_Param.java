package khushi_gautam.method;

public class Square_Param {
    // todo access_specifier return_type method_name(datatype varName1, Datatype varName2,..){CODE}
    public int square(int a){
        int code= a*a;
        return code;
    }

    public static void main(String[] args) {
        Square_Param obj= new Square_Param();
        int prove = obj.square(19);
        System.out.println(prove);
    }
}
