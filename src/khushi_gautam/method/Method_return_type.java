package khushi_gautam.method;

public class Method_return_type {
    // todo syntax: access_specifier return_type method_name(parameter){..CODE..)
    public int code(){
        int n = 3;
        int cube = n*n*n;
        return cube;
    }

    public static void main(String[] args) {
        Method_return_type obj= new Method_return_type();
        int answer=obj.code();
        System.out.println(answer);
    }
}
