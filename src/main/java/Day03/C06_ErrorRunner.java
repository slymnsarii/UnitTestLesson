package Day03;

public class C06_ErrorRunner {
    public static void main(String[] args) {

        //divide method'u 5 ve 0 parametreleri ile cagrilinca Exception firlatir
        C06_Error obj=new C06_Error(); //bu objeyi kullanarak divide method'unu cagriyorum
        obj.divide(5,0);
    }
}
